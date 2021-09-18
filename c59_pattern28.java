// Butterfly Pattern

import java.util.*;
public class c59_pattern28 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int spaces = 2*n -2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            for (int j = 1; j <= spaces; j++)
                System.out.print("  ");

            for (int j = i; j >= 1; j--)
                System.out.print("* ");
            
            spaces -=2;
            System.out.println();
        }

        spaces +=2;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            for (int j = 1; j <= spaces; j++)
                System.out.print("  ");

            for (int j = i; j >= 1; j--)
                System.out.print("* ");
            
            spaces +=2;
            System.out.println();
        }
    }
}

/* 
4

*             * 
* *         * * 
* * *     * * * 
* * * * * * * * 
* * * * * * * * 
* * *     * * * 
* *         * * 
*             * 
 */