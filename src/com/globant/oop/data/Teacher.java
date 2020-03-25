package com.globant.oop.data;

import java.util.ArrayList;

public class Teacher {
    private String name;
    private double salary;
    private static ArrayList<Teacher> teacherList = new ArrayList<>();

    public Teacher(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public static ArrayList<Teacher> getTeacherList() {
        return teacherList;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nTeacher Name:" + name;
    }
}
