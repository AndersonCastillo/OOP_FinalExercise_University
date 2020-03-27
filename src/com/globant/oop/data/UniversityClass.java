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

    public static void printTheStudentClasses(Student x){
        int i = 1;
        for (UniversityClass searchClass: clasesList){
            for(Student compare: searchClass.getClassStudent()){
                if(compare.getId() == x.getId()){
                    System.out.println(i + ".   " + searchClass.className);
                    i++;
                }
            }
        }
    }

    public String getClassName() {
        return className;
    }

    public static boolean addedStudentValidation(ArrayList<Student> listing, Student compare){
        int j = 0;
        System.out.println(listing.size());
        for (Student inList: listing){
            if (inList.getId() == compare.getId()){
                j++;
            }
        }
        return j == 0;
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
