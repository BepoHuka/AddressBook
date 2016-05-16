import java.util.Scanner;


public class BookActions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name for new record in Address Book: ");
		String inputString = sc.nextLine();
		
		while (!inputString.matches("^([a-z]+[,.]?[ ]?|[a-z]+['-]?)+$")) {
			System.out.print("Incorrect input. Name could contain only letters from a to z and should started from capital letter: ");
			inputString = sc.nextLine();     
		}
		 
		String[] names = new String[inputString];
		for (int i = 0; i < numDogs; i++)
	   		if (i < words.length - 1)
	   			names[i] = words[i + 1]; 
	   
		System.out.print("Enter sizes of dogs (small, medium, big) devided by space: ");
		inputString = sc.nextLine();
	}
}
