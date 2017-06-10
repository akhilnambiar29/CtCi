package strings;

public class StringOneAway {
	String string1 = "";
	String string2 = "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			StringOneAway stringoneaway =  new StringOneAway();
			stringoneaway.oneAway("abcd","abcd");
			stringoneaway.removeAway();
			stringoneaway.insertAway();
			stringoneaway.replaceAway();
	}

	private void replaceAway() {
		// TODO Auto-generated method stub
		if(string1.length()!=string2.length()){
			System.out.println("Same length needed to check replace");
		}
		
		else if(string1 == string2){
			System.out.println("Same string");
		}
		
		else{
			int count =0;
			for(int i=0;i<string1.length();i++){
				if(string1.charAt(i)!=string2.charAt(i)){
					count++;
				}
				if(count>1){
					System.out.println("Not possible to replace with just one change");
					break;
					
				}
			}
		}
	}

	private void insertAway() {
		// TODO Auto-generated method stub
		for(int i=0;i<string2.length();i++){
			if((string2.substring(0,i)+string2.substring(i+1)).equals(string1)){
				System.out.println("Yes insert");
			}
		}
	}

	private void removeAway() {
		// TODO Auto-generated method stub
		for(int i=0;i<string1.length();i++){
			if((string1.substring(0,i)+string1.substring(i+1)).equals(string2)){
				System.out.println("Yes remove");
			}
		}
	}

	private void oneAway(String string1, String string2) {
		// TODO Auto-generated method stub
		this.string1 = string1;
		this.string2 = string2;
	}
}
