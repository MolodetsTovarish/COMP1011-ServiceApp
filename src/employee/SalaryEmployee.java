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
    
    public double getSalary()
    {
        return salary;
    }
    
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
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
