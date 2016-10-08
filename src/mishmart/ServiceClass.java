/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mishmart;

/**
 *
 * @author Misha
 */
public class ServiceClass {
    
    public static void WelcomeMessage()
    {
        System.out.println("Welcome to MishMart, for all your product needs:");
    }
    
    public static void employeeMessage()
    {
        System.out.println("Please enter an option:\n"
            + "1. Create an hourly employee.\n"
            + "2. Create a salaried employee.\n"
            + "3. Create a commission employee.\n"
            + "4. Exit;");
    }
    
    public static boolean intCheck(int data){
        return data
    }
    
    public static boolean doubleCheck(double data){
        
    }
    
    public abstract void paymentInput();
    
    
    public void paymentInput(){
        
    }
    
    public static boolean stringCheck(String data){
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
