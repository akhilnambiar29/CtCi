import java.util.LinkedList;

public class HshTable {
	
	int size ;
	LinkedList<Object> arr[];
	HshTable(int value){
		this.size = value;
		arr = new LinkedList[size];
	}
	
	public void add(String value){
		int index = value.hashCode()%size;
		
		System.out.println("Index:"+index);
		//System.out.println(index);
		if(arr[index] == null){
			arr[index] = new LinkedList<Object>();
		}
		arr[index].add(value);
	}
	
	public int search(String value){
		int index = value.hashCode()%size;
		
		return arr[index].indexOf(value);
	}
	
	public void display(){
		
	}

	public static void main(String args[]){
		HshTable table = new HshTable(5);
		table.add("Hello");
		table.add("My");
		table.add("Name");
		table.add("Is");
		table.add("Akhil");
		
		System.out.println(table.search("Hello"));
		System.out.println(table.search("My"));
		System.out.println(table.search("Name"));
		System.out.println(table.search("Is"));
		System.out.println(table.search("Akhil"));
	}
}
