package employee;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Misha
 */
public abstract class Employee {
    
    private String firstName, lastName, address;
    private int employeeID, contactNum;
    private char gender;
    private GregorianCalendar dateOfBirth, today;
    
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
     * 
     * The constructor for the base Employee class, which has all the basic information that will be extended to all the child employee classes
     */
    public Employee(String firstName, String lastName, int employeeID, int contactNum, String address, char gender, int year, int month, int day) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.today = new GregorianCalendar();
        this.dateOfBirth = new GregorianCalendar();
        this.dateOfBirth.set(Calendar.YEAR, year);
        this.dateOfBirth.set(Calendar.MONTH, month-1);
        this.dateOfBirth.set(Calendar.DATE,day);
        this.contactNum = contactNum;
        this.address = address;
        this.gender = gender;
    }
    
    /**
     * 
     * @return String
     * This method returns the employee's first name
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * 
     * @param firstName 
     * This method sets the employee's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /**
     * 
     * @return String
     * This method returns the employee's last name
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * 
     * @param lastName 
     * This method sets the employee's last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * 
     * @return String
     * This method returns the employee's full name
     */
    public String getFullName()
    {
        return firstName + " " + lastName;
    }
    
    
    /**
     * 
     * @return int
     * This method returns the employee's ID number
     */
    public int getEmployeeID() {
        return employeeID;
    }
    
    //This method sets the employee's ID
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    
    //This method returns the employee's birthday
    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }
    
    //This method sets the employee's birthday
    public void setDateOfBirth(int year, int month, int day) {
        this.dateOfBirth = new GregorianCalendar();
        this.dateOfBirth.set(Calendar.YEAR, year);
        this.dateOfBirth.set(Calendar.MONTH, month-1);
        this.dateOfBirth.set(Calendar.DATE,day);
    }
    
    //This method subtracts the year of today's date from the year of the employee's birthday to get their age
    public int getAge() {
        return today.get(Calendar.YEAR) - this.dateOfBirth.get(Calendar.YEAR);
    }
    
    //This method returns the employee's address
    public String getAddress() {
        return address;
    }
    
    //This method sets the employee's address
    public void setAddress(String address) {
        this.address = address;
    }
    
    //This method returns the employee's gender
    public char getGender() {
        return gender;
    }
    
    //This method sets the employee's gender
    public void setGender(char gender) {
        this.gender = gender;
    }
    
    /**
     * 
     * @return int
     * This method returns the employee's contact number
     */
    public int getContactNumber() {
        return contactNum;
    }
    
    /**
     * 
     * @param contactNum 
     * This method sets the employee's contact number
     */
    public void setContactNumber(int contactNum) {
        this.contactNum = contactNum;
    }
    
    /**
     * 
     * @return double
     * 
     * An abstract payment method that can be overriden in the child classes to get their unique pay calculations
     */
    public abstract double paymentMethod();
    
    //Returns the information about the employee in a string
    public String toString() {
        return "Name:" + getFullName() +
                "\nAge: " + getAge() +
                "\nBirthday: " + getDateOfBirth() +
                "\nContact Number: " + getContactNumber() +
                "\nGender: " + getGender() +
                "\nAddress: " + getAddress() +
                "\nEmployee ID: " + getEmployeeID();
    }
   
}
