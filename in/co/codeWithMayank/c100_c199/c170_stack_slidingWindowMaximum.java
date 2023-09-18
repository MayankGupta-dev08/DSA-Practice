package in.co.codeWithMayank.c100_c199;/* 1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing the elements of array a.
3. You are given a number k, representing the size of window.
4. You are required to find and print the maximum element in every window of size k.

e.g.
for the array [2 9 3 8 1 7 12 6 14 4 32 0 7 19 8 12 6] and k = 4, the answer is [9 9 8 12 12 14 14 32 32 32 32 19 19 19]
*/

import java.util.*;

public class c170_stack_slidingWindowMaximum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        scn.close();
        int[] ans = slidingWindowMaximum(arr, k);
        display(ans);
    }

    public static int[] slidingWindowMaximum(int[] arr, int k) {
        int[] result = new int[arr.length - k + 1];
        int[] nger = solve_nger(arr);

        for (int i = 0; i < arr.length - k + 1; i++) {
            int j = i;
            while (nger[j] < i + k) {
                j = nger[j];
            }
            // System.out.println(arr[j]);
            result[i] = arr[j];
        }
        return result;
    }

    public static int[] solve_nger(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<Integer>();

        ans[arr.length - 1] = arr.length;
        st.push(arr.length - 1);

        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
                st.pop();
            }
            if (st.empty()) {
                ans[i] = arr.length;
            } else {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}