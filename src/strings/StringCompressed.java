package strings;

public class StringCompressed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				compressed("abcdef");
	}

	private static void compressed(String string) {
		// TODO Auto-generated method stub
		int count = 1;
		String newString = "";
		for(int i = 1 ; i<string.length();i++){
			
			if(string.charAt(i)==string.charAt(i-1)){
				count++;
			}
			else{
				newString += string.charAt(i)+""+count;
				count = 0;
			}
		}
		if(string.length()<newString.length()){
			System.out.println(string);
		}
		else
		System.out.println(newString);
	}

}
