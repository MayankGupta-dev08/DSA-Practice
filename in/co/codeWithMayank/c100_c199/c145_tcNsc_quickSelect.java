package in.co.codeWithMayank.c100_c199;

import java.util.*;

public class c145_tcNsc_quickSelect {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt(); // kth smallest element of the array
        // means (k-1)th index from the array
        scn.close();

        int ans = quickSelect(arr, 0, arr.length - 1, k - 1);
        System.out.println(ans);
    }

    // similar to quick sort but now only calling for only that part of the array
    // from the pivotIdx which has value of k
    public static int quickSelect(int[] arr, int lo, int hi, int kIdx) {
        int pivot = arr[hi];
        int pvtIdx = partition(arr, pivot, lo, hi);

        if (pvtIdx == kIdx) {
            return arr[pvtIdx];
        } else if (pvtIdx > kIdx) {
            return quickSelect(arr, lo, pvtIdx - 1, kIdx);
        } else {
            return quickSelect(arr, pvtIdx + 1, hi, kIdx);
        }
    }

    public static int partition(int[] arr, int pivot, int lo, int hi) {
        int i = lo, j = lo;
        while (i <= hi) {
            if (arr[i] <= pivot) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }
        return (j - 1);
    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}