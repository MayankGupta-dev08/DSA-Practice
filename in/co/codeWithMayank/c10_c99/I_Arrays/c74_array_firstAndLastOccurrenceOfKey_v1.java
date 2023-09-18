package in.co.codeWithMayank.c10_c99.I_Arrays;

/*
  Given array is sorted but consists of duplicate elements and question is to find the first and last index for a given key in the array
 */

import java.util.Scanner;

public class c74_array_firstAndLastOccurrenceOfKey_v1 {
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
        firstAndLastOccurrence(arr, key);
    }

    public static void firstAndLastOccurrence(int[] arr, int key) {
        int start = 0, end = arr.length - 1;
        int first = -1, last = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                while (arr[mid - 1] == key)
                    mid--;
                first = mid;
                while (arr[mid + 1] == key)
                    mid++;
                last = mid;
                break;
            }
            if (arr[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;
        }
        System.out.println(first);
        System.out.println(last);
    }
}