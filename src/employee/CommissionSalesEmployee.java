/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Misha
 */
public class CommissionSalesEmployee extends Employee {
    private double totalSales, commissionRate;
    
    public CommissionSalesEmployee(String firstName, String lastName, int employeeID, int contactNum, String address, char gender, int year, int month, int day, double totalSales, double commissionRate) {
        
        super(firstName, lastName, employeeID, contactNum, address, gender, year, month, day);
        this.totalSales = totalSales;
        this.commissionRate = commissionRate;
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
        return totalSales*commissionRate;
    }
    
    @Override
    public String toString() {
        return super.toString() + 
               "\nTotal Sales: " + getTotalSales() +
                "\nCommission Rate: " + getCommissionRate();
    }
    
}
