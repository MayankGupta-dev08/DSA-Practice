/* 1. You are given a number n, representing the number of people in a party.
2. You are given n strings of n length containing 0's and 1's
3. If there is a '1' in ith row, jth spot, then person i knows about person j.
4. A celebrity is defined as somebody who knows no other person than himself but everybody else knows him.
5. If there is a celebrity print it's index otherwise print "none". */

import java.util.*;

public class c177_stack_celebrityProblem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();
        int ans = findCelebrity(arr);
        System.out.println(ans);
    }

    // celebrity - with row full of 0s and column other than where i==j is full of 1
    // at max 1 celebrity is possible, and none is also possible
    public static int findCelebrity(int[][] arr) {
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }

        while (st.size() >= 2) {
            int i = st.pop();
            int j = st.pop();

            if (arr[i][j] == 1) {
                // if i knows j --> i is not a celebrity
                // but we can't say about j
                st.push(j);
            } else {
                // i doesn't know j --> (not everyone knows j) --> j is not a celebrity
                // but we can't say about i
                st.push(i);
            }
        }

        int potent = st.peek();
        // now checking for potential candidate
        for (int i = 0; i < arr.length; i++) {
            if (i != potent) {
                if (arr[potent][i] == 1 || arr[i][potent] == 0) {
                    return -1;
                }
            }
        }
        return potent;
    }
}
