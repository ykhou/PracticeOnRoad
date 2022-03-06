package com.kang.pdd;

import java.util.*;

public class MainPdd3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        List<List<Integer>> listA = new ArrayList<>(N);
        List<List<Integer>> listB = new ArrayList<>(M);
        for (int i = 0; i < N; i++) {
            int Ai = sc.nextInt();
            int Di = sc.nextInt();
            LinkedList<Integer> list = new LinkedList<>();
            list.add(Ai);
            list.add(Di);
            listA.add(new ArrayList<>(list));
        }
        for (int i = 0; i < M; i++) {
            int Ai = sc.nextInt();
            int Di = sc.nextInt();
            LinkedList<Integer> list = new LinkedList<>();
            list.add(Ai);
            list.add(Di);
            listB.add(new ArrayList<>(list));
        }

        System.out.println();

    }

    public void backTracking(List<List<Integer>> listA, List<List<Integer>> listB, int startIndexA, int startIndexB) {
        if (startIndexB == listB.size()) {
            return;
        }

        for (int i = startIndexB; i < listB.size(); i++) {

        }
    }
}
