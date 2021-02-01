/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        HashMap<String,String> ht = new HashMap<String,String>();
	        ht.put("0000","a");
            ht.put("0001","b");
            ht.put("0010","c");
            ht.put("0011","d"); 
            ht.put("0100","e");
            ht.put("0101","f");
            ht.put("0110","g");
            ht.put("0111","h");
            ht.put("1000","i");
            ht.put("1001","j");
            ht.put("1010","k");
            ht.put("1011","l");
            ht.put("1100","m");
            ht.put("1101","n");
            ht.put("1110","o");
            ht.put("1111","p");
	         //System.out.println(ht);
	       
	        for(int i=0;i<t;i++){
	            int size = sc.nextInt();
	            sc.nextLine();
	            String s = sc.nextLine();
	            int x=0;     
	            
	            int n = size/4;
	            
	            String re = "";
	            for(int j=0;j<n;j++){
	                String ss = s.substring(x,x+4);
	                if(ht.containsKey(ss)){
	                	System.out.print(ht.get(ss));
	                }
	                x = x+4;
	            }
	            System.out.println();
	        }
	    } catch(Exception e) {
	        
	    }
		// your code goes here
	}
}
