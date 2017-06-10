package strings;

import java.util.ArrayList;
import java.util.List;

public class StringPermutationOfPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			palindrome("Malayalama");
	}

	private static void palindrome(String string) {
		// TODO Auto-generated method stub
		string = string.toLowerCase().replaceAll("\\s+", ""); //convert to lower case and remove all spaces
		
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i =0;i<string.length();i++){
			char temp = string.charAt(i);
			if(list.contains(temp)){
				list.remove(Character.valueOf(temp));//convert it to character otherwise it will call an int.
			}
			else{
				list.add(temp);
			}
		}
		if(list.size()>1){
			System.out.println("Not a palindrome");
		}
		else{
			System.out.println("Palindrome");
		}
		
		
		
	}

}
