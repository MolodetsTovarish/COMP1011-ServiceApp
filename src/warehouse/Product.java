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
    
    //This method returns the product's name
    public String getProductName() {
        return productName;
    }
    
    //This method sets the product's name
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    //This method returns the product's type
    public String getProductType() {
        return productType;
    }
    
    //This method sets the product's type
    public void setProductType(String productType) {
        this.productType = productType;
    }
    
    //This method returns the product's ID
    public int getProductID() {
        return productID;
    }
    
    //This method sets the product's ID
    public void setProductID(int productID) {
        this.productID = productID;
    }
    
    //This method returns the product's price
    public double getPrice() {
        return price;
    }
    
    //This method sets the product's price
    public void setPrice(double price) {
        this.price = price;
    }
    
    //This method returns the manufacturer
    public String getManufacturer() {
        return manufacturer;
    }
    
    //This method sets the manufacturer
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    public String toString() {
        return productName + " " + productType + " " + price;
    }
    
}
