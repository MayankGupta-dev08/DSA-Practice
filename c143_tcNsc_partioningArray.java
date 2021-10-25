import java.util.*;

public class c143_tcNsc_partioningArray {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int pivot = scn.nextInt();
        scn.close();

        partition(arr, pivot);
        printArray(arr);
    }

    // Algo for this is that we will use two pointers i and j, and compare arr[i]
    // there will be 3 regions -->
    // ----> unknown (i to end and when loop for i gets over this regin finishes),
    // ----> arr[i]<= pivot (0 to j-1),
    // ----> arr[i]> pivot (j to i-1),
    public static void partition(int[] arr, int pivot) {
        int i = 0, j = 0;
        while (i <= arr.length - 1) {
            if (arr[i] > pivot) {
                i++;
            } else if (arr[i] <= pivot) {
                swap(arr, i, j);
                i++;
                j++;
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