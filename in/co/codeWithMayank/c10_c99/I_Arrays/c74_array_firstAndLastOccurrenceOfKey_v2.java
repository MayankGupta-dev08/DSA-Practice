package in.co.codeWithMayank.c10_c99.I_Arrays;

/*
  Given array is sorted but consists of duplicate elements and question is to find the first and last index for a given key in the array
 */

import java.util.Scanner;

public class c74_array_firstAndLastOccurrenceOfKey_v2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter total number of elements in the array: ");
        int n = scn.nextInt();

        System.out.println("Enter the numbers in the sorted array!");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        System.out.print("Key for which we need to evaluate the first and last indices: ");
        int key = scn.nextInt();
        scn.close();
        firstIndexAndLastIndexOfKeyInSortedArray(arr, key);
    }

    public static void firstIndexAndLastIndexOfKeyInSortedArray(int[] arr, int key) {
        int fi = modifiedBinarySearchAlgoForThisProblem(arr, key, true);
        System.out.print("First idx for the key=" + key + " in the array: " + fi);
        System.out.println();
        int li = modifiedBinarySearchAlgoForThisProblem(arr, key, false);
        System.out.print("First idx for the key=" + key + " in the array: " + li);
    }

    private static int modifiedBinarySearchAlgoForThisProblem(int[] arr, int key, boolean toFindFirstIdx) {
        int lo = 0, hi = arr.length - 1;
        int idxToFind = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < arr[mid])
                hi = mid - 1;
            else if (key > arr[mid])
                lo = mid + 1;
            else {   // key==arr[mid]
                idxToFind = mid;
                if (toFindFirstIdx)
                    hi = mid - 1;
                else
                    lo = mid + 1;
            }
        }
        return idxToFind;
    }
}