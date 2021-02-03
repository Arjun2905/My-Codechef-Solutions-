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
	        int n = sc.nextInt();
	        
	        int zeroes = 0;
	        int ones = 0;
	       
	        String s = sc.next();
	        String p = sc.next();
	        
	        for(int i=0;i<n;i++){
	            if(s.charAt(i) != p.charAt(i)){
	                if(s.charAt(i)=='0'){
	                    zeroes++;
	                }else{
	                    ones++;
	                }
	            }
	        }
	        
	        if(zeroes!=ones){
	            System.out.println("No");
	            continue;
	        }
	        
	        int c1 = 0;
	        boolean ans = true;
	        for(int i=0;i<n;i++){
	            if(s.charAt(i) != p.charAt(i)){
	                if(s.charAt(i)=='0'){
	                    if(c1>0){
	                        c1 -= 1;
	                    }else{
	                        ans = false;
	                        break;
	                    }
	                }else{
	                    c1++;
	                }
	            }
	        }
	        
	        if(ans){
	            System.out.println("Yes");
	        }else{
	            System.out.println("No");
	        }
	    }
		// your code goes here
	}
}
