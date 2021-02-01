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
	        Scanner sc=new Scanner(System.in);
    		int t=sc.nextInt();
    		while(t-->0)
    		{
    		    int n=sc.nextInt();
    		    sc.nextLine();
    		    double s=0;
    		    String k=sc.nextLine();
    		    for(int i=0;i<n;i++)
    		    {
    		        if(k.charAt(i)=='1')
    		        s++;
    		    }
    		    double x=((s+(120-(double)n))/120)*100;
    		    if(x>=75)
    		    System.out.println("YES");
    		    else
    		    System.out.println("NO");
    		}
	    } catch(Exception e) {
	        
	    }
		// your code goes here
	}
}
