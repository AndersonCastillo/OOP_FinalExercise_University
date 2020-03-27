package com.globant.oop.data;

public class PartTIme_teacher extends Teacher {
    private double salaryBase;
    private int hoursPerWeek;
    public PartTIme_teacher(String name, double salary, int hour) {
        super(name, (salary/240)*hour);
        this.salaryBase =salary;
        this.hoursPerWeek = hour;
    }
}
