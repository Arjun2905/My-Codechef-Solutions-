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
                String[] S = br.readLine().split(" ");
                int D = Integer.parseInt(S[0]);
                int C = Integer.parseInt(S[1]);
                int SumA = 0;
                int SumB = 0;
                int WIC = 0;
                String[] A = br.readLine().split(" ");
                for(int i=0;i<3;i++){
                    int y = Integer.parseInt(A[i]);
                    SumA += y;
                }
                WIC += SumA;
                if(SumA<150){
                    SumA += D;
                }
                String[] B= br.readLine().split(" ");
                for(int i=0;i<3;i++){
                    int y = Integer.parseInt(B[i]);
                    SumB += y;
                }
                WIC += SumB;
                if(SumB<150){
                    SumB += D;
                }

                int WC = SumA + SumB + C;
                WIC += 2*D;

                if(WIC>WC){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		// your code goes here
	}
}
