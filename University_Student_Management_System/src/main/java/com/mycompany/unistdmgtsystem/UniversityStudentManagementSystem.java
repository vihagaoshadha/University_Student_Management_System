/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unistdmgtsystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author M9
 */
public class UniversityStudentManagementSystem {
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Course> courses = new ArrayList<>();
    ArrayList<Result> results = new ArrayList<>();
    
    Scanner scanner = new Scanner(System.in);
    
    public void addStudent(){
        System.out.println("\n===== ADD NEW STUDENT =====");
       
        //------------------------------------------------------------
        System.out.println("Enter Student ID :");
        String studentId =scanner.nextLine();
        
        // validation.. check " is the studentId empty ?"
        if(studentId.isEmpty()){
            System.out.println("Student id cannot be empty");
        }
        
       //------------------------------------------------------------
        System.out.println("Enter registration Number :");
        String registrationNumber =scanner.nextLine();
        
        // validation..
        if(registrationNumber.isEmpty()){
            System.out.println("registration Number cannot be empty");
        }  
        
       //------------------------------------------------------------
        System.out.println("Enter index Number :");
        String indexNumber =scanner.nextLine();
        
        // validation..
        if(indexNumber.isEmpty()){
            System.out.println("index Number cannot be empty");
        } 

       //------------------------------------------------------------
        System.out.println("Enter Full Name :");
        String Name =scanner.nextLine();
        
        // validation..
        if(Name.isEmpty()){
            System.out.println("Name cannot be empty");
            return;
        } 
        
       //------------------------------------------------------------
        System.out.println("Enter Email :");
        String email =scanner.nextLine();
        
        // validation..
        if(email.isEmpty()){
            System.out.println("Email cannot be empty");
            return;
        }         
       
       //------------------------------------------------------------       
        System.out.println("Enter degree Program  :");
        String degreeProgram =scanner.nextLine();
        
        // validation..
        if(degreeProgram.isEmpty()){
            System.out.println("degree Program cannot be empty");
            return;
        }   
        
        //------------------------------------------------------------------------
        System.out.println("Enter Current Year  :");
        int currentYear;
        currentYear = scanner.nextInt();
        if(0>currentYear || 5<currentYear){
             System.out.println("Current Year must be between 1-4");
        }
        
        //-------------------------------------------------------------------------
        int currentSemester;
        System.out.println("Enter current Semester :");
        currentSemester = scanner.nextInt();
        if(0>currentSemester || 3<=currentSemester){
             System.out.println("current Semester must be between 1-2");
        }
        
        // save data into arraylist
         students.add(new Student(studentId,registrationNumber,indexNumber,Name,degreeProgram,currentYear,currentSemester,email));
    }
    
          // to view all students in student arrayList 
    public void viewAllStudents(){
        System.out.println("\n===== ALL STUDENTS =====");
        if(students.isEmpty()){
            System.out.println("No Students");
        }
        System.out.println("Total number of students is "+students.size());
        for(Student s : students){
            s.generateReport();
            System.out.println("\n");
        }
    }


    
    public void searchStudentById(){
        System.out.println("\n===== SEARCH STUDENT =====");
        System.out.println("Enter Student ID : ");
        String id= scanner.nextLine();
        Student found = findStudentById(id);
        
        if(found == null){
            System.out.println("Student ID "+id+" not found.");
        }
        else{
            System.out.println("Student Found: ");
            found.generateReport();
        }    
    }
    
    
    public void addCourse(){
        System.out.println("\n===== ADD NEW COURSE =====");
        
        System.out.println("Enter Course Code : ");
        String code = scanner.nextLine();
        if(code.isEmpty()){
            System.out.println("Course code cannot be Empty");
            return;
        }
        if(findCoursebyCode(code) != null){
            System.out.println("Course code "+code+" already exists.");
        }
        
        //-------------------------------------------------------------------------------
        
        System.out.println("Enter Course Name :");
        String name =scanner.nextLine();
        if(name.isEmpty()){
            System.out.println("Course Name cannot be Empty");
            return;
        }
       //-----------------------------------------------------------------------------------        
        System.out.println("Enter Credit : ");
        int credits =0 ;
        try{
            credits = scanner.nextInt();
            if(credits <=0){
                System.out.println("credit should be greater than 0");
                return;
            }
        }
        catch(Exception e){
            System.out.println("credit amount is not valid ");
        }
      //-------------------------------------------------------------------------------------  
        System.out.println("Enter Academy Year");
        int year = 0;
        try{
            year=scanner.nextInt();
            if(year <1 || year>4 ){
                System.out.println("Academy Year must be between (1-4)");
                return;
            }
        }
        catch(Exception e){
            System.out.println("year is not valid ");
        }
        //----------------------------------------------------------------------------
       System.out.println("Enter Academy Year");
        int semester = 0;
        try{
            semester=scanner.nextInt();
            if(semester <1 || semester>2 ){
                System.out.println("semester must be between (1-2)");
            }
        }
        catch(Exception e){
            System.out.println("semester is not valid ");
        }   
        
        
                // save data into arrayList
        
        courses.add(new Course(code,name,credits,year,semester));
    }
        public void viewAllCourses(){
            System.out.println("===== ALL COURSES =====");
            if(courses.isEmpty()){
                System.out.println("No Courses Found.");
            }
            for (Course c : courses){
                c.displayDetails();
            }
        }
        
        
        
        
        
    
    public void updateStudent(){
          System.out.println("\n===== UPDATE STUDENT =====");
          System.out.println("Enter Student ID : ");
          String id= scanner.nextLine();
          Student student = findStudentById(id);
          if(student == null){
                System.out.println("Student not found");
                return;
          } 
          System.out.println("Enter new Name :");
          String name = scanner.nextLine();
          student.setName(name);

          System.out.println("Enter new Email :");
          String email = scanner.nextLine();
          student.setEmail(email);

          System.out.println("Enter new Degree Program :");
          String degree = scanner.nextLine();
          student.setDegreeProgram(degree);

          System.out.println("Enter new Current Year :");
          student.setCurrentYear(scanner.nextInt());

          System.out.println("Enter Current Semester :");
          student.setCurrentSemester(scanner.nextInt());
          scanner.nextLine();

          System.out.println("Studnet updated successfully!.");

    }
    public void deleteStudent(){
         System.out.println("\n===== DELETE STUDENT =====");
         System.out.println("Enter Student ID :");
         String id = scanner.nextLine();
         Student student = findStudentById(id);
         if(student == null) {
            System.out.println("Student not found.");
            return;
         }
         students.remove(student);
         System.out.println("Student deleted successfully.");

    }
    public void updateCourse(){
        
    System.out.println("\n===== UPDATE COURSE =====");
    
    scanner.nextLine(); 

    System.out.print("Enter Course Code : ");
    String code = scanner.nextLine();

    Course course =findCoursebyCode(code);

    if (course == null) {
        System.out.println("Course not found.");
        return;
    }

    System.out.println("Current Course Details");
    course.displayDetails();

    System.out.print("Enter New Course Name : ");
    String name = scanner.nextLine();

    System.out.print("Enter New Credits : ");
    int credits = scanner.nextInt();

    System.out.print("Enter New Academic Year : ");
    int year = scanner.nextInt();

    System.out.print("Enter New Semester : ");
    int semester = scanner.nextInt();
    if (credits <= 0) {
        System.out.println("Credits must be greater than 0.");
        return;
    }

    if (year < 1 || year > 4) {
        System.out.println("Academic Year must be between 1 and 4.");
        return;
    }

    if (semester < 1 || semester > 2) {
        System.out.println("Semester must be between 1 and 2.");
        return;
    }

    course.setCourseName(name);
    course.setCredits(credits);
    course.setAcademicYear(year);
    course.setSemester(semester);

    System.out.println("Course updated successfully.");

    }
    public void deleteCourse(){

    System.out.println("\n===== DELETE COURSE =====");
    scanner.nextLine(); 
    System.out.print("Enter Course Code : ");
    String code = scanner.nextLine();

    Course course = findCoursebyCode(code);

    if (course == null) {
        System.out.println("Course not found.");
        return;
    }

    courses.remove(course);

    System.out.println("Course deleted successfully.");
}

    public void addMarks(){
       
        System.out.println("------Add Marks-----");
         
        //Get Inputs from user
          System.out.println("Enter Student ID:");
          String studentId = scanner.nextLine();
         
          System.out.println("Enter Course Code:");
          String courseCode = scanner.nextLine();

          System.out.println("Enter Marks:");
          double marks = scanner.nextDouble();
         //------------------------------------------------------------------------------------

        // check vaild marks

         if (marks < 0 || marks > 100) {

            System.out.println("Error : Marks must be Between 0 & 100.");
            return;
           }
         // -----------------------------------------------------------------------------------
           // check if both student exists 
           Student Studentfound = findStudentById(studentId);

           // Check if the course exists 
           Course courseFound = findCoursebyCode(courseCode);
           
           // If either student or course is missing,show error
           if (Studentfound == null || courseFound == null){
              System.out.println("Student or Course not found in System");

              return;
        
           }
            //----------------------------------------------------------------------------------
           
           //Check if this student already has marks for this course
           boolean isDuplicate = false;
             for( Result r : results){
                if (r.getStudentId().equals(studentId)  &&  r.getCourseCode().equals(courseCode)) {
                    isDuplicate = true;
                    break;
                }
             }

           if(isDuplicate){
             System.out.println("Marks Already entered for this course.");
             return;
           }

            //---------------------------------------------------------------------------------
             
            //  Save the results to the system
            System.out.println(" Validation Successful. Saving marks...");
            
            // create a new Result object and add it to the list
            results.add(new Result(studentId,courseFound,marks));

            System.out.println("Marks Added Successfully");
        }

        
    public void calculateGPA(){
         Scanner sc = new Scanner(System.in);

    System.out.println("\n===== GPA Calculation =====");

    System.out.print("Enter Student ID: ");
    String studentId = sc.nextLine();

    Student student = findStudentById(studentId);

    if (student == null) {
        System.out.println("Student not found!");
        return;
    }

    System.out.print("Enter Academic Year: ");
    int year = sc.nextInt();

    System.out.print("Enter Semester: ");
    int semester = sc.nextInt();

    double semesterGPA = GPACalculator.calculateSemesterGPA(
            results,
            courses,
            studentId,
            year,
            semester);

    double overallGPA = GPACalculator.calculateOverallGPA(
            results,
            courses,
            studentId);

    System.out.println("\n========== GPA RESULT ==========");
    System.out.println("Student ID        : " + student.getStudentId());
    System.out.println("Student Name      : " + student.getName());
    System.out.println("Degree Program    : " + student.getDegreeProgram());
    System.out.println("Academic Year     : " + year);
    System.out.println("Semester          : " + semester);
    System.out.printf("Semester GPA      : %.2f%n", semesterGPA);
    System.out.printf("Overall GPA       : %.2f%n", overallGPA);
    System.out.println("Academic Standing : "
            + GPACalculator.getAcademicStanding(overallGPA));
    }
    public void generateReport(){
         System.out.println("\n===GENERATE STUDENT ACADEMIC REPORT===");
         System.out.println("Enter Student ID: ");
         String studentId = scanner.nextLine().trim();
         
         //filtering: find the Student in System(validation)
          Student student = findStudentById(studentId);
          if(student == null){
              System.out.println("Error: Student with ID " + studentId + "not found!");
              return;
          }
          // 2. FILTERING: Filter only the results of this specific student from all system results
          
      }
    public void saveToFiles(){
        // amantha
    }
    public void loadFromFiles(){
        // amantha
    }    

    private Student findStudentById(String id) {
        for (Student s : students) {
                if(s.getStudentId().equals(id)) {
                    return s;
            }
        }
        return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Course findCoursebyCode(String code) {
     

    for (Course c : courses) {
        if (c.getCourseCode().equalsIgnoreCase(code)) {
            return c;
        }
    }

    return null;

    }
}

