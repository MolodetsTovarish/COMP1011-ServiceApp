/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mishmart;

import employee.CommissionSalesEmployee;
import employee.Employee;

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
        CommissionSalesEmployee emp1 = new CommissionSalesEmployee("Fe", "Fe", 33, 33, "Street", 'm', 1980, 3, 13, 50, 14.0);
        System.out.println(emp1);
        System.out.println(emp1.getAge());
        
    }
    
}
