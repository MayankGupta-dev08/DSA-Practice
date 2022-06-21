package com.myJW;

public class jc_b01 {
    public static void main (String[] args) {
        System.out.println("Hello World 🌏");

        int myMaxIntValue = Integer.MAX_VALUE;
        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println("Integer's Max Value = " + myMaxIntValue);
        System.out.println("Integer's Min Value = " + myMinIntValue);

        int myMaxInt_test1 = 2147483647;
        int myMaxInt_test2 = 2_147_483_647;
        System.out.println("myMaxInt_test1 = " + myMaxInt_test1);
        System.out.println("myMaxInt_test2 = " + myMaxInt_test2);

        char ch = 'D';
        char copyRight = '\u00A9';
        System.out.println(ch);

        // using unicode for copyright symbol - https://unicode-table.com/en/
        System.out.println(copyRight);


    }
}
