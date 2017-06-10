package arrays;
import java.io.*;
import java.util.*;

public class PrefixSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int m = in.nextInt();
        
        Long[] abc = new Long[n+1];
        Arrays.fill(abc, 0L);
        
        for(int i=0;i<m;i++){
        	int a = in.nextInt();
        	int b = in.nextInt();
        	int k = in.nextInt();
        	
        	//Add value of k to the first member of the array. 
        	abc[a-1]+=k;
        	
        	//Subtract value of k from last member of the array.
        	abc[b]-=k;
        	
        	
        }
        long max = 0,x=0;
        //Using this for loop is more efficient. This loop decreases runtime.
        for(long i:abc){
        	//just check for max value - don't store in the array. This approach decreases runtime.
        	x=x+i;
        	if(x>max){max = x;}
        }
        
        System.out.println(max);
    }
}