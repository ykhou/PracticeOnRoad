package com.kang.autumn.kedaxunfei;

import java.util.*;

/*
 * public class Point {
 *   int x;
 *   int y;
 *   public Point(int x, int y) {
 *     this.x = x;
 *     this.y = y;
 *   }
 * }
 */

public class Solution3Ext {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param maze int整型二维数组 迷宫数据 固定为4x4的二维数组，0表示路，可走；1 表示墙，不可通过； 8 表示礼物，是我们的目标
     * @return Point类ArrayList
     */

    public static ArrayList<Point> winMazeGift (int[][] maze) {
        // write code here
        ArrayList<Point> min = new ArrayList<>();
        boolean[][] vis = new boolean[maze.length][maze[0].length];
        int x = 0, y = 0;
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if (maze[i][j] == 8) {
                    x = i;
                    y = j;
                }
            }
        }
        dfs(maze, min, x, y, new ArrayList<Point>(), vis);
        System.out.println("min的size:" + min.size());
        for (Point p :
                min) {
            System.out.print(p.x + ":" + p.y + " ");
        }
        return min;
    }

    public static ArrayList<Point> dfs(int[][] maze, ArrayList<Point> min, int x, int y, ArrayList<Point> cur, boolean[][] vis) {
        for (Point p :
                cur) {
            System.out.print(p.x + ":" + p.y + " ");
        }
        System.out.println();
        if (x < 0 || x >= maze.length || y < 0 || y >= maze[0].length) {
            System.out.println("size:" + min.size() + " " + cur.size());
            if (min.size() == 0 || min.size() > cur.size()) {
                min = new ArrayList<>();
                for (int i = cur.size() - 1; i >= 0; i--) {
                    min.add(cur.get(i));
                }
                System.out.println("min:" + min.size());
            }
            return min;
        }
        boolean flag = false;
        if (maze[x][y] == 1 || vis[x][y] == true) {
            System.out.println("return null");
            return min;
        } else {
            cur.add(new Point(x, y));
            flag = true;
        }

        vis[x][y] = true;
        dfs(maze, min, x - 1, y, cur, vis);
        dfs(maze, min, x, y - 1, cur, vis);
        dfs(maze, min, x + 1, y, cur, vis);
        dfs(maze, min, x, y + 1, cur, vis);
        vis[x][y] = false;
        if (flag) {
            cur.remove(cur.size() - 1);
        }
        return min;
    }

    public static void main(String[] args) {
        int[][] maze = {{0,1,1,1},{0,0,0,1},{1,0,8,1},{1,0,1,1}};
        ArrayList<Point> points = winMazeGift(maze);
    }
}
