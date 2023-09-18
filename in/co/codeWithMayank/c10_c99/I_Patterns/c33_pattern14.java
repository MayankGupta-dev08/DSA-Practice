package in.co.codeWithMayank.c10_c99;

import java.util.*;

public class c33_pattern14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // assumption - n will always be odd
        scn.close();

        int outr_spc = n / 2, innr_spc = -1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= outr_spc; j++)
                System.out.print("  ");

            System.out.print("* ");

            for (int j = 1; j <= innr_spc; j++)
                System.out.print("  ");

            if (i > 1 && i < n)
                System.out.print("* ");

            if (i <= n / 2) {
                outr_spc--;
                innr_spc += 2;
            } else {
                outr_spc++;
                innr_spc -= 2;
            }

            System.out.println();
        }
    }
}

/*
 * 5

    * 
  *   * 
*       * 
  *   * 
    * 

 */