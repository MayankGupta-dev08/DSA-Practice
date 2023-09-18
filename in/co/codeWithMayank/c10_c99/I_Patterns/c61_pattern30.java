package in.co.codeWithMayank.c10_c99.I_Patterns;/* To write a program to print Rhombus Pattern
Enter the numbers of rows: 5

        * * * * *
      * * * * *
    * * * * *
  * * * * *
* * * * *

*/

import java.util.*;
public class c61_pattern30 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int spaces = n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++)
                System.out.print("  ");
            
            for (int j = 1; j <= n; j++)
                System.out.print("* ");
            
            spaces--;
            System.out.println();
        } 
    }
}