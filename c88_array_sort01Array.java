/* We can easily do by few methods-
    1.  sort the array - O(nlogn)
    2.  firstly counting the 0s and 1s in first iterations and then adding that number of 0s and 1s in same array 
    3.  calculating the sum of array and then giving values to the same array
    4.  better way is to traverse only once and arranging 0s and 1s simultaneously
*/

import java.util.*;

public class c88_array_sort01Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        scn.close();
        // sort01Array(arr); //after sorting zero pointer will be at the first one ie.
        // 0s array will be from 0 to z-1 and 1s will be z and arr.length-1
        // segregrate0s1s(arr);

        SortingO1Array(arr);
    }

    public static void sort01Array(int[] arr) {
        int zero = 0, one = 0;
        while (one < arr.length) {
            if (arr[one] == 1) {
                one++;
            } else if (arr[one] == 0) {
                swap(arr, zero, one);
                zero++;
                one++;
            }
        }
        printArray(arr);
    }

    // another way of doing the thing
    public static void segregrate0s1s(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            while (arr[l] == 0 && l < r)
                l++;

            while (arr[r] == 1 && l < r)
                r--;

            if (l < r) {
                swap(arr, l, r);
                l++;
                r--;
            }
        }
        printArray(arr);
    }

    public static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static void SortingO1Array(int[] arr) {
        int count = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 1) {
                arr[count] = arr[i];
                count--;
            }
        }
        while (count >= 0) {
            arr[count] = 0;
            count--;
        }
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

/*
 * 10 
 * 0 1 0 1 0 0 1 1 1 0 
 * 0 0 0 0 0 1 1 1 1 1
 */