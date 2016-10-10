package employee;

import java.util.Scanner;
import mishmart.ServiceClass;

/**
 *
 * @author Misha
 */
public class HourlyEmployee extends Employee {
    
    private int hoursWorked;
    private double payRate;
    
    /**
     * 
     * @param firstName
     * @param lastName
     * @param employeeID
     * @param contactNum
     * @param address
     * @param gender
     * @param year
     * @param month
     * @param day
     * @param hoursWorked
     * @param payRate 
     * The hourly employee constructor adds hoursWorked and payRate to be used for the hourly emloyee's pay calculation
     */
    public HourlyEmployee(String firstName, String lastName, int employeeID, int contactNum, String address, String gender, int year, int month, int day, int hoursWorked, double payRate){
        
        super(firstName, lastName, employeeID, contactNum, address, gender, year, month, day);
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;

    }

    public HourlyEmployee(String firstName, String lastName, int employeeID, int contactNum, String address, String gender, int year, int month, int day) {
        super(firstName, lastName, employeeID, contactNum, address, gender, year, month, day);
    }
    
    
    
    /**
     * 
     * @return int
     * This method returns the hourly employee's hours worked
     */
    public int getHoursWorked(){
        return hoursWorked;
    }
    
    /**
     * 
     * @param hoursWorked 
     * This method sets the hourly employee's hours worked
     */
    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    
    /**
     * 
     * @return double
     * This method returns the hourly employee's pay rate
     */
    public double getPayRate(){
        return hoursWorked;
    }
    
    /**
     * 
     * @param payRate 
     * This method sets the hourly employee's pay rate
     */
    public void setPayRate(double payRate){
        this.payRate = payRate;
    }
    
    /**
     * 
     * @return double
     * The payment method for the hourly employee is hours worked * pay rate
     */
    @Override
    public double paymentMethod(){
        return (double)hoursWorked * payRate;
    }
    
    public void paymentInput(){
        int hoursWorked;
        double payRate;
        
        Scanner innerRead = new Scanner(System.in);
        
        hoursWorked = ServiceClass.readInt("hours worked");
        payRate = ServiceClass.readDouble("pay rate");
    }
    
    @Override
    public String toString() {
        return super.toString() +
               "\nHours Worked: " + getHoursWorked() +
                "\nPay Rate: " + getPayRate();
                
    }
}
