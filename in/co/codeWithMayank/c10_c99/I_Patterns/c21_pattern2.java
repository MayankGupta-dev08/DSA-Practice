package in.co.codeWithMayank.c10_c99.I_Patterns;

import java.util.*;

public class c21_pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                // for (int j = n + 1 - i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
 * 6
 * 
 * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 * 
 * 
 * 
 */