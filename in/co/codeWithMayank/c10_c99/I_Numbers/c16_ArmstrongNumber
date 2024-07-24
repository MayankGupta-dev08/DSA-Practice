package in.co.codeWithMayank.c10_c99.I_Numbers;

import java.util.*;
import java.lang.Math;

public class c16_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        System.out.println(isArmstrong(n));
    }

    public static boolean isArmstrong(int n) {
        int num = n, result = 0;
        int count = (int) Math.log10(n) + 1;

        while (num != 0) {
            int r = num % 10;
            result += (int) Math.pow(r, count);
            num /= 10;
        }

        return (result == n);
    }
}
