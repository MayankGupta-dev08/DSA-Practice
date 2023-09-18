package in.co.codeWithMayank.c100_c199;

import java.util.*;

public class c104_recurrsion_printDecreasingNto1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        printCountingNto1(n);
    }

    public static void printCountingNto1(int n) {
        if (n == 0)
            return;

        System.out.println(n);
        printCountingNto1(n - 1);
    }
}