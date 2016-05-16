import java.util.Scanner;


public class TestClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name for new record in Address Book: ");
		String inputString = sc.nextLine();
		
		while (!inputString.matches("^([A-Z][a-z]+[,.]?[ ]?|[A-Z][a-z]+['-]?)+$")) {
			System.out.print("Incorrect input. Name could contain only letters from a to z and should started from capital letter: ");
			inputString = sc.nextLine();  
		}
		
		String[] words = inputString.split("\\s+");	
		if (inputString.length() > 0) 
			words = inputString.split("\\s+");
		else
			words = new String[0];
		
		System.out.print("Enter Phone number for " + inputString + ":");
		inputString = sc.nextLine();
		   
		while (!inputString.matches("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$")) {    	
			//This expression matches for all valid in Russia numbers
			System.out.print("Incorrect input. Phone number could contain only numbers, dashes and brackets: ");
			inputString = sc.nextLine();
		}
	   
		// Check if entered empty string
		if (inputString.length() > 0)
			words = inputString.split("\\s+");
		else
			words = new String[0];
		
	}
	
	
}
