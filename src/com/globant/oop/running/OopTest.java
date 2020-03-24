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
        UniversityClass.clasesList.add(init11);
        ArrayList<Student> etica = new ArrayList<>();
        etica.add(init8);
        etica.add(init9);
        etica.add(init10);
        UniversityClass init12 = new UniversityClass("Etica Profesional", "lab-6", etica, init1);
        UniversityClass.clasesList.add(init12);
        ArrayList<Student> fisica = new ArrayList<>();
        fisica.add(init5);
        fisica.add(init7);
        fisica.add(init10);
        UniversityClass init13 = new UniversityClass("Fisica","203", fisica,init3);
        UniversityClass.clasesList.add(init13);
        ArrayList<Student> natacion = new ArrayList<>();
        natacion.add(init8);
        natacion.add(init9);
        natacion.add(init10);
        UniversityClass init14 = new UniversityClass("Natacion","Gym-Piscina 3", natacion,init4);
        UniversityClass.clasesList.add(init14);
        int i = 1;
        int option = 0;
        int subOption;
        int intValue;
        String stringValue;
        Scanner console = new Scanner(System.in);
        do {
            i = 1;
            subOption =1;
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

            switch (option) {
                case 1:
                    System.out.println("\n\nNext is the Whole teacher's list:");
                    for (Teacher t : Teacher.teacherList) {
                        System.out.println(t.getName());
                    }
                    break;
                case 2:
                    while (subOption!=0){
                        System.out.println("\n\n\nNext is the whole University's classes list");
                        System.out.println("\nPress the 'Enter' key after typing the class number you want to print its data\n");
                        for (UniversityClass c : UniversityClass.clasesList) {
                            System.out.println(i + ". " + c.getClassName());
                            i++;
                        }
                        System.out.println(i + ". Exit");
                        subOption = console.nextInt();
                        i = 1;
                        if (subOption<1||subOption>UniversityClass.clasesList.size()+1){
                            subOption=-1;
                        }else
                            if(subOption==i){
                                subOption = 0;
                            }
                        switch (subOption){
                            case -1:
                                System.out.println("**      Typed option is wrong please try it again       **");
                                break;
                            case 0:
                                System.out.println("\n\nReturn to previous menu");
                                break;
                            default:
                                System.out.println("\nThe whole data of the selected class is\n\n" + UniversityClass.clasesList.get(subOption - 1));
                                break;
                        }
                    }break;
                case 3:
                    System.out.println("We need some information for creating a new student");
                    HelpfulMethods.askForParameter("name");
                    stringValue = console.nextLine();
                    stringValue = console.nextLine();
                    HelpfulMethods.askForParameter("age");
                    intValue = console.nextInt();
                    Student newStudent = new Student(stringValue,intValue);
                    while (subOption!=-777) {
                        System.out.println("Press the 'Enter' key after typing the class number you want to enroll in");
                        for (UniversityClass c : UniversityClass.clasesList) {
                            System.out.println(i + ". " + c.getClassName());
                            i++;
                        }
                        subOption = console.nextInt();
                        if (subOption<0||subOption>UniversityClass.clasesList.size()){
                            System.out.println("**      Typed option is wrong please try it again       **");
                        }
                        else {
                            UniversityClass.clasesList.get(subOption - 1).getClassStudent().add(newStudent);
                            subOption = -777;
                        }
                    }
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
