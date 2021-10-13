/* 1. You are given a number x.
2. You are given another number n.
3. You are required to calculate x raised to the power n. Don't change the signature of power function.

Note1 -> The previous version expects the call stack to be of n height. This function expects call function to be only log(n) high. */

import java.util.*;

public class c108_recurrsion_powerLogarithmic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        scn.close();
        if (n < 0) {
            float fans = (float) powerLogarithmic(x, n * (-1));
            System.out.println(1 / fans);
        } else {
            int ans = powerLogarithmic(x, n);
            System.out.println(ans);
        }
    }

    public static int powerLogarithmic(int x, int n) {
        if (n == 0)
            return 1;

        int xpnby2 = powerLogarithmic(x, n / 2);
        int xn = xpnby2 * xpnby2;

        if (n % 2 == 1)
            xn = xn * x;

        return xn;
    }
}
