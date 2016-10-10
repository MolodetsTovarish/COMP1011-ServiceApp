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

    public Manufacturer(String manufacturerName, int contactNum, String address, String website) {
        this.manufacturerName = manufacturerName;
        this.contactNum = contactNum;
        this.address = address;
        this.website = website;
    }

    //Returns the manufacturer's name
    public String getManufacturerName() {
        return manufacturerName;
    }

    //Set the manufacturer's name
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    //Returns the contact number
    public int getContactNum() {
        return contactNum;
    }

    //Sets the contact number
    public void setContactNum(int contactNum) {
        this.contactNum = contactNum;
    }

    //Returns the address of the manufacturer
    public String getAddress() {
        return address;
    }

    //Sets the address of the manufacturer
    public void setAddress(String address) {
        this.address = address;
    }

    //Returns the manufacturer's website
    public String getWebsite() {
        return website;
    }

    //Sets the manufacturer's website
    public void setWebsite() {
        this.website = website;
    }

    public String toString() {
        return "Manufacturer Name: " + manufacturerName
                + "\nContact Number:" + contactNum
                + "\nAddress: " + address
                + "\nWebsite: " + website;
    }
}
