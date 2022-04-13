package com.kang.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("数电");
        list.add("通信原理");
        Student s = new Student("Kang", list);

        List<String> unmList = s.getCourses();

        /*
          throws java.lang.UnsupportedOperationException
          should replace with s.addCourse(String course)
        */
        try {
            unmList.add("光纤通信");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // never reached
        System.out.println("Kang's course.length = " + s.getCourses().size());
        for (String str : unmList) {
            System.out.print(str + " ");
        }

        System.out.println();
        s.addCourse("数电");
        System.out.println("Kang's course.length = " + s.getCourses().size());
        for (String str : list) {
            System.out.print(str + " ");
        }
    }
}

class Student {
    private String name;
    private final ArrayList<String> courses;

    public Student(String name, ArrayList<String> courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public String removeCourse(String course) {
        boolean removed = courses.remove(course);

        if (removed) {
            return course;
        } else {
            return null;
        }
    }

    public List<String> getCourses() {
        return Collections.unmodifiableList(courses);
    }
}
