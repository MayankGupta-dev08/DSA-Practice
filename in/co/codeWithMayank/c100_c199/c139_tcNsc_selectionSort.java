package in.co.codeWithMayank.c100_c199;/* Time Complexity of selection sort is O(n*n)
    -> And Space Complexity is O(1) */

import java.util.Scanner;

public class c139_tcNsc_selectionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        selectionSort(arr);
        printArray(arr);
    }

    // firstly assuming ith idx is min and then for ith idx finding minIdx using
    // inner loop and then at the end of inner loop swapping ith idx with minIdx.
    // If n-1 smallest elements are sorted, then whole array of size n is sorted, so
    // total outer iterations --> n-1
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    // for selection sort - minimum swaps = n-1

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