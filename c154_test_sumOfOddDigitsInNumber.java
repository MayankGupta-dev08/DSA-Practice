/* 1. You are given an number N.
2. You need to find the sum of odd digits present in the number N */

import java.util.*;

public class c154_test_sumOfOddDigitsInNumber {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int sumOdd = getOddSum(n);
        System.out.println(sumOdd);
    }

    public static int getOddSum(int n) {
        if (n == 0) {
            return 0;
        }

        int r = n % 10;
        n = n / 10;
        int restOfSum = getOddSum(n);
        if (r % 2 != 0) {
            return (r + restOfSum);
        } else {
            return restOfSum;
        }
    }

}

// input
// 22756
// output
// 12