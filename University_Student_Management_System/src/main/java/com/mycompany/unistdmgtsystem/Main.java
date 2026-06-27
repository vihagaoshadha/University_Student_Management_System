/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.unistdmgtsystem;

import java.util.Scanner;

public class Main {
    
    public static void menu(){
        System.out.println("===== UNIVERSITY STUDENT MANAGEMENT SYSTEM =====\n\n");
        System.out.println("1.  Add New Student");
        System.out.println("2.  View All Students");
        System.out.println("3.  Search Student by ID");
        System.out.println("4.  Add Course");
        System.out.println("5.  View All Courses");
        System.out.println("6.  Add Marks for a Student");
        System.out.println("7.  Calculate Grade");
        System.out.println("8.  Generate Student Report");
        System.out.println("9.  Save Data to Files");
        System.out.println("10. Load Data from Files");
        System.out.println("11. Exit\n");
        
    }
    
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        UniversityStudentManagementSystem uni1= new UniversityStudentManagementSystem();
                         // menu
        int choice=1;
        boolean menuLoop =true;
        
        
        while(menuLoop){
            
            menu();
            System.out.println("Enter Your choice :");
            choice = scanner.nextInt();
            try{
                switch(choice){
                    case 1:
                        uni1.addStudent();
                        
                        break;
                    case 2:
                        uni1.viewAllStudents();
                        break;
                        
                    case 3: 
                        uni1.searchStudentById();
                        break;
                    case 4: 
                        uni1.addCourse();
                        
                        break;
                    case 5: 
                        uni1.viewAllCourses();
                        
                        break;
                    case 6: 
                        uni1.addMarks();
                        
                        break;
                    case 7: 
                        uni1.calculateGPA();
                        break;
                    case 8: 
                        uni1.generateReport();
                        break;
                    case 9: 
                        uni1.saveToFiles();
                        break;
                    case 10: 
                        uni1.loadFromFiles();
                        break;
                    case 11: 
                        menuLoop = false;
                        break;
                        
                        
                }
            
            }
            catch (Exception e){
                System.out.println("Invalid input...  ");
            }
            
            
        }
        
        
    }
}
