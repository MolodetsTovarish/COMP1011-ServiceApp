/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Misha
 */
public class SalaryEmployee extends Employee {
    
    private double salary;
    
    public SalaryEmployee(String firstName, String lastName, int employeeID, int contactNum, String address, char gender, int year, int month, int day, double salary){
        
        super(firstName, lastName, employeeID, contactNum, address, gender, year, month, day);
        this.salary = salary;

    }
    
    //This method returns the salary of the salaried employee
    public double getSalary()
    {
        return salary;
    }
    
    //This method sets the salary for the salaried employee
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    //The payment method for the salaried employee is to return the salary for the year
    @Override
    public double paymentMethod(){
        return salary;
    }
    
    @Override
    public String toString() {
        return super.toString() + 
               "\nSalary: " + getSalary();
    }
}
