package in.co.codeWithMayank.c10_c99.I_Arrays;

import java.util.Scanner;

public class c76_array_subsetsOfArray_v2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        scn.close();
        printSubsetsOfArray_v2(arr);
    }

    public static void printSubsetsOfArray_v2(int[] arr) {
        int idx = 0;
        String ans_subset = "";
        printASubsetForGivenArray(arr, idx, ans_subset);
    }

    private static void printASubsetForGivenArray(int[] arr, int idx, String ans) {
        if (idx >= arr.length) {
            System.out.println(ans);
            return;
        }

        printASubsetForGivenArray(arr, idx + 1, ans);
        printASubsetForGivenArray(arr, idx + 1, ans + arr[idx] + " ");
    }
}