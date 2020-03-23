package com.globant.oop.data;

import java.util.ArrayList;

public class UniversityClass {
    private String className;
    private String classRoom;
    private ArrayList<Student> classStudent;
    private Teacher classTeacher;

    public UniversityClass(String className, String classRoom, ArrayList<Student> classStudent, Teacher classTeacher) {
        this.className = className;
        this.classRoom = classRoom;
        this.classStudent = classStudent;
        this.classTeacher = classTeacher;
    }
}
