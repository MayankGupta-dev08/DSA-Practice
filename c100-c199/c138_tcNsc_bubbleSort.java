/* Time Complexity of bubble sort is O(n*n)
    -> And Space Complexity is O(1) */

import java.util.Scanner;

public class c138_tcNsc_bubbleSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        bubbleSort(arr);
        printArray(arr);
    }

    // in every iteration of i we will send the largest element to the end.
    // so if n-1 largest elements are arranged then whole array is sorted, so total
    // outer iterations --> n-1
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

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