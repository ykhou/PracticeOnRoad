package com.kang.baidu0412;


class A {
    private String name = "A";

    A() {
        show();
    }

    public void show() {
        System.out.println("A:" + name);
    }
}

public class B extends A{
    private String name = "B";

    B() {
        show();
    }

    public void show() {
        System.out.println("B:" + name);
    }

    public static void main(String[] args) {
        new B();
    }
}
