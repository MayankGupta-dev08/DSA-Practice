package in.co.codeWithMayank.c10_c99;

import java.util.*;

public class c10_firstNFibonacciNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        scn.close();
        if (num <= 0) System.out.println("Invalid input");
        else printFibonacciSeriesTillN(num);
    }

    public static void printFibonacciSeriesTillN(int num) {
        int a = 0, b = 1;
        for (int i = 1; i <= num; i++) {
            int c = a + b;
            System.out.println(a);
            a = b;
            b = c;
        }
    }
}

/*
 * 11
 *
 * 0
 * 1
 * 1
 * 2
 * 3
 * 5
 * 8
 * 13
 * 21
 * 34
 * 55
 */