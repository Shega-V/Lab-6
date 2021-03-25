/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6project;

/**
 *
 * @author dwilso1 & shegavala
 */
public class Student extends Person {

    private String major;
    private double gpa;
  
    public Student(String name, int id, String major, double gpa) {
        super(name, id);
        this.major = major;
        this.gpa = gpa;
        
    }

    /**
     * Get the value of major
     *
     * @return the value of major
     */
    public String getMajor() {
        return major;
    }

    /**
     * Get the value of gpa
     *
     * @return the value of gpa
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * Set the value of major
     *
     * @param major new value of major
     */
    public void setMajor(String major) {
        this.major = major;
    }
    /**
     * Set the value of gpa
     *
     * @param gpa new value of gpa
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    } 

    @Override
    public String toString() {
        return "Student{ " + " student name " +this.getName() + " id " + this.getId() +" major " + this.getMajor() + " gpa " + this.getGpa();
    }
    


}

