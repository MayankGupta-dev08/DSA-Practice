package in.co.codeWithMayank.c100_c199;/* Pivot element is that element in the sorted rotated array which is the minimum value in the array, ie. (whose index was 0 before rotation of sorted array was done) and After sorting its index becomes the number of times rotation happens.
    Crux:
        1. pivot element = min element
        2. pivot idx = number of times sorted array is rotated */

import java.util.*;

public class c152_tcNsc_findPivotInSortedRotatedArray {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        // int pivotIdx = findPivot(arr);
        int pivotIdx = findPivotIdx(arr);
        System.out.println(arr[pivotIdx]);
    }

    // brute force approach - O(n)
    public static int findPivot(int[] arr) {
        // for array in asc order
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i + 1;
            }
        }
        return 0;
    }

    // better approach - O(log(n)) --> binary search
    // on binary search mid will be min element - smaller than both adjacents
    // also to move --> min will be found in unsorted half of array
    public static int findPivotIdx(int[] arr) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int next = (mid + 1) % arr.length;
            int prev = (mid - 1 + arr.length) % arr.length;
            if (arr[mid] < arr[next] && arr[mid] < arr[prev]) {
                return mid;
            } else if (arr[mid] > arr[hi]) {
                lo = mid + 1;
            } else { // arr[lo] > arr[mid]
                hi = mid - 1;
            }
        }
        return -1;
    }
}