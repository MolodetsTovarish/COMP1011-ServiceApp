package mishmart;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Misha
 */
public abstract class ServiceClass {
    
    public static void welcomeMessage()
    {
        System.out.println("Welcome to MishMart, for all your product needs:");
    }
    
    public static void employeeSelectMessage()
    {
        System.out.println("Please enter an option:\n"
            + "1. Create an hourly employee.\n"
            + "2. Create a salaried employee.\n"
            + "3. Create a commission employee.\n"
            + "4. Exit;");
    }
    
    public static void createEmployee() {
        String firstName, lastName, address;
        int employeeID, contactNum, year, month, day;
        char gender;
        GregorianCalendar dateOfBirth, today;

        boolean innerCheck = false;
        Scanner innerRead = new Scanner(System.in);
        
        //Get first name
        ServiceClass.inputEmployeeMessage("first name");
        do {
            //ServiceClass.inputEmployeeMessage("first name");
            if (ServiceClass.checkString(firstName = innerRead.nextLine())) {
                innerCheck = true;
                ServiceClass.inputErrorMessage();
                innerRead.nextLine();
            } else {
                innerCheck = false;
            }
        } while (innerCheck);
        
        //Get last name
        ServiceClass.inputEmployeeMessage("last name");
        do {
            if (checkString(lastName = innerRead.nextLine())) {
                innerCheck = true;
                ServiceClass.inputErrorMessage();
                innerRead.nextLine();
            } else {
                innerCheck = false;
            }
        } while (innerCheck);
        
        //Get 
        ServiceClass.inputEmployeeMessage("employee ID");
        do {
            //ServiceClass.inputEmployeeMessage("");
            if (ServiceClass.checkInt(employeeID = innerRead.nextInt())) {
                innerCheck = true;
                ServiceClass.inputErrorMessage();
                innerRead.nextInt();
            } else {
                innerCheck = false;
            }
        } while (innerCheck);
        
        //Get 
        ServiceClass.inputEmployeeMessage("contact number");
        do {
            //ServiceClass.inputEmployeeMessage("");
            if (ServiceClass.checkInt(contactNum = innerRead.nextInt())) {
                innerCheck = true;
                ServiceClass.inputErrorMessage();
                innerRead.nextInt();
            } else {
                innerCheck = false;
            }
        } while (innerCheck);
        
        //Get 
        ServiceClass.inputEmployeeMessage("address");
        do {
            //ServiceClass.inputEmployeeMessage("");
            if (ServiceClass.checkString(address = innerRead.nextLine())) {
                innerCheck = true;
                ServiceClass.inputErrorMessage();
                innerRead.nextLine();
            } else {
                innerCheck = false;
            }
        } while (innerCheck);
        
        /*
        if (innerRead.hasDouble
        */
        
        //Get 
        ServiceClass.inputEmployeeMessage("year");
        do {
            //ServiceClass.inputEmployeeMessage("");
            if (ServiceClass.checkString(year = innerRead.nextLine())) {
                innerCheck = true;
                ServiceClass.inputErrorMessage();
                innerRead.nextLine();
            } else {
                innerCheck = false;
            }
        } while (innerCheck);
        
        //Get 
        ServiceClass.inputEmployeeMessage("month");
        do {
            //ServiceClass.inputEmployeeMessage("");
            if (ServiceClass.checkString(month = innerRead.nextLine())) {
                innerCheck = true;
                ServiceClass.inputErrorMessage();
                innerRead.nextLine();
            } else {
                innerCheck = false;
            }
        } while (innerCheck);
        
        //Get 
        ServiceClass.inputEmployeeMessage("day");
        do {
            //ServiceClass.inputEmployeeMessage("");
            if (checkInt(day = innerRead.nextLine())) {
                innerCheck = true;
                ServiceClass.inputErrorMessage();
                innerRead.nextLine();
            } else {
                innerCheck = false;
            }
        } while (innerCheck);

    }
    
    public static boolean checkInt(int data){
        if (Integer.parseInt(data) == null){
        return ;
        }
    }
    
    public static boolean checkDouble(double data){
        
    }
    
    public void createEmployeeHourly(){
        createEmployee();
        paymentInput();
    }
    
    public abstract void paymentInput();
    
    
    public static boolean checkString(String data){
        data = data.trim();
        return data.isEmpty();
    }
    
    public static void inputEmployeeMessage(String data)
    {
        System.out.println("Please enter " + data + ":");
    }
    public static void inputErrorMessage()
    {
        System.out.println("Invalid input!");
    }
}
