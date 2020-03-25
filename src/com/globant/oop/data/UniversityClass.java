package com.globant.oop.data;

import java.util.ArrayList;

public class UniversityClass {
    private String className;
    private String classRoom;
    private Teacher classTeacher;
    private ArrayList<Student> classStudent;
    private static ArrayList<UniversityClass> clasesList = new ArrayList<>();


    public UniversityClass(String className, String classRoom, ArrayList<Student> classStudent, Teacher classTeacher) {
        this.className = className;
        this.classRoom = classRoom;
        this.classStudent = classStudent;
        this.classTeacher = classTeacher;
    }

    public static ArrayList<UniversityClass> getClassesList(){
        return clasesList;
    }

    public String getClassName() {
        return className;
    }

    public ArrayList<Student> getClassStudent() {
        return classStudent;
    }

    public String toString(){
        return  "\nName='" + className +
                "\nClass Room=" + classRoom +"\n"+
                 classTeacher +
                "\n" +classStudent + "\n\n";
    }
}
