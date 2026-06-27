/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unistdmgtsystem;

/**
 *
 * @author M9
 */
abstract public class Person {
    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
           // Getters
    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    
    
           // Setters 

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    abstract void displayDetails();
}
