// modification to hollow square pattern

import java.util.*;
public class c58_pattern27 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int hv =1, vv=2*n +1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i==1 || i==n)
                    System.out.print((hv++)+" ");
    
                else if( j==1 || j==n)
                    System.out.print((vv++)+" ");

                else{
                    System.out.print("* ");
                    vv++;
                }
            }
            System.out.println();
        }
    }
}

/* 
// input
5

// output
1 2 3 4 5 
11 * * * 15 
16 * * * 20 
21 * * * 25 
6 7 8 9 10
*/

/* 
// input
4

// output
1 2 3 4 
9 * * 12 
13 * * 16 
5 6 7 8
*/