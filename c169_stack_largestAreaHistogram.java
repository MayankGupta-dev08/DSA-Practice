/* 1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing the height of bars in a bar chart.
3. You are required to find and print the area of largest rectangle in the histogram.

e.g.
for the array [6 2 5 4 5 1 6] -> 12
*/

import java.util.*;

public class c169_stack_largestAreaHistogram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        int ans = solve(arr);
        System.out.println(ans);
    }

    public static int solve(int[] arr) {
        int[] lftBound = nsel(arr);
        int[] rgtBound = nser(arr);

        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int width_i = rgtBound[i] - lftBound[i] - 1;
            int area_i = width_i * arr[i];
            maxArea = Math.max(maxArea, area_i);
        }

        return maxArea;
    }

    // nsel
    public static int[] nsel(int[] arr) {
        int[] nsel = new int[arr.length];
        Stack<Integer> st = new Stack<Integer>();

        nsel[0] = -1;
        st.push(0); // pushing index instead of values

        for (int i = 1; i < arr.length; i++) {
            // - val +
            while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if (st.empty()) {
                nsel[i] = -1;
            } else {
                nsel[i] = st.peek();
            }
            st.push(i);
        }
        return nsel;
    }

    // nser
    public static int[] nser(int[] arr) {
        int[] nser = new int[arr.length];
        Stack<Integer> st = new Stack<Integer>();

        nser[arr.length - 1] = arr.length;
        st.push(arr.length - 1); // pushing index instead of values

        for (int i = arr.length - 2; i >= 0; i--) {
            // - val +
            while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if (st.empty()) {
                nser[i] = arr.length;
            } else {
                nser[i] = st.peek();
            }
            st.push(i);
        }
        return nser;
    }
}

// n = 9
// arr = 2 5 9 3 1 12 6 8 7
// lftBound = -1 0 1 0 -1 4 4 6 6
// rgtBound = 4 3 3 4 9 6 9 8 9
