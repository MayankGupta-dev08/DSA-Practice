// asking for two numbers low and high and printing prime numbers from low to high, [low, high].

import java.util.Scanner;

public class c9_allPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        scn.close();

        System.out.println("prime numbers from " + low + " to " + high + " are:");
        printPrimesFromLow_High(low, high);
    }

    public static void printPrimesFromLow_High(int low, int high) {
        for (int i = low; i <= high; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

/*
 * 6
 * 24
 * prime numbers from 6 to 24 are:
 * 7
 * 11
 * 13
 * 17
 * 19
 * 23
 */