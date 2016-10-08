/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouse;

/**
 *
 * @author Misha
 */
public class Product {
    
    private String productName, productType, manufacturer;
    private int productID;
    private double price;
    
    public Product(String productName, String productType, int productID, double price, String manufacturer) {
        this.productName = productName;
        this.productType = productType;
        this.productID = productID;
        this.price = price;
        this.manufacturer = manufacturer;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public String getProductType() {
        return productType;
    }
    
    public void setProductType(String productType) {
        this.productType = productType;
    }
    
    public int getProductID() {
        return productID;
    }
    
    public void setProductID(int productID) {
        this.productID = productID;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    public String toString() {
        return productName + " " + productType + " " + price;
    }
    
}
