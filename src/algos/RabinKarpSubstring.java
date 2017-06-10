package algos;

//should be O(N) according to me
public class RabinKarpSubstring {
	
	public static void main(String args[]){
		checkIfPresent("GEEKS FOR GEEK" ,"GEEK");
	}

	private static void checkIfPresent(String value, String pattern) {
		// TODO Auto-generated method stub
		
		int patternHashCode = pattern.hashCode();
		
		for(int i=0;i<(value.length()-pattern.length())+1;i++){
			int hashcode = value.substring(i, i+pattern.length()).hashCode();
			if(hashcode == patternHashCode){
				
				if(value.substring(i, i+pattern.length()).equals(pattern))
				{
					System.out.println("Pattern present in "+i);
				}
			}
		}
		
	}
	
}
