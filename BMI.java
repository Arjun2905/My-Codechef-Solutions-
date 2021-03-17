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
	            float M = sc.nextInt();
	            float H = sc.nextInt();
	            float H2 = H*H;
	            float BMI = M/H2;
	            
	            if(BMI<=18){
	                System.out.println(1);
	            }
	            
	            if(BMI > 18 && BMI <= 24){
	                System.out.println(2);
	            }
	            
	            if(BMI > 24 && BMI <= 29) {
	                System.out.println(3);
	            }
	            
	            if(BMI>=30){
	                System.out.println(4);
	            }
	        }
	        
	    } catch(Exception e) {
	    }
		// your code goes here
	}
}
