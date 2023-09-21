package in.co.codeWithMayank.c100_c199.I_Strings;

import java.util.*;
// link of concept: https://www.youtube.com/watch?v=39SKIuA-ieY&list=PL-Jc9J83PIiFIKbdCKuYwsV8KaX-jHe0V&index=9

public class c103_string_printAllPermutations_iteratively {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();
        allPermutations_iter(str);
    }

    public static void allPermutations_iter(String str) {
        int n = str.length();
        int f = factorial(n);

        for (int i = 0; i < f; i++) {
            int temp = i;
            StringBuilder sb = new StringBuilder(str);
            for (int div = n; div >= 1; div--) {
                int q = temp / div;
                int r = temp % div;

                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;
            }
            System.out.println();
        }
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0)
            return 1;

        return (n * factorial(n - 1));
    }
}

// Total no. of permutations = n!

// sample input
// abc
// sample output
// abc
// bac
// cab
// acb
// bca
// cba