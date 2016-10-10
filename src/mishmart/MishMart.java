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
        
        //Product and Employee array lists for storing Product and Employee objects
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        
        //Displays welcome message
        ServiceClass.welcomeMessage();
        
        //User picks what action they want to do by inputing the integers that correspond with the choices
        int choice = 0;
        do {
            choice = ServiceClass.displayMenu();
            switch (choice) {
                //For creating employees
                case ENTER_EMPLOYEES_CHOICE:
                    ServiceClass.enterEmployees(employeeList);
                    break;
                //For searching for existing employees
                case SEARCH_EMPLOYEES_CHOICE:
                    ServiceClass.searchEmployees(employeeList);
                    break;
                //For creating products
                case ENTER_PRODUCTS_CHOICE:
                    ServiceClass.enterProducts(productList);
                    break;
                //For searching for existing products
                case SEARCH_PRODUCTS_CHOICE:
                    ServiceClass.searchProducts(productList);
                    break;
                //Ends the program
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
