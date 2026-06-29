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
    

    //----Setter for marks-----
    public void setMarks(double marks){

        //----- Validate marks ------
        if(marks<0 || marks>100){
            System.out.println("Error! Marks should be between 0 and 100.");
            return;
        }
        this.marks = marks; //set marks if valid

        //----Calculate grade and grade Point based on GPACalculator class----

        this.grade = GPACalculator.calculateGrade(marks);
        this.gradePoint = GPACalculator.calculateGradePoint(marks);

    }

//----Getters for variables----

    public String getStudentId() {
        return studentId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public int getSemester() {
        return semester;
    }

    public double getMarks() {
        return marks;
    }

    public String getGrade() {
        return grade;
    }

    public double getGradePoint() {
        return gradePoint;
    }
  
    //----Method to Convert Result object to a String
    
    public String toFileString() {
        return studentId + "," + courseCode + "," + academicYear + ","
               + semester + "," + marks + "," + grade + "," + gradePoint;
    }
    
    
}
