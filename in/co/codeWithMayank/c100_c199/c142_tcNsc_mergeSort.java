package in.co.codeWithMayank.c100_c199;/* Time Complexity of merge sort is O(n*logn)
    -> And Space Complexity is O(n) */

import java.util.Scanner;

public class c142_tcNsc_mergeSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        int[] ans = mergeSort(arr, 0, arr.length - 1);
        printArray(ans);
    }

    // Algo - we will use recurrsion + mergeTwoSortedArray. We will divide the array
    // into two equal halves and expect our code to give us the sorted version of
    // those array using recurrsion and the merge both of them.
    public static int[] mergeSort(int[] arr, int l, int h) {
        if (l == h) {
            int[] baseArr = new int[1];
            baseArr[0] = arr[l];
            return baseArr;
        }

        int mid = l+ (h-l) / 2;
        int[] leftPart = mergeSort(arr, l, mid);
        int[] rightPart = mergeSort(arr, mid + 1, h);

        int[] mergedArr = mergeTwoSortedArrays(leftPart, rightPart);
        return mergedArr;
    }

    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int i = 0, j = 0, idx = 0;
        int[] mergedArray = new int[n + m];

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                mergedArray[idx] = arr1[i];
                i++;
                idx++;
            } else {
                mergedArray[idx] = arr2[j];
                j++;
                idx++;
            }
        }

        while (i < n) {
            mergedArray[idx] = arr1[i];
            i++;
            idx++;
        }

        while (j < m) {
            mergedArray[idx] = arr2[j];
            j++;
            idx++;
        }

        return mergedArray;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}

// input
// 8
// 7 4 1 3 6 8 2 5

// output
// 1 2 3 4 5 6 7 8