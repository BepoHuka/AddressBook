/**
 * 
 * Create an Address Book object that will store a collection of entries. 
 * Implement simple functionality to add new Entry and get Entry by Name 
 * 
 * Each Address Book entry should store the following information:
 * •	Name
 * •	Postal Address
 * •	Phone
 * 
 * It should also implement the following functionality:
 * •	printPhoneNumber
 * •	printAddress
 * •	printName
 * 
 * Override toString() method to show a short snapshot of information
 * Create the "Address Book" architecture assuming it may store addresses 
 * for different countries (that have different output format). 
 * And addresses for each country should be shown in correct format
 * 
 * For example:
 * Phone Numbers:
 * Country1 = x-xxx-xx-xx-xx;
 * Country2 = xxxx-xxxx-xx
 * (you may use different patterns)
 * Addresses:
 * Country1: postal code, Country, city, street, house
 * Country2: house, Street, city, postal code, Country
 *
 */

public interface AddressBook {
	
	/**
	 * Adds a new Entry to address book.
	 * 
	 * @param newEntry a new Entry object to add
	 */
	public void add( Entry newEntry );
	
		
	/**
	 * Deletes the Entry from address book
	 * 
	 * @param searchText the query to search for delete
	 * 
	 * @return true if removed successfully, false otherwise
	 */
	public boolean delete( String searchText );

	/**
	 * Search address book for an Entry 
	 * 
	 * @param searchText the query to search
	 * 
	 * @return an Entry object if found; otherwise null
	 */
	public Entry search( String searchText );
	
	/**
	 * Sort address book
	 * 
	 */
	public void sort( );
}