package in.co.codeWithMayank.c100_c199;

import java.util.Scanner;

public class c157_dp_countPathsClimbingStairsWithJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int ans = climbingStairsWithJumps_tabulation(n, arr);
        System.out.println(ans);
    }

    public static int climbingStairsWithJumps_tabulation(int n, int[] arr) {
        int[] countPaths = new int[n + 1];
        countPaths[n] = 1;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j <= arr[i] && i + j < countPaths.length; j++) {
                countPaths[i] += countPaths[i + j];
            }
        }

        return countPaths[0];
    }
}