package mishmart;

import employee.CommissionSalesEmployee;
import employee.Employee;
import employee.HourlyEmployee;
import employee.SalaryEmployee;
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
    
    public static Employee createEmployee() {
        String firstName, lastName, address, gender;
        int employeeID, contactNum, year, month, day;
        GregorianCalendar dateOfBirth = new GregorianCalendar();
        
        //Get first name from user input
        firstName = readString("first name");
        
        //Get last name
        lastName = readString("last name");
        
        //Get 
        employeeID = readInt("employee ID");
        
        //Get 
        contactNum = readInt("contact number");
        
        //Get 
        address = readString("address");
        
        gender = readString("gender");
        
        //Get 
        year = readInt( "year");
        
        //Get 
        month = readInt( "month");        
        //Get 
        day = readInt( "day");
        
        
        int type = -1;
        Employee employee = null;
        do {
        type = readInt( employeeTypeSelectMessage());
        
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
        }
        while (type > 3 || type < 1);
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
    
    public static int readInt(String prompt) {
        Scanner sc = new Scanner(System.in);
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
    
    public static double readDouble(String prompt) {
        Scanner sc = new Scanner(System.in);
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

    public static boolean newEmployeeMessage()
    {
        int answer = 0;
        do {
            answer = readInt("Enter the data for new employee: 1 - yes, 2 - no?");
        } while (answer < 1 || answer > 2);
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
    
    private static boolean continueMessage()
    {
        int input = readInt("Continue adding employees?\n1. Yes\n2. No");

        do {
            if (input == 1) {
                return true;
            } else if (input == 2) {
                return false;
            }
        } while (input < 1 || input > 2);
        return false;
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
}
