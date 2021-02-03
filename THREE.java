/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- > 0){
	        String s = sc.next();
	        char[] arr = s.toCharArray();
	        int count = 0;
	        int l = s.length();
	        int max = l/3;
	        Map<Character,Integer> hm = new HashMap<Character,Integer>();
	        for(char c : arr){
	            if(hm.get(c)==null){
	                hm.put(c,1);
	            }else{
	                int a = hm.get(c);
	                a += 1;
	                hm.put(c,a);
	            }
	        }
	        
	        for(char c : arr){
	            count = count + hm.get(c)/2;
	        }
	        
	        count = Math.min(max,count);
	        System.out.println(count);
		// your code goes here
    	}
    }
}
