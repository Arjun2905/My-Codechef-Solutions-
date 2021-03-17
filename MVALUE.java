/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            int t = Integer.parseInt(br.readLine());

            while(t-- > 0){
                long N = Long.parseLong(br.readLine());

                String[] S = br.readLine().split(" ");
                long[] arr = new long[S.length];

                for(int i=0;i<S.length;i++){
                    arr[i] = Long.parseLong(S[i]);
                }

                Arrays.sort(arr);

                Long a = arr[arr.length-1];
                Long b = arr[arr.length-2];

                long PosMax = (a*b) + a-b;

                a = arr[1];
                b = arr[0];

                long NegMax = (a*b) + a-b;

                System.out.println(Math.max(PosMax , NegMax));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		// your code goes here
	}
}
