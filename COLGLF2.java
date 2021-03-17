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
                int S = Integer.parseInt(br.readLine());
                long introMin = 0L;
                long TotalMin = 0L;
                String[] s = br.readLine().split(" ");

                for(int i=0;i<s.length;i++){
                    long x = Long.parseLong(s[i]);
                    introMin += x;
                }

                TotalMin += introMin;
                
                for(int j=0;j<S;j++) {
                    String[] e = br.readLine().split(" ");
                    Long E = Long.parseLong(e[0]);

                    for (int i = 1; i <= E; i++) {
                        long x = Long.parseLong(e[i]);
                        TotalMin += x - Long.parseLong(s[j]);
                    }
                }
                System.out.println(TotalMin);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
		// your code goes here
	}
}
