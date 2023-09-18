package in.co.codeWithMayank.c10_c99.I_Numbers;

import java.util.Scanner;

public class c11_countDigitsInNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        scn.close();
        System.out.println("total digits: " + countDigits(num));
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}

/*
 * 65784383
 * total digits: 8
 */