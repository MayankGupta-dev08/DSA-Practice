package in.co.codeWithMayank.c100_c199;// We have to print the number which is closest to n and is also divisible by m. In cases where we get more than 1 such numbers, we have to print the max out of all.

import java.util.*;

public class c160_test_numClosestToNAndDivissibleByM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        scn.close();
        int ans = solve(n, m);
        System.out.println(ans);
    }

    public static int solve(int n, int m) {
        int q = n / m;
        int ans1 = q * m;
        int ans2;

        if (n * m > 0) {
            ans2 = (q + 1) * m;
        } else {
            ans2 = (q - 1) * m;
        }

        if (Math.abs(ans1 - n) < Math.abs(ans2 - n)) {
            return ans1;
        } else {
            return ans2;
        }
    }
}