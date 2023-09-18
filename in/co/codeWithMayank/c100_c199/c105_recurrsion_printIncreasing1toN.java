package in.co.codeWithMayank.c100_c199;

import java.util.*;

public class c105_recurrsion_printIncreasing1toN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        printCounting1toN(n);
    }

    public static void printCounting1toN(int n) {
        if (n == 0)
            return;

        printCounting1toN(n - 1);
        System.out.println(n);
    }
}