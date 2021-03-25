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
public class Professor extends Person{
    
    private String department;
    private double salary;

    public Professor(String name, int id, String department, double salary) {
        super(name, id);
        this.department = department;
        this.salary = salary;
    }

    /**
     * Get the value of salary
     *
     * @return the value of salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Get the value of department
     *
     * @return the value of department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Set the value of department
     *
     * @param department new value of department
     */
    public void setDepartment(String department) {
        this.department = department;
    }
    
    /**
     * Set the value of salary
     *
     * @param salary new value of salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }   

    @Override
    public String toString() {
        return "Profesor {" + "name   "+ this.getName() + "  id " + this.getId() + " department " + this.getDepartment()+" salary "+this.getSalary() + '}';
    }
    
}
