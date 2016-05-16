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
    
    	
    	
    	System.out.println("New record saved to Address book.");
    	System.out.println("What would you like to do next?");
}

    public static void searchName() {
    	System.out.println("Enter the name of contact you want to find: ");
    	String search = input.next();
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