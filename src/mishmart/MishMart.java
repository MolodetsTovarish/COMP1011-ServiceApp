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
        Scanner read = new Scanner(System.in);
        int input;
        boolean keepGoing = true;
        
        
        ServiceClass.welcomeMessage();
        
        while (keepGoing) {
            ServiceClass.employeeSelectMessage();
            input = read.nextInt();
            
            if(input == 1)
            {
                
                ServiceClass.createEmployee();
                HourlyEmployee.paymentInput();
                
            }
            
            else if(input == 2)
            {
                ServiceClass.createEmployee();
                SalaryEmployee.paymentInput();
            }
            
            else if(input == 3)
            {
                ServiceClass.createEmployee();
                CommissionSalesEmployee.paymentInput();
            }
            
            else if(input == 4)
            {
                keepGoing = false;
            }
            
            else {
                System.out.println("Please select options 1 - 4");
            }
        }
        
    }
    
}
