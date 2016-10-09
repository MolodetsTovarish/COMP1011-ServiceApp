package employee;

import java.util.Scanner;
import mishmart.ServiceClass;

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
    
    public static void paymentInput(){
        double salary;
        
        Scanner innerRead = new Scanner(System.in);
        
        salary = ServiceClass.readDouble(innerRead, "salary");
    }
    
    @Override
    public String toString() {
        return super.toString() + 
               "\nSalary: " + getSalary();
    }
}
