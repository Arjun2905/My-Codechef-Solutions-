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
	        InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            int t = Integer.parseInt(br.readLine());
            while(t-- > 0){
                long C = Integer.parseInt(br.readLine());
                long d = (long) Math.floor(Math.log((C)) / Math.log((2)));
                long limit = (long) Math.pow(2, d) - 1L;
                System.out.println(limit*(C^limit));
            }
	    } catch(Exception e) {
	    }
		// your code goes here
	}
}
