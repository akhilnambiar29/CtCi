import java.util.Arrays;

public class Testing {
	public static void main(String args[]){
		int a[] = {1,2,3,4,5};
		
		int b[] =Arrays.copyOfRange(a, 0, 1);
		for(int i:b){
			System.out.println(i);
		}
	}
}
