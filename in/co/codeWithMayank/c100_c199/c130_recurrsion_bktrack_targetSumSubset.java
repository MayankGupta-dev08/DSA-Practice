package in.co.codeWithMayank.c100_c199;/* 1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are given a number "tar".
4. Complete the body of printTargetSumSubsets function - without changing signature - to calculate and print all subsets of given elements, the contents of which sum to "tar". Use sample input and output to get more idea.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
 */

import java.util.Scanner;

public class c130_recurrsion_bktrack_targetSumSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        sc.close();
        printTargetSumSubsets_recurrsion(arr, 0, target, "", 0);
    }

    // sos --> sum of subset
    public static void printTargetSumSubsets_recurrsion(int[] arr, int idx, int target, String subset, int sos) {
        if (idx == arr.length) {
            if (sos == target) {
                System.out.println(subset + ".");
            }
            return;
        }

        printTargetSumSubsets_recurrsion(arr, idx + 1, target, subset + arr[idx] + ", ", sos + arr[idx]);
        printTargetSumSubsets_recurrsion(arr, idx + 1, target, subset, sos);
    }
}