package com.example;

import java.util.List;
import java.util.Scanner;
import com.example.dao.*;
import com.example.model.Student;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        StudentDAO sop = new StudentDAO();
        
        while(!exit){
            System.out.println("*** Student Management System ***");
            System.out.println("1) Add student. ");
            System.out.println("2) Get all student. ");
            System.out.println("3) Update Student (by id). ");
            System.out.println("4) Delete studenet (by id). ");
            System.out.println("5) Exit. ");
            System.out.println(">Enter the option you want to execute.");
            int option = scan.nextInt();
            scan.nextLine();
            switch (option) {
                case 1:
                    System.out.println(">Enter the name of the student.");
                    String name = scan.nextLine();
                    
                    System.out.println("Enter the grade of the student.");
                    String grade = scan.nextLine();
                    
                    System.out.println(">Enter the age of the student.");
                    int age = scan.nextInt();
                    scan.nextLine();

                    Student std = new Student(name, age, grade);
                    sop.addStudent(std);
                    
                    break;
                
                case 2:
                    System.out.println(">All student details: ");
                    
                    List<Student> students = sop.getAllStudents();
                    
                    for(Student student : students){
                        System.out.println(student);
                    }
                    
                    break;
                case 3:
                    System.out.println(">Enter the id of the sudent you want to update: ");
                    int id = scan.nextInt();
                    scan.nextLine();
                    
                    System.out.println(">Enter the name of the student: ");
                    String uname = scan.nextLine();
                    
                    System.out.println(">Enter the grade of the student: ");
                    String ugrade = scan.nextLine();
                    
                    System.out.println(">Enter the age of the student: ");
                    int uage = scan.nextInt();
                    
                    scan.nextLine();
                    
                    Student ustd = new Student(uname, uage, ugrade);
                    ustd.setId(id);
                    sop.updateStudent(ustd);
                    
                    break;
                
                case 4:
                    System.out.println(">Enter the id of the student you want to delete. ");
                    int did =scan.nextInt();
                    sop.deleteStudent(did);
                    break;

                case 5:
                    System.out.println("Thank you!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invaid input!");
                    break;
            }
        }
        scan.close();
    }
}