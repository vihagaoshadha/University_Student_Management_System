/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unistdmgtsystem;

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

}


