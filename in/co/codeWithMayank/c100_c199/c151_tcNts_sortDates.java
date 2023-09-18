package in.co.codeWithMayank.c100_c199;

import java.util.*;

public class c151_tcNts_sortDates {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.next();
        }
        scn.close();

        sortDates(arr);
        printArray(arr);
    }

    // applying radix sort with slight modification
    public static void sortDates(String[] arr) {
        // in radix sort, firstly choose part which has least priority and then move
        // from least to most priority, so in numbers it was places of O, T, H where
        // Hundred's places had most priority
        // in dates year has most, followed by months and then days

        countSort(arr, 1000000, 100, 32); // for days
        countSort(arr, 10000, 100, 13); // for months
        countSort(arr, 1, 10000, 2501); // for year
    }

    public static void countSort(String[] arr, int div, int mod, int range) {
        int[] freq = new int[range];
        for (int i = 0; i < arr.length; i++) {
            int valIdx = ((Integer.parseInt(arr[i], 10) / div) % mod);
            freq[valIdx]++;
        }

        int[] prefixSum = freq;
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] += prefixSum[i - 1];
        }

        String[] ans = new String[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int val = ((Integer.parseInt(arr[i], 10) / div) % mod);
            int correctIdx = prefixSum[val] - 1;
            ans[correctIdx] = arr[i]; // adding original value of arr[i]
            prefixSum[val]--;
        }

        for (int i = 0; i < ans.length; i++) {
            arr[i] = ans[i];
        }
    }

    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}