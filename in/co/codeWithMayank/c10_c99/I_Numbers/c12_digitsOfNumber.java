package in.co.codeWithMayank.c10_c99.I_Numbers;

import java.util.Scanner;

public class c12_digitsOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        digitsOfNumber(n);
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static void digitsOfNumber(int num) {
        int count = countDigits(num);

        int divisor = (int) Math.pow(10, count - 1);
        while (divisor != 0) {
            System.out.println(num / divisor);
            num = num % divisor;
            divisor = divisor / 10;
        }
    }
}

/*
 * 564321
 * 5
 * 6
 * 4
 * 3
 * 2
 * 1
 */