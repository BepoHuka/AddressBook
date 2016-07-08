
public interface Entry {
	
	/**
	 * Get Person for current Entry
	 * 
	 * @return a Person object for current Entry
	 * 
	 */
	public Name getName();
	
	/**
	 * Get Address for current Entry
	 * 
	 * @return a Address object for current Entry
	 */
	public Address getAddress();
		
	/**
	 * Get PhoneNumber for current Entry
	 * 
	 * @return a PhoneNumber object for current Entry
	 */
	public PhoneNumber getPhoneNumber();
	
	/**
	 * Set Person for current Entry
	 * 
	 * @param person a Person to set
	 */
	public void setName(Name person);
    
	/**
	 * Set Address for current Entry
	 * 
	 * @param address a Address to set
	 */
	public void setAddress(Address address);
	
	/**
	 * Set PhoneNumber for current Entry
	 * 
	 * @param phoneNumber a PhoneNumber to set
	 */
	public void  setPhoneNumber(PhoneNumber phoneNumber);
	
}