package employee;

import java.util.Scanner;
import mishmart.ServiceClass;

/**
 *
 * @author Misha
 */
public class SalaryEmployee extends Employee {

    private static final double SALARY_LIMIT = 10000000;
    private double salary;

    public SalaryEmployee(String firstName, String lastName, int employeeID, int contactNum, String address, String gender, int year, int month, int day, double salary) {

        super(firstName, lastName, employeeID, contactNum, address, gender, year, month, day);
        this.salary = salary;

    }

    public SalaryEmployee(String firstName, String lastName, int employeeID, int contactNum, String address, String gender, int year, int month, int day) {
        super(firstName, lastName, employeeID, contactNum, address, gender, year, month, day);
    }

    //This method returns the salary of the salaried employee
    public double getSalary() {
        return salary;
    }

    //This method sets the salary for the salaried employee
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //The payment method for the salaried employee is to return the salary for the year
    @Override
    public double paymentMethod() {
        return salary;
    }

    /**
     * Payment input for use in the service class
     */
    public void paymentInput() {
        this.salary = ServiceClass.readDouble("salary", 1, SALARY_LIMIT);
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nSalary: " + getSalary();
    }
}
