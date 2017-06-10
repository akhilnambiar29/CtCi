package strings;
//1.1 
//Author suggests bit vector but this is simple as well. We can do it in O(N) but author says O(N LogN)
//Also you can use hashtable but this seems simpler
//If characters are more thatn 26 , they can't be unique
//Ascii or unicode? - Ascii - 128 characters , unicode - 0 to 2^21
//for strings where both lower and upper case are present , use toLowercase
public class StringUniqueCharacters {

	public static void main(String args[]){
		checkUnique("absdfhqkpffk");
	}
	
	// You can use a hashtable here as well. -> For data structures.
	// for checking unique , you can use hashtable.
	private static void checkUnique(String value) {
		// TODO Auto-generated method stub
		boolean flag = true;
		
		if(value.length()>26){
			System.out.println("Not unique");
		}
		for (int i = 1; i < value.length()-1; i++) {
			if(value.substring(0, i).contains(value.substring(i,i+1))){
				flag = false;
				System.out.println(i+1);
				break;
			}
		}
		
	}
}
