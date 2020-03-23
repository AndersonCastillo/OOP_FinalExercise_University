package com.globant.oop.data;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private int id;
    public static ArrayList<Student> studentList= new ArrayList<>();

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = studentList.size() + 1;
    }
}
