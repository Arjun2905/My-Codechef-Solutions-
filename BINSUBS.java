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
	        while(t-- > 0){
	            int n = sc.nextInt();
	            String s = sc.next();
	            
	            int total0 = 0;
	            int total1 = 0;
	            
	            for(int i=0;i<n;i++){
	                if(s.charAt(i)=='0'){
	                    total0++;
	                }else{
	                    total1++;
	                }
	            }
	            
	            int ans = Math.min(total1,total0);
	            int curr0 = 0;
	            int curr1 = 0;
	            
	            for(int i=0;i<n;i++){
	                if(s.charAt(i)=='0'){
	                    curr0++;
	                }else{
	                    curr1++;
	                }
	                ans =  Math.min(ans,curr1+(total0 - curr0));
	            }
	            System.out.println(ans);
	        }
	    } catch(Exception e) {
	    }
		// your code goes here
	}
}
