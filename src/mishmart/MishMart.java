package mishmart;

import employee.CommissionSalesEmployee;
import employee.Employee;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

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
                ServiceClass
                
            }
            
            else if(input == 2)
            {
                
            }
            
            else if(input == 3)
            {
                
            }
            
            else if(input == 4)
            {
                
            }
            
            else {
                
            }
        }
        
    }
    
}
