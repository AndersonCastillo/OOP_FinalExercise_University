package com.globant.oop.data;

import java.util.ArrayList;

public class FullTIme_teacher extends Teacher {
    private double salaryBase;
    private int experienceYears;
    public FullTIme_teacher(String name, double salary, int exp) {
        super(name, salary*(exp*1.1));
        this.salaryBase =salary;
        this.experienceYears = exp;
    }

    public double getSalaryBase() {
        return salaryBase;
    }

    public void setSalaryBase(float salaryBase, int experience) {
        this.salaryBase = salaryBase;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

}
