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
	            int N = sc.nextInt();
	            int[] arr = new int[N];
	            
	            for(int i=0;i<N;i++){
	                arr[i] = sc.nextInt();
	            }
	            
	            long max = 0;
	            long min = 0;
	            long ans = 0;
	            
	            Arrays.sort(arr);
	            min = arr[0];
	            max = arr[N-1];
	            ans = (max-min)*2;
	            System.out.println(ans);
	        }
	    } catch(Exception e) {
	    }
		// your code goes here
	}
}
