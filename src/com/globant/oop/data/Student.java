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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public static ArrayList<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "\nStudent ID=" + id +
                "\nStudent Name='" + name +
                "\nStudent age=" + age;
    }
}
