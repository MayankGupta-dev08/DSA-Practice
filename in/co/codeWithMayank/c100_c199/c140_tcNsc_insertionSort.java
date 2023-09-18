package in.co.codeWithMayank.c100_c199;/* Time Complexity of insertion sort is O(n*n)
    -> And Space Complexity is O(1) */

import java.util.Scanner;

public class c140_tcNsc_insertionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        insertionSort(arr);
        printArray(arr);
    }

    // inserting ith idx element in its right place in the part of the array before
    // it, in this also n-1 outer iterations (start from i=1 as want to compare it
    // with i=0).
    // we will pause the inner iteration for an ith value as soon as the current jth
    // idx element is found to be greater that its prev element is the array.
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}

// input
// 5
// 7 -2 4 1 3

// output
// -2 1 3 4 7