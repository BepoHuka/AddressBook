    public class AddressBook {
        private String name;
        private String postalAddress;
        private String phone;

        public AddressBook(String name, String postalAddress, String phone){
            this.name = name;
            this.postalAddress = postalAddress;
            this.phone = phone;
        }
     
        public String getpostalAddress() {
            return postalAddress;
        }
     
        public void setpostalAddress(String postalAddress) {
            this.postalAddress = postalAddress;
        }
     
        public String getphone() {
            return phone;
        }
     
        public void setphone(String phone) {
            this.phone = phone;
        }
     
        public String getName() {
            return name;
        }
     
        public void setName(String name) {
            this.name = name;
        }
     
         public String getAll(){
            return ""+this.name +""+ this.postalAddress +""+ this.phone;
        }
     
        @Override
        public String toString() {
            return "Man [name=" + name + ", postalAddress=" + postalAddress + ", phone=" + phone + "]";
        }
     
        
        
    }