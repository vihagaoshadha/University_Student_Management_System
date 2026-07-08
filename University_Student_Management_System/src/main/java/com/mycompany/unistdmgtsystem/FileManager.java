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

    // --------------Student--------------------------------
    public static ArrayList<Student> retriveStudentData() {
        ArrayList<Student> students = new ArrayList<>();
        try {
            // Create students.txt
            File studentFile = new File("students.txt");
            studentFile.createNewFile();
            // Read data from file using BufferedReader
            try (BufferedReader studentData = new BufferedReader(new FileReader("students.txt"))) {
                String line;
                // Read whole file line by line
                while ((line = studentData.readLine()) != null) {
                    // Data of a one line are seperated to subparts appropriately
                    String[] lineParts = line.split(",");
                    // Create & add student object to arraylist students
                    students.add(new Student(lineParts[0], lineParts[1], lineParts[2], lineParts[3], lineParts[4],
                            Integer.parseInt(lineParts[5]),
                            Integer.parseInt(lineParts[6]), lineParts[7]));
                }
            } catch (Exception exception) {
                System.out.println("Student Data loading error...");
            }
            return students;
        } catch (Exception exception) {
            System.out.println("Student File creating error...");
            return students;
        }
    }

    public static void storeStudentData(ArrayList<Student> students) {
        // Write data to the file using BufferedWriter
        try (BufferedWriter studentData = new BufferedWriter(new FileWriter("students.txt"))) {
            for (Student student : students) {
                // Write student data to the file by getting student objects one by one from
                // arraylist students
                studentData.write(student.getStudentId() + "," + student.getRegistrationNumber() + ","
                        + student.getIndexNumber() + "," + student.getName() + "," + student.getDegreeProgram() + ","
                        + student.getCurrentYear() + "," + student.getCurrentSemester() + "," + student.getEmail());
                studentData.newLine();
            }
        } catch (Exception e) {
            System.out.println("Student Data writing error...");
        }
    }

    // ----------------Course------------------
    public static ArrayList<Course> retrieveCourseData() {
        ArrayList<Course> courses = new ArrayList<>();
        try {
            // Create courses.txt
            File courseFile = new File("courses.txt");
            courseFile.createNewFile();
            // Read data from file using BufferedReader
            try (BufferedReader courseData = new BufferedReader(new FileReader("courses.txt"))) {
                String line;
                // Read whole file line by line
                while ((line = courseData.readLine()) != null) {
                    // Data of a one line are seperated to subparts appropriately
                    String[] lineParts = line.split(",");
                    // Create & add course object to arraylist courses
                    courses.add(new Course(lineParts[0], lineParts[1], Integer.parseInt(lineParts[2]),
                            Integer.parseInt(lineParts[3]), Integer.parseInt(lineParts[4])));
                }
            } catch (Exception exception) {
                System.out.println("Course Data loading error...");
            }
            return courses;
        } catch (Exception exception) {
            System.out.println("Course File creating error...");
            return courses;
        }
    }

    public static void storeCourseData(ArrayList<Course> courses) {
        // Write data to the file using BufferedWriter
        try (BufferedWriter courseData = new BufferedWriter(new FileWriter("courses.txt"))) {
            for (Course course : courses) {
                // Write course data to the file by getting course objects one by one from
                // arraylist courses
                courseData.write(course.getCourseCode() + "," + course.getCourseName() + "," + course.getCredits() + ","
                        + course.getAcademicYear() + "," + course.getSemester());
                courseData.newLine();
            }
        } catch (Exception e) {
            System.out.println("Course Data writing error...");
        }
    }

    // ---------------Results---------------------
    public static ArrayList<Result> retrieveResults() {
        ArrayList<Result> results = new ArrayList<>();
        try {
            // Create results.txt
            File resultFile = new File("results.txt");
            resultFile.createNewFile();
            // Read data from file using BufferedReader
            try (BufferedReader resultData = new BufferedReader(new FileReader("results.txt"))) {
                String line;
                // Read whole file line by line
                while ((line = resultData.readLine()) != null) {
                    // Data of a one line are seperated to subparts appropriately
                    String[] lineParts = line.split(",");
                    // Create & add result object to arraylist results
                    results.add(new Result(lineParts[0], lineParts[1], Integer.parseInt(lineParts[2]),
                            Integer.parseInt(lineParts[3]), Double.parseDouble(lineParts[4]), lineParts[5],
                            Double.parseDouble(lineParts[6])));
                }
            } catch (Exception exception) {
                System.out.println("Results loading error...");
            }
            return results;
        } catch (Exception exception) {
            System.out.println("Result File creating error...");
            return results;
        }
    }

    public static void storeResults(ArrayList<Result> results) {
        // Write data to the file using BufferedWriter
        try (BufferedWriter resultData = new BufferedWriter(new FileWriter("results.txt"))) {
            for (Result result : results) {
                // Write results to the file by getting result objects one by one from arraylist
                // results
                resultData.write(result.getStudentId() + "," + result.getCourseCode() + "," + result.getAcademicYear()
                        + "," + result.getSemester() + "," + result.getMarks() + "," + result.getGrade() + ","
                        + result.getGradePoint());
                resultData.newLine();
            }
        } catch (Exception e) {
            System.out.println("Results writing error...");
        }
    }
}
