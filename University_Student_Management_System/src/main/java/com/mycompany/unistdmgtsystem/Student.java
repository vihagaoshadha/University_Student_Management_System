/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unistdmgtsystem;




public class Student extends Person implements Reportable{
    private String studentId;
    private String registrationNumber;
    private String indexNumber;
    private String degreeProgram;
    private int currentYear;
    private int currentSemester;

    public Student(String studentId, String registrationNumber, String indexNumber, String name, String degreeProgram, int currentYear, int currentSemester, String email) {
        super(name, email);
        this.studentId = studentId;
        this.registrationNumber = registrationNumber;
        this.indexNumber = indexNumber;
        this.degreeProgram = degreeProgram;
        this.currentYear = currentYear;
        this.currentSemester = currentSemester;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public void setDegreeProgram(String degreeProgram) {
        this.degreeProgram = degreeProgram;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }


    @Override
    void displayDetails(){
        
    }
    @Override
    public void generateReport(){
        System.out.println("Student ID : "+studentId);
        System.out.println("Registration No : "+registrationNumber);
        System.out.println("Index No : "+indexNumber);
        System.out.println("Name : "+super.getName());
        System.out.println("Degree Program : "+degreeProgram);
        System.out.println("Email : "+super.getEmail());
        System.out.println("Current Year : "+currentYear);
        System.out.println("Current Semester : "+currentSemester);
        
    }
    
  
}
