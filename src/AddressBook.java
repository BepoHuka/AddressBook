import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	/*
	public String getAll(){
		return ""+this.name +""+ this.postalAddress +""+ this.phone;
        }
     */
	private List<Entry> records;
	
	public AddressBook(){
		this.records = new ArrayList<Entry>();
	}	
	
	public AddressBook(Entry [] records){
		this.records = new ArrayList<Entry>();
		for (Entry i : records){
			this.records.add(i);
		}
	}
	
	public void addEntry(Entry entry){
		this.records.add(entry);
	}
	
	public Entry search(String name){
		for (Entry i : records){
			//String comparsion 
			if (i.getName() == name)
				return i;
		}
			return null;
	}
}