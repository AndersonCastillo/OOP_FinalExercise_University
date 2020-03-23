package com.globant.oop.running;

import com.globant.oop.data.*;

import java.util.ArrayList;
import java.util.Scanner;

public class OopTest {
    public static void main(String[] args) {

        Teacher init1 = new FullTIme_teacher("Jeidy Saenz",1000000,3);
        Teacher init2 = new FullTIme_teacher("Andrea Perez", 900000, 5);
        Teacher init3 = new PartTIme_teacher("Pedro Perez", 1500000,45);
        Teacher init4 = new PartTIme_teacher("Rosa Rojas", 2000000, 28 );
        Teacher.teacherList.add(init1);
        Teacher.teacherList.add(init2);
        Teacher.teacherList.add(init3);
        Teacher.teacherList.add(init4);
        Student init5 = new Student("Pablo lopez", 17);
        Student.studentList.add(init5);
        Student init6= new Student("Paola Rodriguez", 23);
        Student.studentList.add(init6);
        Student init7 = new Student("Laura Gomez", 20);
        Student.studentList.add(init7);
        Student init8 = new Student("Luisa Arias", 22);
        Student.studentList.add(init8);
        Student init9 = new Student("Cristian Gonzalez", 24);
        Student.studentList.add(init9);
        Student init10 = new Student("Pablo Emilio Duque", 21);
        Student.studentList.add(init10);
        UniversityClass init11 = new UniversityClass("Calculo", "102", Student.studentList, init2);
        ArrayList<Student> etica = new ArrayList<>();
        etica.add(init8);
        etica.add(init9);
        etica.add(init10);
        UniversityClass init12 = new UniversityClass("Etica Profesional", "lab-6", etica, init1);
        ArrayList<Student> fisica = new ArrayList<>();
        fisica.add(init5);
        fisica.add(init7);
        fisica.add(init10);
        UniversityClass init13 = new UniversityClass("Fisica","203", fisica,init3);
        ArrayList<Student> natacion = new ArrayList<>();
        fisica.add(init8);
        fisica.add(init9);
        fisica.add(init10);
        UniversityClass init14 = new UniversityClass("Natacion","Gym-Piscina 3", natacion,init4);


        int option = 0;
        int subOption = 0;
        Scanner console = new Scanner(System.in);
        do {
            System.out.println("\n\n***************************************\n****      OOP Final Exercise      ****\n***************************************");
            System.out.println("\n\n            Application Menu\n");
            System.out.println("\nPress the 'Enter' key after typing the option number you want to choose\n");
            System.out.println("1.  Print whole teacher's list");
            System.out.println("2.  Information of a Class");
            System.out.println("3.  Create a new student and add him/her to a class");
            System.out.println("4.  Create a new Class (Including its teacher and students)");
            System.out.println("5.  List all Classes of an student");
            System.out.println("6.  Exit the application");
            option = console.nextInt();

            switch (option){
                case 1:
                    System.out.println("\n\nNext is the Whole teacher's list:");
                    for (Teacher t: Teacher.teacherList) {
                        System.out.println(t.getName());
                    }
                    break;
                case 2:
                    System.out.println("Next is the whole University's classes list");
                    System.out.println("\nPress the 'Enter' key after typing the class number you want to print its data\n");

                    break;
                case 3:
                    System.out.println("c");
                    break;
                case 4:
                    System.out.println("d");
                    break;
                case 5:
                    System.out.println("e");
                    break;
                case 6:
                    System.out.println("\n\nGood Bye");
                    break;
                default:
                    System.out.println("**      Typed option is wrong please try it again       **");
                    break;
            }
        }while (option != 6);
    }
}
