package in.co.codeWithMayank.c01_c09;

import java.util.*;

public class c8_isPrime_v1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt(); // how many numbers do we want to check for prime or not

        for (int i = 0; i < t; i++) {
            int n = scn.nextInt(); // asking for number for prime check
            isPrime(n);
        }
        scn.close();
    }

    public static void isPrime(int n) {
        if (n <= 1) {
            System.out.println("not prime");
            return;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("prime");
    }
}