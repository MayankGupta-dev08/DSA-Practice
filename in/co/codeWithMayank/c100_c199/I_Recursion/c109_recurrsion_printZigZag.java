package in.co.codeWithMayank.c100_c199.I_Recursion;

import java.util.Scanner;

public class c109_recurrsion_printZigZag {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        printZigZag(n);
    }

    public static void printZigZag(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        printZigZag(n - 1);
        System.out.print(n + " ");
        printZigZag(n - 1);
        System.out.print(n + " ");
    }
}

// Input
// 3

// Output
// 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3