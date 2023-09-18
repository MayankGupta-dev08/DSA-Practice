package in.co.codeWithMayank.c100_c199;/* Print all the pairs having their sum equal to the target.
    |-> Constraints for this question:
        ==> time complexity = O(nlogn)
        ==> if (a,b) is a pair, then a<=b always
        ==> if (a,b) is a pair, then (b,a) is not valid as it is just repeatition */

import java.util.*;

public class c149_tcNsc_targetSumPair {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        scn.close();

        targetSumPair(arr, target);
    }

    // Arrays.sort(arr);    // function in java for sorting
    public static void targetSumPair(int[] arr, int target) {
        int[] ans = countSort(arr);
        arr = ans;

        int l = 0, h = arr.length-1;
        while (l < h) {
            if (arr[l] + arr[h] > target) {
                h--;
            } else if (arr[l] + arr[h] < target) {
                l++;
            } else {
                System.out.println(arr[l] + ", " + arr[h]);
                l++;
                h--;
            }
        }
    }

    public static int[] countSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        int[] freq = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            int valIdx = arr[i] - min;
            freq[valIdx]++;
        }

        int[] prefixSum = freq;
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] += prefixSum[i - 1];
        }

        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i];
            int correctIdx = prefixSum[val - min] - 1;
            ans[correctIdx] = val;
            prefixSum[val - min]--;
        }

        return ans;
    }

}

/* 
// Input
12
9
-48
100
43
84 
74 
86 
34 
-37 
60 
-29 
44
160

// Output
60, 100
74, 86 
*/