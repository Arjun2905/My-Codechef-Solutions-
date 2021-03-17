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
                int N = Integer.parseInt(br.readLine());
                String[] s = br.readLine().split(" ");
                int[] arr = new int[N];
                for(int i=0;i<N;i++){
                    arr[i] = Integer.parseInt(s[i]);
                }
                int moves = 0;
                Arrays.sort(arr);
                boolean flag= false;                
                for(int i=0;i<N;i++){
                    int diff = i+1 - arr[i];
                    if(diff < 0 ) {
                        System.out.println("Second");
                        flag = true;
                        break;
                    }
                    moves += diff;    
                }
                if(flag) continue;
                    if(moves%2==0){
                        System.out.println("Second");
                    }else{
                        System.out.println("First");
                    }
            }
      } catch(Exception e) {
      }
		// your code goes here
	}
}
