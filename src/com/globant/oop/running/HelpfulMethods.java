package com.globant.oop.running;

import com.globant.oop.data.Student;

import java.util.ArrayList;

public  class HelpfulMethods {
    public static ArrayList<Student> studentInit(){
        ArrayList <Student> a = new ArrayList<>();
        return a;
    }
    public static void studentName(){
        System.out.println("Type the name:\n");
    }
}
