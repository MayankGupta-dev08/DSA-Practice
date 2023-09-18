package in.co.codeWithMayank.c10_c99.I_Patterns;/* To write a program to print Pallindromic Pattern
Enter the numbers of rows: 5

        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5

*/

import java.util.*;
public class c64_pattern33 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int spaces = n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++)
                System.out.print("  ");
            
            for (int j = i; j >= 1; j--)
                System.out.print(j+" ");
            
            for (int j = 2; j <= i; j++)
                System.out.print(j+" ");
            
            spaces--;
            System.out.println();
        } 
    }  
}