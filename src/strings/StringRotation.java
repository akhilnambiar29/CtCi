package strings;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(isSubstring("waterbottle","erbottlewat"));
	}

	private static boolean isSubstring(String string1, String string2) {
		// TODO Auto-generated method stub
		if(string1.length()!=string2.length()){
			return false;
		}
		for(int i = 1 ;i <=string2.length();i++){
			System.out.println("1st Iteration :" + string2.substring(string2.length()-i,string2.length())
					+string2.substring(0,string2.length()-i)); 
			System.out.println("2nd Iteration :" + string2.substring(i,string2.length())+ string2.substring(0,i));
		}
		return false;
	}

}
