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
    
    public HourlyEmployee(String firstName, String lastName, int employeeID, int contactNum, String address, char gender, int year, int month, int day, int hoursWorked, double payRate){
        
        super(firstName, lastName, employeeID, contactNum, address, gender, year, month, day);
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;

    }
    
    public int getHoursWorked(){
        return hoursWorked;
    }
    
    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    
    public double getPayRate(){
        return hoursWorked;
    }
    
    public void setPayRate(double payRate){
        this.payRate = payRate;
    }
    
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
