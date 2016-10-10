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
    public final static int ENTER_EMPLOYEES_CHOICE = 1;
    public final static int SEARCH_EMPLOYEES_CHOICE = 2;
    public final static int ENTER_PRODUCTS_CHOICE = 3;
    public final static int SEARCH_PRODUCTS_CHOICE = 4;
    public final static int EXIT_CHOICE = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*CommissionSalesEmployee emp1 = new CommissionSalesEmployee("Fe", "Fe", 33, 33, "Street", 'm', 1980, 3, 13, 50, 14.0);
        System.out.println(emp1);
        System.out.println(emp1.getAge());
        */
        ArrayList<Product> productList = new ArrayList();
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        
        ServiceClass.welcomeMessage();
        int choice = 0;
        do {
            choice = ServiceClass.displayMenu();
            switch (choice) {
                case ENTER_EMPLOYEES_CHOICE:
                    ServiceClass.enterEmployees(employeeList);
                    break;
                case SEARCH_EMPLOYEES_CHOICE:
                    ServiceClass.searchEmployees(employeeList);
                    break;
                case ENTER_PRODUCTS_CHOICE:
                    ServiceClass.enterProducts(productList);
                    break;
                case SEARCH_PRODUCTS_CHOICE:
                    ServiceClass.searchProducts(productList);
                    break;
                case EXIT_CHOICE:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (choice != EXIT_CHOICE);

    }
    
}
