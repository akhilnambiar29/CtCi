package unsolved;
//Weighted Uniform strings - Hackerrank
//21 testcases passed , 9 failed
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String s = in.next();
        int n = in.nextInt();
        int []x = new int[n];
        for(int a0 = 0; a0 < n; a0++){
             x[a0] = in.nextInt();
            // your code goes here
        }
        
        
        int abc[] = new int[26];
        
        for(int i = 0 ; i<s.length();i++){
        	abc[(int)s.charAt(i)-97]++;
        }
        
        /*for(int sh:abc){
        	System.out.println(sh);
        }*/
        
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0;i<26;i++){
        	for(int j=1;j<=abc[i];j++){
        		set.add(j*(i+1));
        	}
        }
        
        /*for(int sh:set){
        	System.out.println(sh);
        }*/
        
        for(int xy:x){
        	if(set.contains(xy)){
        		System.out.println("Yes");
        	}
        	else{
        		System.out.println("No");
        	}
        }
        
        in.close();
    }
}
