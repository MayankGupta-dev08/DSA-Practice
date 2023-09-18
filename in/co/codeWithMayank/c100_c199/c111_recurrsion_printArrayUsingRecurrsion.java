package in.co.codeWithMayank.c100_c199;

import java.util.Scanner;

public class c111_recurrsion_printArrayUsingRecurrsion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        printArrayUsingRecurrsion(arr, 0);
    }

    public static void printArrayUsingRecurrsion(int[] arr, int idx) {
        if (idx >= arr.length) {
            return;
        }
        System.out.println(arr[idx++]);
        printArrayUsingRecurrsion(arr, idx);
    }
}