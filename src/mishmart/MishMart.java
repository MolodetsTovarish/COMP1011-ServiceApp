package mishmart;

import employee.CommissionSalesEmployee;
import employee.Employee;
import employee.HourlyEmployee;
import employee.SalaryEmployee;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;
import warehouse.Product;

/**
 *
 * @author Misha
 */
public class MishMart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*CommissionSalesEmployee emp1 = new CommissionSalesEmployee("Fe", "Fe", 33, 33, "Street", 'm', 1980, 3, 13, 50, 14.0);
        System.out.println(emp1);
        System.out.println(emp1.getAge());
        */
        ArrayList<Employee> employeeList = new ArrayList();
        ArrayList<Product> productList = new ArrayList();       
        boolean keepGoing = true;
        
        
        ServiceClass.welcomeMessage();
        
        while (ServiceClass.newEmployeeMessage()) {
            Employee employee = ServiceClass.createEmployee();
            if (employee == null) {
                keepGoing = false;
            } else {
                employee.paymentInput();
                employeeList.add(employee);
                System.out.println();
                System.out.println("The employee was added to the database.");
                System.out.println("Summary:");
                System.out.println(employeeList.toString());
                System.out.println();
            }        
        }
 
        
    }
    
}
