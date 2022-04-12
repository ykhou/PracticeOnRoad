package com.kang.baidu0412;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String > mutable = new ArrayList<>();
        mutable.add("苹果");
        mutable.add("西瓜");
        List<String > immutable = Collections.unmodifiableList(mutable);
        mutable.add("橘子");
        System.out.println(mutable);
        System.out.println(immutable);
    }
}
