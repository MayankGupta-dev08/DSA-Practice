package in.co.codeWithMayank.c10_c99;/* To write a program to print Zig-Zag Pattern
Fixed numbers of rows: 3
Enter the numbers of stars: (Ask from user)

For, n = 13

1       *       *       *
2     *   *   *   *   *   *
3   *       *       *       *
    1 2 3 4 5 6 7 8 9 10111213

*/

import java.util.*;
public class c65_pattern34 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= n; j++)
                if((i+j)%4==0 || (i==2 && j%4==0))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();
        } 
    }
}

/* 
12

    *       *       *   
  *   *   *   *   *   * 
*       *       *        

*/