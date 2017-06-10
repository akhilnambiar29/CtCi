import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        
        int m[] = new int[n];
        for(int i = 0 ; i< n ; i++){
        	m[i]  = scanner.nextInt();
        }
        
        int d = 0;
        
        for(int i = 0 ; i< q ; i++){
        	List<Integer> list = new ArrayList<Integer>();
        	d  = scanner.nextInt();
        	
        	for(int j = 0 ; j<=n-d;j++){
        		list.add(Arrays.stream(Arrays.copyOfRange(m, j, d+j)).max().getAsInt());
        	}
        	System.out.println(Collections.min(list));
        }
        
        
        
    }
}