/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unistdmgtsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author M9
 */
public class FileManager {
    public static ArrayList<Student> retriveStudentData() {
        ArrayList<Student> students=new ArrayList<>();
        try {
            //Create students.txt
            File studentFile = new File("students.txt");
            studentFile.createNewFile();
            //Read data from file using BufferedReader
            try (BufferedReader studentData = new BufferedReader(new FileReader("students.txt"))) {
                String line;
                //Read whole file line by line
                while ((line = studentData.readLine()) != null) {
                    //Data of a one line are seperated to subparts appropriately
                    String[] lineParts = line.split(",");
                    //Implement precautions to solve the string-int conversion problem by cheking whether currentYear and currentSemester fields are empty or not
                    if(lineParts[5].isEmpty()){
                        lineParts[5]="0";
                    }
                    if(lineParts[6].isEmpty()){
                        lineParts[6]="0";
                    }
                    //Create & add student object to arraylist students
                    students.add(new Student(lineParts[0], lineParts[1], lineParts[2], lineParts[3], lineParts[4],
                            Integer.parseInt(lineParts[5]),
                            Integer.parseInt(lineParts[6]), lineParts[7]));
                }
            } catch (Exception exception) {
                System.out.println("Student Data loading error...");
            }
        } catch (Exception exception) {
            System.out.println("Student File creating error...");
        } finally {
            return students;
        }

    }

    public static void storeStudentData(ArrayList<Student> students){
        //Write data to the file using BufferedWriter
        try (BufferedWriter studentData=new BufferedWriter(new FileWriter("students.txt"))) {
            for(Student student:students){
                //Write student data to the file by getting student objects one by one from arraylist students
                studentData.write(student.getStudentId()+","+student.getRegistrationNumber()+","+student.getIndexNumber()+","+student.getName()+","+student.getDegreeProgram()+","+student.getCurrentYear()+","+student.getCurrentSemester()+","+student.getEmail());
                studentData.newLine();
            }
        } catch (Exception e) {
            System.out.println("Student Data writing error...");
        }
    }
}
