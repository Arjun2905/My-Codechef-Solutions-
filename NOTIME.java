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
	        String[] input = br.readLine().split(" ");
	        int N = Integer.parseInt(input[0]);
	        int H = Integer.parseInt(input[1]);
	        int x = Integer.parseInt(input[2]);
	        
	        String[] array = br.readLine().split(" ");
	        int[] arr = new int[array.length];
	        
	        for(int i=0;i<array.length;i++){
	            arr[i] = Integer.parseInt(array[i]);
	        }
	        int flag = 0;
	        int diff = H - x;
	        if(diff<=0){
	            System.out.println("YES");
	        }else{
	            for(int i=0;i<arr.length;i++){
	                if(arr[i]>=diff){
	                    flag = 1;
	                    break;
	                }else{
	                    flag = 0;
	                }
	            }
	            if(flag==0){
	                System.out.println("NO");
	            }else{
	                System.out.println("YES");
	            }
	        }
	    } catch(Exception e) {
	    }
		// your code goes here
	}
}
