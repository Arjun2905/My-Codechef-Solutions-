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
	            int K = sc.nextInt();
	            int arr[] = new int[N]; 
	            int sum = 0;
	            for(int i =0;i<N;i++){
	                arr[i] = sc.nextInt();
	                sum += arr[i];
	            }
	            
	            if(sum%K==0){
	                System.out.println(0);
	            }else{
	                System.out.println(1);
	            }
	        }
	        
	    } catch(Exception e) {
	    }
		// your code goes here
	}
}
