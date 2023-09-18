package in.co.codeWithMayank.c100_c199;/* 1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing the prices of a share on n days.
3. You are required to find the stock span for n days.
4. Stock span is defined as the number of days passed between the current day and the first day before today when price was higher than today.

The span Si of the stock’s price on a given day i is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the current day is less than its price on the given day. 
For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85}, then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}
*/

import java.util.*;

public class c168_stack_stockSpanProblem {
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

    // ngel
    public static int[] solve(int[] arr) {
        int[] stkspn = new int[arr.length];
        Stack<Integer> st = new Stack<Integer>();

        stkspn[0] = 1;
        st.push(0); // pushing index instead of values

        for (int i = 1; i < arr.length; i++) {
            // - val +
            while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
                st.pop();
            }
            if (st.empty()) {
                stkspn[i] = i + 1;
            } else {
                stkspn[i] = i - st.peek();
            }
            st.push(i);
        }
        return stkspn;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

// 7
// 100 80 60 70 60 75 85
// 1 1 1 2 1 4 6

// 9
// 2 5 9 3 1 12 6 8 7
// 1 2 3 1 1 6 1 2 1