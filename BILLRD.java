/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    	Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		while(T>0)   // 0,3
		{
		    long N=sc.nextLong();
		    long K=sc.nextLong();
		    long x=sc.nextLong();
		    long y=sc.nextLong();
		    
		    solution(N ,K , x, y );
		   
		    T--;
		}
		// your code goes here
	}
	
	public static void solution(long N, long K, long x, long y)
	{
	         
	    if(K==0)
	    {
	        System.out.println(x+" "+y);
	        return;
	    }
	    if(x==y)
	    {
	        System.out.println(N+" "+N);
	        return;
	    }
	    if(x==0 && y==N)
	    {
	        System.out.println(0+" "+N);
	        return;
	    }
	    if(x==N && y==0)
	    {
	        System.out.println(N+" "+0);
	        return;
	    }
	    
	    long arr[][]=new long[4][2];
	    // x>y
	   if(x>y)       
	    {
	    arr[0][0]= N;          
	    arr[0][1]= N - x + y;      
	    
	    arr[1][0]= arr[0][0] -( N - arr[0][1]);   
	    arr[1][1]= N;//5
	    
	    arr[2][0]= 0 ; 
	    arr[2][1]= arr[1][1] - arr[1][0];        
	    
	    arr[3][0]= arr[2][1] - arr[2][0];         
	    arr[3][1]= 0 ;       
	    }
	    else
	    {
	    arr[0][0]= x + N - y ;    
	    arr[0][1]= N;      
	    
	    arr[1][0]= N;
	    arr[1][1]= arr[0][1] -( N -arr[0][0]);  
	    
	    arr[2][0]= arr[1][0] - arr[1][1];   
	    arr[2][1]= 0;
	    
	    arr[3][0]= 0;
	    arr[3][1]= arr[2][1] + arr[2][0];
	    }

	    int p=(int) (K)%4;
	    if(p==0)
	    p=4;
	    System.out.println(arr[p-1][0]+ " "+ arr[p-1][1]);
	}
}
