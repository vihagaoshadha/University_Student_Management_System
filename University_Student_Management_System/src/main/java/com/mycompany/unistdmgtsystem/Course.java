/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unistdmgtsystem;

/**
 *
 * @author M9
 */
public class Course {
    private String courseCode;
    private String courseName;
    private int credits;
    private int academicYear;
    private int semester;

    public Course(String courseCode, String courseName, int credits, int academicYear, int semester) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.academicYear = academicYear;
        this.semester = semester;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public int getSemester() {
        return semester;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setAcademicYear(int academicYear) {
        this.academicYear = academicYear;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    public void displayDetails(){
        System.out.println("Course code : "+courseCode);
        System.out.println("Course Name : "+courseName);   
        System.out.println("Credits : "+credits);
        System.out.println("Academic Year : " +academicYear );
        System.out.println("Semester : "+semester);
    }

}
