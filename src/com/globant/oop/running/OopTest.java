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
        Teacher.getTeacherList().add(init1);
        Teacher.getTeacherList().add(init2);
        Teacher.getTeacherList().add(init3);
        Teacher.getTeacherList().add(init4);
        Student init5 = new Student("Pablo lopez", 17);
        Student.getStudentList().add(init5);
        Student init6= new Student("Paola Rodriguez", 23);
        Student.getStudentList().add(init6);
        Student init7 = new Student("Laura Gomez", 20);
        Student.getStudentList().add(init7);
        Student init8 = new Student("Luisa Arias", 22);
        Student.getStudentList().add(init8);
        Student init9 = new Student("Cristian Gonzalez", 24);
        Student.getStudentList().add(init9);
        Student init10 = new Student("Pablo Emilio Duque", 21);
        Student.getStudentList().add(init10);
        UniversityClass init11 = new UniversityClass("Calculo", "102", Student.getStudentList(), init2);
        UniversityClass.getClassesList().add(init11);
        ArrayList<Student> etica = new ArrayList<>();
        etica.add(init8);
        etica.add(init9);
        etica.add(init10);
        UniversityClass init12 = new UniversityClass("Etica Profesional", "lab-6", etica, init1);
        UniversityClass.getClassesList().add(init12);
        ArrayList<Student> fisica = new ArrayList<>();
        fisica.add(init5);
        fisica.add(init7);
        fisica.add(init10);
        UniversityClass init13 = new UniversityClass("Fisica","203", fisica,init3);
        UniversityClass.getClassesList().add(init13);
        ArrayList<Student> natacion = new ArrayList<>();
        natacion.add(init8);
        natacion.add(init9);
        natacion.add(init10);
        UniversityClass init14 = new UniversityClass("Natacion","Gym-Piscina 3", natacion,init4);
        UniversityClass.getClassesList().add(init14);
        int i = 1;
        int option = 0;
        int subOption;
        int intValue;
        String stringValue;
        String stringValue2;
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
                    for (Teacher t : Teacher.getTeacherList()) {
                        System.out.println(t.getName());
                    }
                    break;
                case 2:
                    while (subOption!=0){
                        i = 1;
                        System.out.println("\n\n\nNext is the whole University's classes list");
                        System.out.println("\nPress the 'Enter' key after typing the class number you want to print its data\n");
                        for (UniversityClass c : UniversityClass.getClassesList()) {
                            System.out.println(i + ". " + c.getClassName());
                            i++;
                        }
                        System.out.println(i + ". Exit");
                        subOption = console.nextInt();
                        if (subOption<1||subOption>UniversityClass.getClassesList().size()+1){
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
                                System.out.println("\nThe whole data of the selected class is\n\n" + UniversityClass.getClassesList().get(subOption - 1));
                                subOption = 0;
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
                        for (UniversityClass c : UniversityClass.getClassesList()) {
                            System.out.println(i + ". " + c.getClassName());
                            i++;
                        }
                        subOption = console.nextInt();
                        if (subOption<0||subOption>UniversityClass.getClassesList().size()){
                            System.out.println("**      Typed option is wrong please try it again       **");
                        }
                        else {
                            UniversityClass.getClassesList().get(subOption - 1).getClassStudent().add(newStudent);
                            subOption = -777;
                        }
                    }
                    break;
                case 4:
                    System.out.println("We need some information for creating a new Class");
                    HelpfulMethods.askForParameter("name");
                    stringValue = console.nextLine();
                    stringValue = console.nextLine();
                    HelpfulMethods.askForParameter("Class Room");
                    stringValue2 = console.nextLine();
                    while (subOption!=0) {
                        i = 1;
                        System.out.println("\n\nPlease select a teacher from the next teacher's list:");
                        for (Teacher t : Teacher.getTeacherList()) {
                            System.out.println(i + ".   " + t.getName());
                            i++;
                        }
                        subOption = console.nextInt();

                        if (subOption < 1 || subOption > Teacher.getTeacherList().size()) {
                            subOption = -1;
                            System.out.println("**      Typed option is wrong please try it again       **");
                        }
                        else {
                            System.out.println("Teacher successfully added to new class");
                            break;
                        }
                    }
                    Teacher teacherToAdd =  Teacher.getTeacherList().get(subOption - 1);
                    subOption = -1;
                    ArrayList<Student> newStudents = new ArrayList<>();
                    while(subOption!=2) {
                        System.out.println("Do you want to add student/s to new class\n1. yes\n2. no");
                        subOption = console.nextInt();
                        if (subOption<1||subOption>2){
                            System.out.println("**      Typed option is wrong please try it again       **");
                        }
                        else if(subOption==1){
                            i=1;
                            System.out.println("Press the 'Enter' key after typing the student number you want to add");
                            for (Student s : Student.getStudentList()) {
                                System.out.println(i + ". " + s.getName());
                                i++;
                            }
                            i = console.nextInt();
                            if (i < 0 || i >Student.getStudentList().size()){
                                System.out.println("Typed Option is not an student");
                            }
                            else {
                                if(UniversityClass.addedStudentValidation(newStudents,Student.getStudentList().get(i-1))) {
                                    System.out.println("Student successfully added");
                                    newStudents.add(Student.getStudentList().get(i - 1));
                                }
                                else {
                                    System.out.println("Student was already added previously to this class");
                                }
                            }
                        }
                        else {
                            System.out.println("Returning to previous menu");
                        }
                    }
                    UniversityClass newClass = new UniversityClass(stringValue,stringValue2,newStudents,teacherToAdd);
                    UniversityClass.getClassesList().add(newClass);
                    break;
                case 5:
                    while(subOption!=2) {
                        i=1;
                        System.out.println("Press the 'Enter' key after typing the student number you want to add");
                        for (Student s : Student.getStudentList()) {
                            System.out.println(i + ". " + s.getName());
                            i++;
                        }
                        System.out.println(i + ". Exit");
                        subOption = console.nextInt();
                        if (subOption < 0 || subOption >Student.getStudentList().size()+1){
                            System.out.println("**      Typed option is wrong please try it again       **");
                        }
                        else if(subOption == i){
                            System.out.println("Returning to previous menu");
                            break;
                        }
                        else {
                            System.out.println("Classes where " + Student.getStudentList().get(subOption-1).getName() + "is rolled in are:");
                            UniversityClass.printTheStudentClasses(Student.getStudentList().get(subOption-1));
                            break;
                        }
                    }
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
