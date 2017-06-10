
public class ArryList {
	
	private int size ;
	public ArryList(int i) {
		// TODO Auto-generated constructor stub
		this.size = i;
	}
	public ArryList(){
		this.size = 10;
	}

	public static void main(String args[]){
		ArryList arraylist  = new ArryList(5);
		System.out.println(arraylist.size);
	}
}
