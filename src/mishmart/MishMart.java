/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        
        while (keepGoing) {
            ServiceClass.WelcomeMessage();
            input = read.nextInt();
            
            if(input == 1)
            {
                String firstName, lastName, address;
                int employeeID, contactNum;
                char gender;
                GregorianCalendar dateOfBirth, today;
                
                boolean innerCheck = false;
                Scanner innerRead = new Scanner(System.in);
                
                ServiceClass.inputMessage("first name");
                do
                {
                
                if(ServiceClass.stringChecker(firstName = innerRead.nextLine()))
                {
                    innerCheck = true;
                    ServiceClass.inputErrorMessage();
                    innerRead.nextLine();
                }
                }while(innerCheck);
                
            }
        }
        
    }
    
}
