package com.kang.tecentmusic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public List<List<Integer>> resList = new ArrayList<>();
    public ArrayList<TreeNode> deleteLevel (TreeNode root, ArrayList<Integer> a) {
        // write code here
        if (node == null) return null;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(node);

        while (!que.isEmpty()) {
            List<Integer> tmpList = new ArrayList<>();
            int len = que.size();

            while (len > 0) {
                TreeNode tmpNode = que.poll();
                tmpList.add(tmpNode.val);

                if (tmpNode.left != null) que.offer(tmpNode.left);
                if (tmpNode.right != null) que.offer(tmpNode.right);
                len--;
            }
            resList.add(tmpList);
        }
    }
}
