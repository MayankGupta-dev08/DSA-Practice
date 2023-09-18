package in.co.codeWithMayank.c10_c99.I_Arrays;/* Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function. */

/*
Solution1 -   Sort the array - O(nlogn)
Solution2 -   Count the number of 0s 1s and 2s and then put in the array - O(n), twice traverse
*/


import java.util.*;
public class c89_array_sort0s1s2sArray_DNFsort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
            arr[i] = scn.nextInt();

        scn.close();
        DNFsort(arr);
    }

    public static void DNFsort(int[] arr) {
        int low=0, mid=0;
        int high=arr.length;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr, low, mid);
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else if(arr[mid]==2){
                swap(arr, mid, high);
                high--;
            }
        }
        printArray(arr);
    }

    public static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}