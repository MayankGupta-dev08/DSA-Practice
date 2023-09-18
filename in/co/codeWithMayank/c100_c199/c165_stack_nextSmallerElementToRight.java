package in.co.codeWithMayank.c100_c199;/* 1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to "next smaller element on the right" for all elements of array
4. Input and output is handled for you.

"Next smaller element on the right" of an element x is defined as the first element to right of x having value smaller than x.
Note -> If an element does not have any element on it's right side smaller than it, consider -1 as it's "next smaller element on right" */

import java.util.*;

public class c165_stack_nextSmallerElementToRight {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        int[] ans = solve(arr);
        display(ans);
    }

    public static int[] solve(int[] arr) {
        int[] nser = new int[arr.length];
        Stack<Integer> st = new Stack<Integer>();

        nser[arr.length - 1] = -1;
        st.push(arr[arr.length - 1]);

        for (int i = arr.length - 2; i >= 0; i--) {
            // - val +
            while (st.size() > 0 && arr[i] <= st.peek()) {
                st.pop();
            }
            if (st.empty()) {
                nser[i] = -1;
            } else {
                nser[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nser;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

// 5
// 4 8 5 2 25
// 2 5 2 -1 -1