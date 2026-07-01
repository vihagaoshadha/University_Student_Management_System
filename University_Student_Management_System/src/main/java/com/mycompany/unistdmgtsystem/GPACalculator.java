/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unistdmgtsystem;

import java.util.ArrayList;

/**
 *
 * @author M9
 */

public class GPACalculator {
      // Calculate Grade
    public static String calculateGrade(double marks) {

        if (marks >= 85)
            return "A";
        else if (marks >= 75)
            return "B+";
        else if (marks >= 70)
            return "B";
        else if (marks >= 65)
            return "C+";
        else if (marks >= 60)
            return "C";
        else if (marks >= 55)
            return "D+";
        else if (marks >= 50)
            return "D";
        else
            return "E";
    }
     // Calculate Grade Point
    public static double calculateGradePoint(double marks) {

        if (marks >= 85)
            return 4.0;
        else if (marks >= 75)
            return 3.7;
        else if (marks >= 70)
            return 3.3;
        else if (marks >= 65)
            return 3.0;
        else if (marks >= 60)
            return 2.7;
        else if (marks >= 55)
            return 2.3;
        else if (marks >= 50)
            return 2.0;
        else
            return 0.0;
    }
// Semester GPA
    public static double calculateSemesterGPA(ArrayList<Result> results,
                                              ArrayList<Course> courses,
                                              String studentId,
                                              int year,
                                              int semester) {

        double totalPoints = 0;
        int totalCredits = 0;

        for (Result r : results) {

            if (r.getStudentId().equals(studentId)
                    && r.getAcademicYear() == year
                    && r.getSemester() == semester) {

                for (Course c : courses) {

                    if (c.getCourseCode().equals(r.getCourseCode())) {

                        totalPoints += r.getGradePoint() * c.getCredits();
                        totalCredits += c.getCredits();
                        break;
                    }
                }
            }
        }

        if (totalCredits == 0) {
            return 0;
        }

        return totalPoints / totalCredits;
    }

    // Overall GPA
    public static double calculateOverallGPA(ArrayList<Result> results,
                                             ArrayList<Course> courses,
                                             String studentId) {

        double totalPoints = 0;
        int totalCredits = 0;

        for (Result r : results) {

            if (r.getStudentId().equals(studentId)) {

                for (Course c : courses) {

                    if (c.getCourseCode().equals(r.getCourseCode())) {

                        totalPoints += r.getGradePoint() * c.getCredits();
                        totalCredits += c.getCredits();
                        break;
                    }
                }
            }
        }

        if (totalCredits == 0) {
            return 0;
        }

        return totalPoints / totalCredits;
    }

    // Academic Standing
    public static String getAcademicStanding(double gpa) {

        if (gpa >= 3.70)
            return "First Class";
        else if (gpa >= 3.30)
            return "Second Upper";
        else if (gpa >= 3.00)
            return "Second Lower";
        else if (gpa >= 2.00)
            return "General Pass";
        else
            return "Academic Warning";
    }
}


