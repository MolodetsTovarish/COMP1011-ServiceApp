package employee;

import java.util.Scanner;
import mishmart.ServiceClass;

/**
 *
 * @author Misha
 */
public class CommissionSalesEmployee extends Employee {
    private static final double TOTAL_SALES_LIMIT = 1000000000;
    private double totalSales, commissionRate;
    
    public CommissionSalesEmployee(String firstName, String lastName, int employeeID, int contactNum, String address, String gender, int year, int month, int day, double totalSales, double commissionRate) {
        
        super(firstName, lastName, employeeID, contactNum, address, gender, year, month, day);
        this.totalSales = totalSales;
        this.commissionRate = commissionRate;
    }

    public CommissionSalesEmployee(String firstName, String lastName, int employeeID, int contactNum, String address, String gender, int year, int month, int day) {
        super(firstName, lastName, employeeID, contactNum, address, gender, year, month, day);
    }

    public double getTotalSales(){
        return totalSales;
    }
    
    public void setTotalSales(double totalSales)
    {
        this.totalSales = totalSales;
    }
    
    public double getCommissionRate(){
        return commissionRate;
    }
    
    public void setCommissionRate(double commissionRate)
    {
        this.commissionRate = commissionRate;
    }
    
    @Override
    public double paymentMethod(){
        return totalSales*commissionRate/100;
    }
    
    /**
     * Payment input for use in the service class
     */
    public void paymentInput(){
        this.totalSales = ServiceClass.readDouble("total sales ($)", 0, TOTAL_SALES_LIMIT);
        this.commissionRate = ServiceClass.readDouble("commission rate (%)", 0, 100);
    }
    
    @Override
    public String toString() {
        return super.toString() + 
               "\nTotal Sales: " + getTotalSales() +
                "\nCommission Rate: " + getCommissionRate();
    }
    
}
