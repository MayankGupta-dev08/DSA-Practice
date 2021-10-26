// Solving the problem of counting the possible number of stair paths if total number of stairs is given.
// Similar to question - c124
// question aka --> count paths for climibing stairs if jump sizes possible are 1, 2, and 3 

import java.util.Scanner;

public class c156_dp_countStairPaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int ans1 = countStairPaths_recurr(n);
        System.out.println(ans1);

        int ans2 = countStairPaths_memoization(n, new int[n + 1]);
        System.out.println(ans2);

        int ans3 = countStairPaths_tabulation(n);
        System.out.println(ans3);
    }

    public static int countStairPaths_recurr(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }

        int c1 = countStairPaths_recurr(n - 1);
        int c2 = countStairPaths_recurr(n - 2);
        int c3 = countStairPaths_recurr(n - 3);
        int totalPaths = c1 + c2 + c3;

        return totalPaths;
    }

    public static int countStairPaths_memoization(int n, int[] ansBank) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }

        if (ansBank[n] != 0) {
            return ansBank[n];
        }

        int c1 = countStairPaths_memoization(n - 1, ansBank);
        int c2 = countStairPaths_memoization(n - 2, ansBank);
        int c3 = countStairPaths_memoization(n - 3, ansBank);
        int totalPaths = c1 + c2 + c3;
        ansBank[n] = totalPaths;

        return totalPaths;
    }

    // Steps of tabulation-
        // 1. create storage and assign meaning to it (what does each cell mean)
        // 2. identify the direction in which you will fill cells -> move from smaller
            // problem towards bigger problem
        // 3. travel and solve
    public static int countStairPaths_tabulation(int n) {
        int[] countPath = new int[n + 1];

        countPath[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                countPath[i] = countPath[i - 1];
            } else if (i == 2) {
                countPath[i] = countPath[i - 1] + countPath[i - 2];
            } else {
                countPath[i] = countPath[i - 1] + countPath[i - 2] + countPath[i - 3];
            }
        }

        return countPath[n];
    }
}

// 10
// 274
// 274
// 274