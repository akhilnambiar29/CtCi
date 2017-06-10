package strings;
//1.3
public class StringUrlify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			urlify("Mr John Smith  ");
	}

	private static void urlify(String string) {
		// TODO Auto-generated method stub
		
		string = string.trim();
		String[] abc = string.split(" ");
		
		for(int i=1;i<abc.length;i++){
			abc[i] = abc[i-1]+"%20"+abc[i];
		}
		System.out.println(abc[abc.length-1]);
		}
	}


