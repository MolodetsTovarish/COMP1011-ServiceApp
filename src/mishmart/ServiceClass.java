package mishmart;

import employee.CommissionSalesEmployee;
import employee.Employee;
import employee.HourlyEmployee;
import employee.SalaryEmployee;
import warehouse.Product;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

/**
 *
 * @author Misha
 */
public class ServiceClass {

    public final static int HOURLY_EMPLOYEE = 1;
    public final static int SALARIED_EMPLOYEE = 2;
    public final static int COMMISSIONED_EMPLOYEE = 3;

    /**
     * Displays a welcome message
     */
    public static void welcomeMessage() {
        System.out.println("Welcome to MishMart, for all your product needs:");
    }

    /**
     *
     * @return String Displays message of the types of employees the user can
     * create
     */
    public static String employeeTypeSelectMessage() {
        return "an option:\n"
                + "1. Create an hourly employee.\n"
                + "2. Create a salaried employee.\n"
                + "3. Create a commission employee.";
    }

    /**
     *
     * @param employeeList This method handles the creation and entry of
     * employees into the employee arraylist
     */
    public static void enterEmployees(ArrayList employeeList) {// Have the client enter the employees
        while (ServiceClass.newEmployeeMessage()) {
            Employee employee = ServiceClass.createEmployee();
            // Save employee in the employee list
            employeeList.add(employee);
            System.out.println();
            System.out.println("The employee was added to the employee database.");
            System.out.println("Summary:");
            System.out.println(employeeList.toString());
            System.out.println();
        }
    }

    /**
     *
     * @param productList This method handles creation and entry of product
     * objects into the product arraylist
     */
    public static void enterProducts(ArrayList<Product> productList) {
        while (ServiceClass.newProductMessage()) {
            Product product = ServiceClass.createProduct();
            // Save product in the product list
            productList.add(product);
            System.out.println();
            System.out.println("The product was added to the product database.");
            System.out.println("Summary:");
            System.out.println(productList.toString());
            System.out.println();
        }
    }

    /**
     *
     * @return Employee This method handles the user data input and
     * instantiation of an employee
     */
    public static Employee createEmployee() {
        String firstName, lastName, address, gender;
        int employeeID, contactNum, year, month, day;
        GregorianCalendar dateOfBirth = new GregorianCalendar();

        //Get first name from user input
        firstName = readString("first name");

        //Get last name
        lastName = readString("last name");

        //Get employee ID
        employeeID = readInt("employee ID", 0, Integer.MAX_VALUE);

        //Get contact number
        contactNum = readInt("contact number", 0, Integer.MAX_VALUE);

        //Get address
        address = readString("address");

        //Get gender
        gender = readString("gender");

        //Instanciate calendar object and set current year for determining the birthday
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int currentYear = cal.get(Calendar.YEAR);

        //Get birth year
        year = readInt("year", 1900, currentYear - 18);

        //Get birth month
        month = readInt("month", 1, 12);
        //Get birth day
        day = readInt("day", 1, 31);

        int type = -1;
        Employee employee = null;
        type = readInt(employeeTypeSelectMessage(), 1, 3);

        // Allow the user to select the type of employee, instantiating the basic info entered previously for each type
        if (type == HOURLY_EMPLOYEE) {
            employee = new HourlyEmployee(firstName, lastName, employeeID, contactNum, address, gender, year, month, day);
        } else if (type == SALARIED_EMPLOYEE) {
            employee = new SalaryEmployee(firstName, lastName, employeeID, contactNum, address, gender, year, month, day);
        } else if (type == COMMISSIONED_EMPLOYEE) {
            employee = new CommissionSalesEmployee(firstName, lastName, employeeID, contactNum, address, gender, year, month, day);
        }
        // Asks for payment-specific info
        employee.paymentInput();
        return employee;

    }

    /**
     *
     * @return Product This method handles the user data input and instantiation
     * of a product
     */
    public static Product createProduct() {
        String productName, productType, manufacturer;
        int productID;
        double price;

        //Get product name from user input
        productName = readString("product name");

        //Get product type
        productType = readString("product type");

        //Get product ID
        productID = readInt("product ID", 0, Integer.MAX_VALUE);

        //Get price
        price = readDouble("price", 0, Double.MAX_VALUE);

        //Get manufacturer
        manufacturer = readString("manufacturer");

        //Instanciate product
        Product product = new Product(productName, productType, productID, price, manufacturer);

        return product;
    }

    /**
     *
     * @param prompt
     * @return String Returns a string to be used for setting data of a string
     * type, and displays a data entry message depending on what the prompt is
     */
    public static String readString(String prompt) {
        Scanner sc = new Scanner(System.in);
        String result = null;
        do {
            inputEmployeeMessage(prompt);
            result = sc.nextLine().trim();
            if (checkString(result)) {
                return result;
            } else {
                inputErrorMessage();
            }
        } while (true);
    }

    /**
     *
     * @param prompt
     * @return int Returns an int to be used for setting data of an int type,
     * and displays a data entry message depending on what the prompt is
     */
    public static int readInt(String prompt, int start, int end) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        do {
            inputEmployeeMessage(prompt);
            if (sc.hasNextInt()) {
                result = sc.nextInt();
                if (result < start || result > end) {
                    rangeErrorMessage(start, end);
                } else {
                    return result;
                }
            } else {
                inputErrorMessage();
                sc.next();
            }
        } while (true);
    }

    /**
     *
     * @param start
     * @param end For numerical data, if the input is out of the appropriate
     * range (between start and end), displays a message telling the user
     */
    private static void rangeErrorMessage(Number start, Number end) {
        System.out.println("The input has to be between " + start + " and " + end);
    }

    /**
     *
     * @param prompt
     * @return double Returns an double to be used for setting data of a double
     * type, and displays a data entry message depending on what the prompt is
     */
    public static double readDouble(String prompt, double start, double end) {
        Scanner sc = new Scanner(System.in);
        double result = 0.0;
        do {
            inputEmployeeMessage(prompt);
            if (sc.hasNextDouble()) {
                result = sc.nextDouble();
                if (result < start || result > end) {
                    rangeErrorMessage(start, end);
                } else {
                    return result;
                }
            } else {
                inputErrorMessage();
                sc.next();
            }
        } while (true);
    }

    /**
     *
     * @param data
     * @return boolean Checks if the string is empty
     */
    public static boolean checkString(String data) {
        return !data.isEmpty();
    }

    /**
     *
     * @return boolean Checks if user wants to continue adding data for another
     * employee
     */
    public static boolean newEmployeeMessage() {
        int answer = readInt("the data for new employee: 1 - yes, 2 - no?", 1, 2);
        return answer == 1;
    }

    /**
     *
     * @return boolean Checks if user wants to continue adding data for another
     * product
     */
    public static boolean newProductMessage() {
        int answer = 0;
        do {
            answer = readInt("the data for new product: 1 - yes, 2 - no?", 1, 2);
        } while (answer < 1 || answer > 2);
        return answer == 1;
    }

    /**
     *
     * @param data Takes in the name of a data type to display a data entry
     * message
     */
    private static void inputEmployeeMessage(String data) {
        System.out.println("Please enter " + data + ":");
    }

    /**
     * Returns an error message if an input is invalid
     */
    private static void inputErrorMessage() {
        System.out.println("Invalid input!");
    }

    /**
     *
     * @param date
     * @return String This method formats the display of date objects
     */
    public static String formatDate(GregorianCalendar date) {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        fmt.setCalendar(date);
        String dateFormatted = fmt.format(date.getTime());
        return dateFormatted;
    }

    /**
     *
     * @return int Returns an int based off what choice the user selects
     */
    public static int displayMenu() {
        return readInt("Choose from following options:\n"
                + "1. Enter employees\n"
                + "2. Search employees\n"
                + "3. Enter products\n"
                + "4. Search products\n"
                + "0. Exit", 0, 4);
    }

    /**
     *
     * @param employeeList Searches for an employee in the employee array list
     * based off the employee's ID
     */
    public static void searchEmployees(ArrayList<Employee> employeeList) {
        System.out.println("Searching employees");
        int employeeID = readInt("employee ID", 1, Integer.MAX_VALUE);
        for (Employee emp : employeeList) {
            if (emp.getEmployeeID() == employeeID) {
                System.out.println("Found: " + emp);
                return;
            }
        };
        System.out.println("Not found!");
    }

    /**
     *
     * @param productList Searches for an product in the product array list
     * based off the product's ID
     */
    public static void searchProducts(ArrayList<Product> productList) {
        System.out.println("Searching products");
        int productID = readInt("product ID", 1, Integer.MAX_VALUE);
        for (Product prod : productList) {
            if (prod.getProductID() == productID) {
                System.out.println("Found: " + prod);
                return;
            }
        };
        System.out.println("Not found!");
    };

}
