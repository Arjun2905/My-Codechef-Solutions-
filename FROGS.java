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
                Map<Integer,Integer> hm = new Hashtable<>(n+1);//weights and initial indexes
                List<Integer> W = new ArrayList<>(n);//weights
                int[] L = new int[n];//jumps
                int count = 0;
    
                for(int i=0;i<n;i++){
                    int x = sc.nextInt();
                    W.add(x);
                }
    
                for(int i=0;i<n;i++){
                    L[i] = sc.nextInt();
                }
    
                for(int i=1;i<n+1;i++){
                    hm.put(i,W.indexOf(i));
                }
    
                for(int i=2;i<=n;i++){
                    int idx1 = hm.get(i);
                    int idx2 = hm.get(i-1);
                    double diff = 0;
                    if(idx1<=idx2){
                        diff = Math.ceil((((double) idx2 + 1 - idx1)/L[idx1]));
                    }
                    count = count + (int)diff;
                    hm.put(i,hm.get(i) + (int)diff*L[idx1]);
                }
                System.out.println(count);
            }
	    } catch(Exception e) {
	    }
		// your code goes here
	}
}
