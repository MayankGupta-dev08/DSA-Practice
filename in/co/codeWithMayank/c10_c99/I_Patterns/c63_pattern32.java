package in.co.codeWithMayank.c10_c99;/* To write a program to print Number Pattern
Enter the numbers of rows: 5

    1 
   1 2
  1 2 3
 1 2 3 4 
1 2 3 4 5

*/

import java.util.*;
public class c63_pattern32 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int spaces = n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++)
                System.out.print(" ");
            
            for (int j = 1; j <= i; j++)
                System.out.print(j+" ");
            
            spaces--;
            System.out.println();
        } 
    }  
}