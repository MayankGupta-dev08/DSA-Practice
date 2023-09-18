package in.co.codeWithMayank.c100_c199;// Memoization in Dynamic Programming Algorithm

import java.util.Scanner;

public class c155_dp_nthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int ans = nthFibonacci_Memoization(n, new int[n + 1]);
        System.out.println(ans);
    }

    public static int nthFibonacci_Memoization(int n, int[] smlFibVals) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (smlFibVals[n] != 0) {
            return smlFibVals[n];
        }

        int fibnm1 = nthFibonacci_Memoization(n - 1, smlFibVals);
        int fibnm2 = nthFibonacci_Memoization(n - 2, smlFibVals);
        int nthFib = fibnm1 + fibnm2;

        smlFibVals[n] = nthFib;
        return nthFib;
    }
}

// 0,1,1,2,3,5,8,13,21,34,55

// input
// 10
// output
// 55