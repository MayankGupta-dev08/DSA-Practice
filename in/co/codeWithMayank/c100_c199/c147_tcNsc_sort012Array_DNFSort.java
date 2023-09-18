package in.co.codeWithMayank.c100_c199;

import java.util.*;

public class c147_tcNsc_sort012Array_DNFSort {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        sort012Array(arr);
        printArray(arr);
    }

    // use concept of partioning of Array
    // assume pivot to be 0 and if we encounter 2 in arr[op], then
    // swap(arr[op] and arr[tp]) and only tp-- also condition will be op<tp
    public static void sort012Array(int[] arr) {
        int zp = 0, op = 0, tp = arr.length - 1;
        while (op <= tp) {
            if (arr[op] == 1) { // if(arr[i]>0)
                op++;
            } else if (arr[op] == 0) { // else if (arr[i] <= 0)
                swap(arr, op, zp);
                op++;
                zp++;
            } else if (arr[op] == 2) {
                swap(arr, op, tp);
                tp--;
            }
        }
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