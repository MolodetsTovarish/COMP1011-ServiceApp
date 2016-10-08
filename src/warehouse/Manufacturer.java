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
public class Manufacturer {
    
    private String manufacturerName;
    private int contactNum;
    private String address;
    private String website;
    
    public Manufacturer(String manufacturerName, int contactNum, String address, String website){
        this.manufacturerName = manufacturerName;
        this.contactNum = contactNum;
        this.address = address;
        this.website = website;
    }
    
    public String getManufacturerName()
    {
        return manufacturerName;
    }
    
    public void setManufacturerName(String manufacturerName)
    {
        this.manufacturerName = manufacturerName;
    }
    
    public int getContactNum()
    {
        return contactNum;
    }
    
    public void setContactNum(int contactNum){
        this.contactNum = contactNum;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public String getWebsite()
    {
        return website;
    }
    
    public void setWebsite()
    {
        this.website = website;
    }
    
    public String toString()
    {
        return "Manufacturer Name: " + manufacturerName + 
                "\nContact Number:" + contactNum +
                "\nAddress: " + address +
                "\nWebsite: " + website;
    }
}
