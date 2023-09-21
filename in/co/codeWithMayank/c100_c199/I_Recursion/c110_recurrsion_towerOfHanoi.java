package in.co.codeWithMayank.c100_c199.I_Recursion;

import java.util.Scanner;

public class c110_recurrsion_towerOfHanoi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // no of disc
        char tSId = scn.next().charAt(0);
        char tHId = scn.next().charAt(0);
        char tDId = scn.next().charAt(0);
        scn.close();
        towerOfHanoi(n, tSId, tHId, tDId);
    }

    // /* Steps -
    // 1. Using the function we will we move all (n-1) disc from source to helper
    // using destination (following all the rules, this is our faith).
    // 2. now we will move the last disc from source to destination tower (using
    // this function stack frame only print the step), so that it is finally at its
    // correct position.
    // 3. now we will again call our function to move all (n-1) discs from helper to
    // destination using source tower, by following all rules. */

    public static void towerOfHanoi(int n, char tSId, char tHId, char tDId) {
        if (n == 0)
            return;

        towerOfHanoi(n - 1, tSId, tDId, tHId);
        System.out.println(n + "[" + tSId + " -> " + tDId + "]");
        towerOfHanoi(n - 1, tHId, tSId, tDId);
    }
}