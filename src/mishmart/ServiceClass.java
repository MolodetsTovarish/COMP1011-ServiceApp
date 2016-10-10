package mishmart;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Misha
 */
public class ServiceClass {
    public final static int HOURLY_EMPLOYEE = 1;
    public final static int SALARIED_EMPLOYEE = 2;
    public final static int COMMISSIONED_EMPLOYEE = 3;
    public final static int NO_EMPLOYEE = 4;
    
    public static void welcomeMessage()
    {
        System.out.println("Welcome to MishMart, for all your product needs:");
    }
    
    public static String employeeSelectMessage()
    {
       return "Please enter an option:\n"
            + "1. Create an hourly employee.\n"
            + "2. Create a salaried employee.\n"
            + "3. Create a commission employee.\n"
            + "4. Exit;";
    }
    
    public static void createEmployee() {
        String firstName, lastName, address;
        int employeeID, contactNum, year, month, day;
        char gender;
        GregorianCalendar dateOfBirth, today;

        Scanner innerRead = new Scanner(System.in);
        
        //Get first name from user input
        firstName = readString(innerRead, "first name");
        
        //Get last name
        lastName = readString(innerRead, "last name");
        
        //Get 
        employeeID = readInt(innerRead, "employee ID");
        
        //Get 
        contactNum = readInt(innerRead, "contact number");
        
        //Get 
        address = readString(innerRead, "address");
        
        //Get 
        year = readInt(innerRead, "year");
        
        //Get 
        month = readInt(innerRead, "month");        
        //Get 
        day = readInt(innerRead, "day");
        
        do {
        
        input = readInt(innerRead, employeeSelectMessage());
        
        
        if(input == HOURLY_EMPLOYEE)
            {
               return new HourlyEmployee(firstName, lastName, employeeID, contactNum, address, gender, year, month, day);                
            }
            
            else if(input == SALARIED_EMPLOYEE)
            {
               return new SalaryEmployee(firstName, lastName, employeeID, contactNum, address, gender, year, month, day);
            }
            
            else if(input == COMMISSIONED_EMPLOYEE)
            {
               return new CommissionSalesEmployee(firstName, lastName, employeeID, contactNum, address, gender, year, month, day);
            }
            
            else if(input == NO_EMPLOYEE)
            {
               return null;
            }            
        }
      } while (input > 4 || input < 1)
        
    }

    
    public static String readString(Scanner sc, String prompt) {
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
    
    public static int readInt(Scanner sc, String prompt) {
        int result = 0;
        do {
            inputEmployeeMessage(prompt);
            if (sc.hasNextInt()) {
                return sc.nextInt();               
            } else {
               inputErrorMessage();
               sc.next();
            }
        } while (true);        
    }
    
    public static double readDouble(Scanner sc, String prompt) {
        double result = 0.0;
        do {
            inputEmployeeMessage(prompt);
            if (sc.hasNextDouble()) {
                return sc.nextDouble();
            } else {
               inputErrorMessage();
               sc.next(); 
            }
        } while (true);        
    }
        
        
    public static boolean checkString(String data){
        return !data.isEmpty();
    }
    
    private static void inputEmployeeMessage(String data)
    {
        System.out.println("Please enter " + data + ":");
    }
    private static void inputErrorMessage()
    {
        System.out.println("Invalid input!");
    }
    
    public static void main(String[] args) {
        createEmployee();
    }
}
