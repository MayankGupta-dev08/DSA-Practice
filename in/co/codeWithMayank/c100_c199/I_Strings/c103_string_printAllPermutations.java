package in.co.codeWithMayank.c100_c199.I_Strings;

import java.util.Scanner;
// link of concept: https://www.youtube.com/watch?v=39SKIuA-ieY&list=PL-Jc9J83PIiFIKbdCKuYwsV8KaX-jHe0V&index=9

public class c103_string_printAllPermutations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();
//        allPermutations_iter(str);
        printAllPermutations_recursively(str);
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

    public static void printAllPermutations_recursively(String str) {
        String otp_str = "";
        getPermutationsOfAString_recur(str, otp_str);
    }

    private static void getPermutationsOfAString_recur(String inp_str, String otp_str) {
        if (inp_str.length() == 0) {
            System.out.println(otp_str);
            return;
        }

        for (int i = 0; i < inp_str.length(); i++) {
            String new_inp_str = inp_str.substring(0, i) + inp_str.substring(i + 1);
            getPermutationsOfAString_recur(new_inp_str, otp_str + inp_str.charAt(i));
        }
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