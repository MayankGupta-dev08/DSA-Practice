/* 1. You are given two sorted arrays(a,b) of integers.
2. You have to merge them and form one sorted array.
3. You have to do it in linear time complexity. */

import java.util.Scanner;

public class c141_tcNsc_mergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scn.nextInt();
        }
        scn.close();

        int[] mergedArray = mergeTwoSortedArrays(arr1, arr2);
        print(mergedArray);
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

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}

// input
// 4 -2 5 9 11 3 4 6 8

// output
// -2 4 5 6 8 9 11