package in.co.codeWithMayank.c10_c99.I_Arrays;

import java.util.*;

public class c93_2darray_searchInSorted2dArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        // int m = scn.nextInt();
        // given in the question that it is a square matrix
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int key = scn.nextInt();
        scn.close();
        searchKeyIn2dArray(arr, key);
    }

    public static void searchKeyIn2dArray(int[][] arr, int key) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            int last = arr[i].length - 1;
            if (arr[i][0] <= key && key <= arr[i][last]) {
                if (binarySearch(arr, i, key)){
                    flag = true;
                    break;
                }
            }
        }
        if (flag == false) {
            System.out.println("Not Found");
        }
    }

    public static boolean binarySearch(int[][] arr, int i, int key) {
        int l = 0;
        int h = arr[i].length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[i][mid] == key) {
                System.out.println(i);
                System.out.println(mid);
                return true;
            } else if (arr[i][mid] < key) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return false;
    }
}