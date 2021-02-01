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
	        int tc = sc.nextInt();
	        for(int j=0;j<tc;j++){
    	        int N = sc.nextInt();
    	        int K = sc.nextInt();
    	        int D = sc.nextInt();
    	        int a[] = new int[N];
    	        for(int i=0;i<N;i++){
    	            a[i] = sc.nextInt();
    	        }
    	        int tqs = 0;
    	        for(int i=0;i<N;i++){
    	            tqs+=a[i];
    	        }
    	        int maxD = 0;
    	        if(tqs==K){
    	            maxD = 1;
    	            //return maxD;
    	        }
    	        
    	        if(tqs<K){
    	            maxD = 0;
    	        }
    	        
    	        if(tqs>K){
    	            maxD = tqs/K;
    	            if(maxD>D){
    	                maxD = D;
    	            }
    	            
    	            //if(maxD<=D){
    	               // return maxD;
    	            //}
    	        }
    	        
    	        System.out.println(maxD);//return maxD;
	        }
	    } catch(Exception e) {
	        
	    }
		// your code goes here
	}
}
