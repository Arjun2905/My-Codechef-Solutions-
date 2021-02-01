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
	        int withdraw ;
    		float balance;
    		Scanner sc = new Scanner(System.in);
    		withdraw = sc.nextInt();
    		balance = sc.nextFloat();
    		if(withdraw%5==0){
    		    if(withdraw<balance-0.5 && withdraw>=0){
    		        System.out.println(balance-withdraw-0.50);
    		       
    		    }
    		    else{
    		        System.out.println(balance);
    		    }
    		}
    		else{
    		    System.out.println(balance);
    		}
	    } catch(Exception e) {
	        
	    }
		// your code goes here
	}
}
