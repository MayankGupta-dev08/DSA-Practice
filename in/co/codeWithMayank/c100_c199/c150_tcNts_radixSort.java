package in.co.codeWithMayank.c100_c199;/* Radix Sort - generally used for sorting arrays whose elements are in combination of two, three or more things which have their own priority for sort, for example dates --> dd-mm-yyyy, highest precedence is for year, then month and then date, but for each of them they have their own sorting range and order. */

/* Time Complexity of quick sort is O(n*n) 
    -> And Space Complexity is O(n) 
    --> Important thing about radix sort is that it is a stable sorting technique, as it uses count sort for doing its work.
        => as if two things have same value then the one which was earlier encountered in the array will come earlier. */

import java.util.*;

public class c150_tcNts_radixSort {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        radixSort(arr);
        printArray(arr);
    }

    public static void radixSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            max = Math.max(max, val);
        }

        int exp = 1;
        while (exp <= max) {
            countSort(arr, exp);
            exp *= 10;
        }
    }

    public static void countSort(int[] arr, int exp) {
        int[] freq = new int[10]; // since only 10 digits from 0 to 9
        for (int i = 0; i < arr.length; i++) {
            int valIdx = ((arr[i] / exp) % 10);
            freq[valIdx]++;
        }

        int[] prefixSum = freq;
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] += prefixSum[i - 1];
        }

        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int val = ((arr[i] / exp) % 10);
            int correctIdx = prefixSum[val] - 1;
            ans[correctIdx] = arr[i]; // adding original value of arr[i]
            prefixSum[val]--;
        }

        for (int i = 0; i < ans.length; i++) {
            arr[i] = ans[i];
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}