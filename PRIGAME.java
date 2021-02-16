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
            int t= sc.nextInt();
            while(t-- > 0){
                //sc.nextLine();
                int X = sc.nextInt();
                int Y = sc.nextInt();
                
                
                if(Y==1 && X>=3){
                    System.out.println("Divyam");
                    continue;
                }
                
                if(Y==1 && X<3){
                    System.out.println("Chef");
                    continue;
                }
                
                int n = totalPrimeNo(X);
                
                //System.out.println(n);
                if(n>Y){
                    System.out.println("Divyam");
                }else{
                    System.out.println("Chef");
                }
            }
	    } catch(Exception e) {
	    }
		// your code goes here
	}
	
	private static int totalPrimeNo(int x) {
        boolean[] arr = new boolean[x+1];
        int num = 0;

        for(int i=2;i<=x;i++){
            arr[i] = true;
        }

        for(int i=2;i<=x/2;i++){
            if(arr[i]) {
                for (int j=i;j*i<=x;j++) {
                    arr[j*i] = false;
                }
            }
        }

        for(int i = 2;i<x+1;i++){
            if(arr[i]){
                num = num +1;
            }
        }
        return num;
    }
}
