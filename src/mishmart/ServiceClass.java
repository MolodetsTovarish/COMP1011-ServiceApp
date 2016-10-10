package mishmart;

import employee.CommissionSalesEmployee;
import employee.Employee;
import employee.HourlyEmployee;
import employee.SalaryEmployee;
import warehouse.Product;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

/**
 *
 * @author Misha
 */
public class ServiceClass {
    public final static int HOURLY_EMPLOYEE = 1;
    public final static int SALARIED_EMPLOYEE = 2;
    public final static int COMMISSIONED_EMPLOYEE = 3;
    
    public static void welcomeMessage()
    {
        System.out.println("Welcome to MishMart, for all your product needs:");
    }
    
    public static String employeeTypeSelectMessage()
    {
       return "an option:\n"
            + "1. Create an hourly employee.\n"
            + "2. Create a salaried employee.\n"
            + "3. Create a commission employee.\n";
    }

    public static void enterEmployees(ArrayList employeeList) {// Have the client enter the employees
        while (ServiceClass.newEmployeeMessage()) {
            Employee employee = ServiceClass.createEmployee();
            // Save employee in the list
            employeeList.add(employee);
            System.out.println();
            System.out.println("The employee was added to the database.");
            System.out.println("Summary:");
            System.out.println(employeeList.toString());
            System.out.println();
        }
    }

    public static Employee createEmployee() {
        String firstName, lastName, address, gender;
        int employeeID, contactNum, year, month, day;
        GregorianCalendar dateOfBirth = new GregorianCalendar();
        
        //Get first name from user input
        firstName = readString("first name");
        
        //Get last name
        lastName = readString("last name");
        
        //Get 
        employeeID = readInt("employee ID", 0, Integer.MAX_VALUE);
        
        //Get 
        contactNum = readInt("contact number", 0, Integer.MAX_VALUE);
        
        //Get 
        address = readString("address");
        
        gender = readString("gender");
        
        //Get
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int currentYear = cal.get(Calendar.YEAR);
        year = readInt( "year", 1900, currentYear - 18);
        
        //Get 
        month = readInt( "month", 1, 12);
        //Get 
        day = readInt( "day", 1, 31);
        
        
        int type = -1;
        Employee employee = null;
        type = readInt( employeeTypeSelectMessage(), 1, 3);
        
        if(type == HOURLY_EMPLOYEE)
            {
               employee = new HourlyEmployee(firstName, lastName, employeeID, contactNum, address, gender, year, month, day);
            }
            
            else if(type == SALARIED_EMPLOYEE)
            {
               employee =  new SalaryEmployee(firstName, lastName, employeeID, contactNum, address, gender, year, month, day);
            }
            
            else if(type == COMMISSIONED_EMPLOYEE)
            {
               employee =  new CommissionSalesEmployee(firstName, lastName, employeeID, contactNum, address, gender, year, month, day);
            }
        // Ask for payment-specific info
        employee.paymentInput();
        return employee;
        
    }

    
    public static String readString(String prompt) {
        Scanner sc = new Scanner(System.in);
        String result = null;
        do {
            inputEmployeeMessage(prompt);
            result = sc.nextLine().trim();
            if (checkString(result)) {
                return result;
            } else { 
               inputErrorMessage();
            }
        } while (true);        
    }
    
    public static int readInt(String prompt, int start, int end) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        do {
            inputEmployeeMessage(prompt);
            if (sc.hasNextInt()) {
                result = sc.nextInt();
                if (result < start || result > end) {
                    rangeErrorMessage(start, end);
                } else
                    return result;
            } else {
               inputErrorMessage();
               sc.next();
            }
        } while (true);        
    }

    private static void rangeErrorMessage(Number start, Number end) {
        System.out.println("The input has to be between "+ start + " and " + end);
    }

    public static double readDouble(String prompt, double start, double end) {
        Scanner sc = new Scanner(System.in);
        double result = 0.0;
        do {
            inputEmployeeMessage(prompt);
            if (sc.hasNextDouble()) {
                result = sc.nextInt();
                if (result < start || result > end) {
                    rangeErrorMessage(start, end);
                } else
                    return result;
            } else {
               inputErrorMessage();
               sc.next(); 
            }
        } while (true);        
    }
        
        
    public static boolean checkString(String data){
        return !data.isEmpty();
    }

    public static boolean newEmployeeMessage()
    {
        int answer = readInt("Enter the data for new employee: 1 - yes, 2 - no?", 1, 2);
        return answer == 1;
    }

    private static void inputEmployeeMessage(String data)
    {
        System.out.println("Please enter " + data + ":");
    }
    private static void inputErrorMessage()
    {
        System.out.println("Invalid input!");
    }


    public static String formatDate(GregorianCalendar date) {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        fmt.setCalendar(date);
        String dateFormatted = fmt.format(date.getTime());
        return dateFormatted;
    }

    public static void main(String[] args) {
        createEmployee();
    }

    public static int displayMenu() {
        return readInt("Choose from following options:\n" +
                "1. Enter employees\n" +
                "2. Search employees\n" +
                "3. Enter products\n" +
                "4. Search products\n" +
                "0. Exit", 0, 4);
    }


    public static void searchEmployees(ArrayList<Employee> employeeList) {
        System.out.println("Searching employees");
        int employeeID = readInt("employee ID", 1, Integer.MAX_VALUE);
        for (Employee emp: employeeList) {
            if (emp.getEmployeeID() == employeeID) {
                System.out.println("Found: " + emp);
                return;
            }
        };
        System.out.println("Not found!");
    }


    public static void enterProducts(ArrayList<Product> productList) {
        System.out.println("Entering products");
    }

    public static void searchProducts(ArrayList<Product> productList) {
        System.out.println("Searching products");
    };

}
