package in.co.codeWithMayank.c100_c199;/* 1. You are given a number n representing number of stairs in a staircase.
2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up. */

import java.util.ArrayList;
import java.util.Scanner;

public class c119_recurrsion_AL_getStairsPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        ArrayList<String> paths = getStairsPath_recurrsion(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairsPath_recurrsion(int n) {
        if (n == 0) {
            ArrayList<String> basePaths = new ArrayList<>();
            basePaths.add("");
            return basePaths;
            // this denotes that we have reached the dest and it is a valid path, so we will send one element in the array list which is empty string in which we could add something
        } else if (n < 0) {
            ArrayList<String> basePaths = new ArrayList<>();
            // here we are sending empty array list so, if we will try to traverse this, it won't.
            return basePaths;
        }

        ArrayList<String> paths1 = getStairsPath_recurrsion(n - 1);
        ArrayList<String> paths2 = getStairsPath_recurrsion(n - 2);
        ArrayList<String> paths3 = getStairsPath_recurrsion(n - 3);

        ArrayList<String> myPaths = new ArrayList<>();

        for (String path : paths1) {
            myPaths.add("1" + path);
        }
        for (String path : paths2) {
            myPaths.add("2" + path);
        }
        for (String path : paths3) {
            myPaths.add("3" + path);
        }

        return myPaths;
    }
}