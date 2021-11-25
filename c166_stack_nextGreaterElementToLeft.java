/* 1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to "next greater element on the left" for all elements of array
4. Input and output is handled for you.

"Next greater element on the left" of an element x is defined as the first element to left of x having value greater than x.
Note -> If an element does not have any element on it's left side greater than it, consider -1 as it's "next greater element on left" */

import java.util.*;

public class c166_stack_nextGreaterElementToLeft {
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
        int[] nger = new int[arr.length];
        Stack<Integer> st = new Stack<Integer>();

        nger[0] = -1;
        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            // - val +
            while (!st.empty() && arr[i] >= st.peek()) {
                st.pop();
            }
            if (st.empty()) {
                nger[i] = -1;
            } else {
                nger[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nger;
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
// -1-1 8 5-1