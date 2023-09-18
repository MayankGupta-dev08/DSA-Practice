package in.co.codeWithMayank.c100_c199;/* Time Complexity of quick sort in:
    1. worst case is O(n*n) 
    1. average case is O(n*logn) 

-> And Space Complexity is O(n) */

import java.util.*;

public class c144_tcNsc_quickSort {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    // every time function is invoked, it places the pivot element to its correct
    // place of the final sorted array and this is achieved using recurrsion and
    // array partion algo
    public static void quickSort(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        int pivot = arr[hi];
        int pvtIdx = partition(arr, pivot, lo, hi);
        quickSort(arr, lo, pvtIdx - 1);
        quickSort(arr, pvtIdx + 1, hi);
    }

    // ----> arr[i]<= pivot (0 to j-1),
    // ----> arr[i]> pivot (j to i-1),
    public static int partition(int[] arr, int pivot, int lo, int hi) {
        int i = lo, j = lo;
        while (i <= hi) {
            if (arr[i] > pivot) {
                i++;
            } else if (arr[i] <= pivot) {
                swap(arr, i, j);
                i++;
                j++;
            }
        }
        return (j - 1); // pivot index
    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}