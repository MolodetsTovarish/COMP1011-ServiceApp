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
public class HourlyEmployee extends Employee {
    
    private int hoursWorked;
    private double payRate;
    
    //The hourly employee constructor adds hoursWorked and payRate to be used for the hourly emloyee's pay calculation
    public HourlyEmployee(String firstName, String lastName, int employeeID, int contactNum, String address, char gender, int year, int month, int day, int hoursWorked, double payRate){
        
        super(firstName, lastName, employeeID, contactNum, address, gender, year, month, day);
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;

    }
    
    //This method returns the hourly employee's hours worked
    public int getHoursWorked(){
        return hoursWorked;
    }
    
    //This method sets the hourly employee's hours worked
    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    
    //This method returns the hourly employee's pay rate
    public double getPayRate(){
        return hoursWorked;
    }
    
    //This method sets the hourly employee's pay rate
    public void setPayRate(double payRate){
        this.payRate = payRate;
    }
    
    //The payment method for the hourly employee is hours worked * pay rate
    @Override
    public double paymentMethod(){
        return (double)hoursWorked * payRate;
    }
    
    @Override
    public String toString() {
        return super.toString() +
               "\nHours Worked: " + getHoursWorked() +
                "\nPay Rate: " + getPayRate();
                
    }
}
