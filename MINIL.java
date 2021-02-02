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
    	    while(t-- >0){
    	        int N = sc.nextInt();
    	        int M = sc.nextInt();
    	        String s = "";
    	        char[][] Matrix = new char[N][M];
    	        
    	        for(int i=0;i<N;i++){
    	                s = sc.next();
    	                Matrix[i]= s.toCharArray();
    	                //System.out.print(" ");
    	        }
    	        
    	        int ans1 = 0;
    	        int ans2 = 0;
    	        
    	        for(int i=0;i<N;i++){
    	            for(int j=0;j<M;j++){
    	                if((i+j)%2==0 && Matrix[i][j]=='.'){
    	                    ans1++;
    	                }
    	                
    	                if((i+j)%2==1 && Matrix[i][j]=='*'){
    	                    ans1++;
    	                }
    	            }
    	        }
    	        
    	        for(int i=0;i<N;i++){
    	            for(int j=0;j<M;j++){
    	                if((i+j)%2==0 && Matrix[i][j]=='*'){
    	                    ans2++;
    	                }
    	                
    	                if((i+j)%2==1 && Matrix[i][j]=='.'){
    	                    ans2++;
    	                }
    	            }
    	        }
    	        
    	        int total = N*M;
    	        if(total%2==0){
    	            if(ans2<ans1){
    	                System.out.println(ans2);
    	            }else{
    	                System.out.println(ans1);
    	            }
    	        }else{
    	            System.out.println(ans1);
    	        }
    	    }
	    } catch(Exception e) {
	    }
		// your code goes here
	}
}
