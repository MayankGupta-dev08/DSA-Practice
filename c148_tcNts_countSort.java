/* Count Sort - used for sorting those arrays which have very large no. of data but the range of min value and max value in the data is not that large or comparitively small. */

/* Time Complexity of quick sort is O(n*n) 
    -> And Space Complexity is O(n) 
    --> Important thing about count sort is that it is a stable sorting technique.
        => as if two things have same value then the one which was earlier encountered in the array will come earlier. */

import java.util.*;

public class c148_tcNts_countSort {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        int[] ans = countSort(arr);
        arr = ans;
        printArray(arr);
    }

    // time complexity is O(n)
    public static int[] countSort(int[] arr) {
        // finding the min and max value of the array
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        // creating freq array which later will be used as prefixSum array
        int[] freq = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            int valIdx = arr[i] - min; // becoz ideally idx of min will be 0 in frq array
            freq[valIdx]++;
        }

        // now converting our freq array into prefix sum array
        int[] prefixSum = freq;
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] += prefixSum[i - 1];
        }

        int[] ans = new int[arr.length];
        // reverse traversing arr & finding correctIdx of arr[i] and inseting arr[i] at
        // correctIdx in ans
        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i];
            int correctIdx = prefixSum[val - min] - 1;
            ans[correctIdx] = val;
            prefixSum[val - min]--;
        }

        // finally putting all values of ans into arr
        // for (int i = 0; i < ans.length; i++) {
        // arr[i] = ans[i];
        // }
        return ans;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}