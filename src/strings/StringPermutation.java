package strings;

import java.util.Arrays;
import java.util.Hashtable;

//1.2
//Author suggests use of hash table. My ideas all go through o(n^2)
//StackOverflow mentioned arrays.sort(). This seems the best.
//Use Arrays.equals to check equality of array.
//ask the interviewer if "ABC" is equal to "abc" . For equals ignored case , iterate through
//the char arrays
//Also ask if "ABC  " is equal to "ABC". If you have extra spaces , use trim.
public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			stringPermute("ABC","CAC");
	}

	private static void stringPermute(String value1, String value2) {
		// TODO Auto-generated method stub
		if(value1.length() != value2.length()){
			System.out.println("Not a permute");
			return;
		}
		 
		char val1[] = value1.toCharArray();
		char val2[] = value2.toCharArray();
		
		Arrays.sort(val1);
		Arrays.sort(val2);
		
		/*for(Character c:val1){
			System.out.println(c);
		}
		for(Character c:val2){
			System.out.println(c);
		}*/
		if(Arrays.equals(val1, val2)){
			System.out.println("They are permute");
		}
		
		else{
			System.out.println("Nopes , they are not");
		}
		
	}

}
