package in.co.codeWithMayank.c10_c99;

import java.util.Scanner;

public class c13_reverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        System.out.println("The reverse of " + n + " is: " + reverseNumber(n));
    }

    public static int reverseNumber(int num) {
        int count = countDigits(num);
        int multiplyer = (int) Math.pow(10, count - 1);
        int ans = 0;

        while (num > 0) {
            ans = ans + (num % 10) * multiplyer;
            num = num / 10;
            multiplyer = multiplyer / 10;
        }
        return ans;
    }

    private static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}

/*
 * 56389
 * 9
 * 8
 * 3
 * 6
 * 5
 */