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
	            int k = sc.nextInt();
	            
	            int[] arr = new int[n];
	            int reject = 0;
	            boolean isSlow = false;
	            boolean isRejected = false;
	            boolean isBot = false;
	            int bot = 0;
	            int solve = 0;
	            
	            for(int i=0;i<n;i++){
	                arr[i] = sc.nextInt();
	                if(arr[i] == -1){
	                    reject++;
	                }
	                
	                if(arr[i] > k){
	                    isSlow = true;
	                }
	                
	                if(arr[i] >=0 && arr[i]<= 1){
	                    bot++;
	                }
	            }
	            
	            if(bot == n){
	                isBot = true;
	            }
	            
	            double x = (double)n/2;
	            
	            if(n-reject < (int)Math.ceil(x)){
	                isRejected = true;
	            }
	            
	            if(isRejected){
	                System.out.println("Rejected");
	                continue;
	            }
	            
	            if(isSlow){
	                System.out.println("Too Slow");
	                continue;
	            }
	            
	            if(isBot){
	                System.out.println("Bot");
	                continue;
	            }
	            
	            if(isBot == false && isSlow == false && isRejected == false){
	                System.out.println("Accepted");
	            }
	        }
	        
	    } catch(Exception e) {
	    } 
		// your code goes here
	}
}
