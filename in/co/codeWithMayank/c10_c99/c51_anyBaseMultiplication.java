package in.co.codeWithMayank.c10_c99;/* Any Base Multiplication
    1. You are given a base b.
    2. You are given two numbers n1 and n2 of base b.
    3. You are required to multiply n1 and n2 and print the value.

    Input Format
        A base b
        A number n1
        A number n2
 */

import java.util.*;

public class c51_anyBaseMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        scn.close();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2) {
        int ans = 0, p = 1;
        while (n2 > 0) {
            int d2 = n2 % 10;
            n2 = n2 / 10;

            int sdp = getProductWithSingleDigit(b, n1, d2);
            ans = getSum(ans, sdp * p, b);
            p = p * 10;
        }
        return ans;
    }

    public static int getProductWithSingleDigit(int b, int n1, int d2) {
        int ans = 0;
        int carry = 0, p = 1;
        while (n1 > 0 || carry > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;

            int d = d1 * d2 + carry;
            carry = d / b;
            d = d % b;

            ans += d * p;
            p = p * 10;
        }
        return ans;
    }

    public static int getSum(int n1, int n2, int b) {
        int ans = 0;
        int carry = 0, p = 1;
        while (n1 > 0 || n2 > 0 || carry > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int d = d1 + d2 + carry;
            carry = d / b;
            d = d % b;

            ans += d * p;
            p = p * 10;
        }
        return ans;
    }
}

// input
// 5
// 1220
// 31

// output
// 43320