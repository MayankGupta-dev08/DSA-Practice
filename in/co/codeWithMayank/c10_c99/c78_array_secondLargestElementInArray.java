package in.co.codeWithMayank.c10_c99;

import java.util.*;
public class c78_array_secondLargestElementInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        // int ans = get2ndLargestElement_brute(arr);
        int ans = get2ndLargestElement_optimal(arr);
        System.out.println(ans);
    }

    // For this time complexity is O(n)
        // easier would have been sorting the array and returning the first element from the last which is not equal to arr[arr.length-1]. for this time complexity = O(nlogn) would have been worse.
    public static int get2ndLargestElement_brute(int[] arr) {
        int first=arr[0], second = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            first = Math.max(first, arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=first){
                second = Math.max(second, arr[i]);
            }
        }
        return second;
    }

    // Better approach, only one traversal
    public static int get2ndLargestElement_optimal(int[] arr) {
        int first=arr[0], second = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }
            else if(arr[i]<first && arr[i]>second){
                second = arr[i];
            }
        }
        return second;
    }
}

/* 
6
12 35 1 10 34 1

34 
*/