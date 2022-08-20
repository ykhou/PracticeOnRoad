package com.kang.autumn.Microsoft;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution3 {

    public static void main(String[] args) {
        int[] A = {0, 1, 1};
        int[] B = {1, 2, 3};
        int solution = new Solution3().solution(A, B);
        System.out.println(solution);
    }
    int count = 0;
    int[] load;
    public int solution(int[] A, int[] B) {
        List<List<Integer>> p = new ArrayList<>();
        for(int i = 0; i <= A.length; ++i){
            p.add(new ArrayList<>());
        }
        for(int i = 0; i < A.length; ++i){
            p.get(A[i]).add(B[i]);
            p.get(B[i]).add(A[i]);

        }
        boolean[] visited = new boolean[A.length+1];
        load = new int[A.length + 1];
        bfs(visited,0,p,0);
        return count;
    }
    void bfs(boolean[] visited, int start, List<List<Integer>> p, int step){
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(start);
        visited[start] = true;
        while (!queue.isEmpty()){
            int sz = queue.size();
            for (int i = 0; i < sz; i++) {
                int node = queue.removeFirst();
                for(int x : p.get(node)){
                    if(!visited[x]){
                        queue.addLast(x);
                        visited[x] = true;
                        load[x]++;
                        for(int y : p.get(node)){
                            load[y]++;
                            if(load[y] > 5){
                                load[y] = 1;
                                count++;
                            }
                        }
                        count++;
                    }
                }
            }
        }
        step++;
    }
}
