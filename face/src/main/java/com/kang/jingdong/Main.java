package com.kang.jingdong;
// 现有100个任务从1、2、3...100，有10个用户从A、B、C...J，将100个任务分派给10个用户。

// 1. 请通过程序实现分派逻辑，可通过打印日志输出具体分派信息，如输出：任务1分派给了用户A
// 2. 每个用户有2个状态 在线和下线。只有当状态为在线时，系统才可分派任务；请将10个用户随机生成在线或者下线状态，进行任务分派，保证所有任务均可分派到人。

import java.util.*;

// 必须定义 `ShowMeBug` 入口类和 `public static void main(String[] args)` 入口方法
public class Main {
    public static void main(String[] args) {
        // 1. 生成10个用户，随机状态
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User tempUser = new User(i, !(Math.random() > 0.5));
            userList.add(tempUser);
        }

        // 2. 找到在线用户，分配任务
        int task = 100;
        while (task-- > 0) {
            int userId = getRandomUser(userList);
            // 3. 每分配到一个任务，就打印一条记录
            System.out.println(userId + "分配了" + task + "号任务");
        }
        // System.out.println("Hello World!");
    }

    static class User {
        private final int id;
        private final boolean isOnline;

        public User(int id, boolean isOnline) {
            this.id = id;
            this.isOnline = isOnline;
        }

        public int getId() {
            return this.id;
        }

        public boolean getIsOnline() {
            return this.isOnline;
        }
    }

    private static int getRandomUser(List<User> userList) {
        boolean flag = false;
        int index = (int)(Math.random() * 10);
        int id = 0;
        while (!flag) {
            User tempUser = userList.get(index);
            flag = tempUser.getIsOnline();
            id = tempUser.getId();
            index = (int)(Math.random() * 10);
        }
        return id;
    }
}

