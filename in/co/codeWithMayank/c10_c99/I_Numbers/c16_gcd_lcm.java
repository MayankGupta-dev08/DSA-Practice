package in.co.codeWithMayank.c10_c99;// gcd of two numbers = greatest common divisor or hcf
// lcm of two numbers = lowest common multiple

import java.util.Scanner;

public class c16_gcd_lcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt(); // 24
        int n2 = scn.nextInt(); // 36
        scn.close();
        int prd = n1 * n2;

        // divisor method of finding gcd
        while (n1 % n2 != 0) { // it doesn't matter which is smaller, it will correct after one iteration if
                               // n1<n2
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }

        int gcd = n2; // from above we have made n2 such that n1%n2=0, for this n2 is gcd
        int lcm = prd / gcd; // property --> gcd*lcm = n1*n2

        System.out.println("gcd: " + gcd);
        System.out.println("lcm: " + lcm);
    }
}

/*
 * 24
 * 36
 * gcd: 12
 * lcm: 72
 */