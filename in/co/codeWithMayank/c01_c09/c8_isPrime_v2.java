package in.co.codeWithMayank.c01_c09;

import java.util.*;

public class c8_isPrime_v2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt(); // how many numbers do we want to check for prime or not

        for (int i = 0; i < t; i++) {
            int n = scn.nextInt(); // asking for number for prime check
            if (isPrime(n))
                System.out.println("prime");
            else
                System.out.println("Not prime");
        }
        scn.close();
    }


    // The algorithm can be improved further by observing that all primes are of the form 6k ± 1, with the exception of 2 and 3. This is because all integers can be expressed as (6k + i) for some integer k and for i = ?1, 0, 1, 2, 3, or 4; 2 divides (6k + 0), (6k + 2), (6k + 4); and 3 divides (6k + 3). So a more efficient method is to test if n is divisible by 2 or 3, then to check through all the numbers of form 6k ± 1. (Source: wikipedia)

    public static boolean isPrime(int n) {
        // corner cases
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        // so that we can skip middle five numbers in the below loop
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i += 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false;

        return true;
    }
}