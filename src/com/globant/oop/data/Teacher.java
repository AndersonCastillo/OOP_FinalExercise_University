package com.globant.oop.data;

import java.util.ArrayList;

public class Teacher {
    private String name;
    private double salary;
    public static ArrayList<Teacher> teacherList = new ArrayList<>();

    public Teacher(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void addTeacherToList(Teacher in){
        teacherList.add(in);
    }

    public ArrayList<Teacher> getTeacherList() {
        return teacherList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "\nTeacher Name:" + name;
    }
}
