/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unistdmgtsystem;

/**
 *
 * @author M9
 */
public class Result {
    //---- private variables----

    private String studentId;
    private String courseCode;
    private int academicYear;
    private  int semester;
    private double marks;
    private String grade;
    private double gradePoint;

    // ---- Constructo 01 -----
    public Result(String studentId, Course course, double marks){
        this.studentId = studentId;
        this.courseCode = course.getCourseCode();    //get course code from course
        this.academicYear = course.getAcademicYear(); //get academic year from course
        this.semester = course.getSemester();         //get semester from course
        setMarks(marks);
    }

    //---- Constructor with all parameters -----
          public Result(String studentId, String courseCode,int academicYear, int semester,double marks, String grade, double gradePoint) {
 
        this.studentId    = studentId;
        this.courseCode   = courseCode;
        this.academicYear = academicYear;
        this.semester     = semester;
        this.marks        = marks;
        this.grade        = grade;
        this.gradePoint   = gradePoint;
    }
    
}
