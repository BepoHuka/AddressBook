
public class Entry {
    private String name;
    private String postalAddress;
    private String phone;
    
    public Entry(){
        this.name = "Veronika Pasechnik";
        this.postalAddress = "Saint-Petersburg";
        this.phone = "1234567";
    }
    
    public Entry(String name, String postalAddress, String phone){
        this.name = name;
        this.postalAddress = postalAddress;
        this.phone = phone;
    }
    
    public String getPostalAddress() {
        return postalAddress;
    }
 
    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }
 
    public String getPhone() {
        return phone;
    }
 
    public void setPhone(String phone) {
        this.phone = phone;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
    
    public void printPostalAddress() {
    	System.out.println(this.postalAddress);
    }
    
    public void printPhone() {
    	System.out.println(this.phone);
    }
    
    public void printName() {
    	System.out.println(this.name);
    }
    
    @Override
    public String toString() {
        return "Entry [name=" + name + ", postalAddress=" + postalAddress + ", phone=" + phone + "]";
    }
}
