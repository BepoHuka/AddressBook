
public class AddressBook {
	String name;
	String address;
	String phoneNumber;
	

public AddressBook(String name, String address, String phoneNumber){
   	this.name = name;        	
    this.address = address;
    this.phoneNumber = phoneNumber;        	
    }        

public String toString(){
    String result;
    result = "Record parametres: ";
    result += "name - " + name + ", ";
    result += "address - " + address + ", ";
    result += "phoneNumber - " + phoneNumber;
    return result;
}

public String getName() {
    return name;
}

public String getAddress() {	
    return address;
}

public String getphoneNumber() {
    return phoneNumber;
}


}
