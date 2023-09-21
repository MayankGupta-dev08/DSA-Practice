package in.co.codeWithMayank.c100_c199.I_Recursion;

import java.util.Scanner;

public class c115_recurrsion_lastIndexOfKey {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int key = scn.nextInt();
        scn.close();
        int ans = lastIndexOfKey_recurrsion(arr, 0, key);
        System.out.println(ans);
    }

    public static int lastIndexOfKey_recurrsion(int[] arr, int idx, int key) {
        if (idx == arr.length) {
            return -1;
        }

        int lidx = lastIndexOfKey_recurrsion(arr, idx + 1, key);
        if (lidx == -1 && arr[idx] == key) {
            return idx;
        }
        return lidx;
    }
}