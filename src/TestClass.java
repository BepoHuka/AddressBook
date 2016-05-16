import java.util.ArrayList;
import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
    firstActions();
	}

	static String name;
	static String postalAddress;
	static String phone;
	static public int choice = 0;
	static String search = null; 
	static AddressBook contact;
	static Scanner input = new Scanner (System.in);
	static ArrayList<String> information = new ArrayList<String>();

	public static void firstActions() {
    System.out.println("Choose one option: 1) Input data to Address book. 2) Search data from Address book.");
    choice = input.nextInt();
    switch (choice) {
    case 1:
    	inputData();
    case 2:
        searchName();            
    default:
        System.out.println("Please enter selected option again.");
        break;
    }
  }

    public static void inputData() {
    	information = new ArrayList<String>();
    	contact = new AddressBook(name, postalAddress, phone);
    	
    	System.out.println("Enter contact Name");
    	contact.setName(input.next());
    	information.add(contact.getName());
    	
    	System.out.println("Enter Postal Address: ");
    	contact.setpostalAddress(input.next());
    	information.add(contact.getpostalAddress());
    	
    	System.out.println("Enter phone for contact: ");
    	contact.setphone(input.next());
    	information.add(contact.getphone());
    	
    	System.out.println("New record saved to Address book.");
    	System.out.println("What would you like to do next?");
    	firstActions();
}

    public static void searchName() {
    	System.out.println("Enter the name of contact you want to find: ");
    	search = input.next();
    		if (search.equals(information.get(0))) {
                System.out.println(information);
                System.out.println("What would you like to do next?");
                firstActions();
    		}
    		else {
    			System.out.println("There is no such record in AddressBook. Please try again.");
    			firstActions();
    		}
	}
}