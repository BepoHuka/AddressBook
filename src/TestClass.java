import java.util.ArrayList;
import java.util.Scanner;

public class TestClass {
	
	public static void main(String[] args) {
		AddressBook myBook = new AddressBook();
		Scanner input = new Scanner (System.in);
		System.out.println("Choose one option: 1. Input data to Address book. 2. Search data from Address book.");
	    int choice = input.nextInt();
	    switch (choice) {
	    case 1:
	    	inputData(myBook, input);
	    case 2:
	        searchName();            
	    default:
	        System.out.println("Please enter selected option again.");
	        break;
	    }		
	}

	
//	static ArrayList<String> information = new ArrayList<String>();
	public static void inputData(AddressBook myBook, Scanner input) {
		System.out.println("Enter contact Name");
	    String name = input.nextLine();  	
    	System.out.println("Enter Postal Address: ");
    	String postalAddress = input.nextLine();  
    	System.out.println("Enter phone for contact: ");
    	String phone = input.nextLine();  
    
    	Entry record = new Entry(name, postalAddress, phone);
    	myBook.addEntry(record);
    	
    	System.out.println("New record saved to Address book.");
    	System.out.println("What would you like to do next?");
	}

}