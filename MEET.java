/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            sc.nextLine();
            while (t-- > 0) {
                String P = sc.nextLine();
                int x = ConvertToInt(P);
                String result = "";
                int N = sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < N; i++) {
                    String friend = sc.nextLine();
                    String L = friend.substring(0, 8);
                    int y = ConvertToInt(L);
                    String R = friend.substring(9, 17);
                    int z = ConvertToInt(R);
                    if (isAvailable(x, y, z)) {
                        result = result + "1";
                    } else {
                        result = result + "0";
                    }
                }
                System.out.println(result);
            }
        }catch (Exception e){
            
        }
        // your code goes here
    }

    private static boolean isAvailable(int x, int y, int z) {
        boolean check = false;
        if (x >= y && x <= z) {
            check = true;
        }
        return check;
    }

    private static int ConvertToInt(String p) {
        String string = "";
        string += p.substring(0,2) + p.substring(3,5);
        int X = 0;

        if (p.contains("PM")) {
            X = 1200 + Integer.parseInt(string);
            if (X >= 2400) {
                X = X - 1200;
            }
        }

        if (p.contains("AM")) {
            X = Integer.parseInt(string);
            if (X >= 1200) {
                X = X - 1200;
            }
        }
        return X;
    }
}
