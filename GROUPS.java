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
	            String s = br.readLine();
	            char[] arr = s.toCharArray();
	            int group = 0;
	            for(int i=0;i<arr.length;i++){
	                if(i==0){
	                    if(arr[i]=='1'){
	                        group++;
	                    }
	                    continue;
	                }
	                
	                if(arr[i]=='1'){
	                    if(arr[i-1]=='1'){
	                        continue;
	                    }else{
	                        group++;
	                    }
	                }
	            }
	            System.out.println(group);
	        }
	    } catch(Exception e) {
	    }
		// your code goes here
	}
}
