package in.co.codeWithMayank.c100_c199.I_Recursion;/* 1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right. */

import java.util.ArrayList;
import java.util.Scanner;

public class c120_recurrsion_AL_getMazePaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        // sr=0, sc=0 as starting (i,j) = (0,0)
        // sr=r-1, sc=c-1 as destination (i,j) = (r-1,c-1)
        ArrayList<String> paths = getMazePaths_recurrsion(0, 0, r - 1, c - 1);
        System.out.println(paths);
    }

    // sr - source row // sc - source column
    // dr - destination row // dc - destination column
    public static ArrayList<String> getMazePaths_recurrsion(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> basePaths = new ArrayList<>();
            basePaths.add("");
            return basePaths;
        } else if (sr > dr || sc > dc) {
            ArrayList<String> basePaths = new ArrayList<>();
            return basePaths;
        }

        ArrayList<String> hPaths = getMazePaths_recurrsion(sr, sc + 1, dr, dc);
        ArrayList<String> vPaths = getMazePaths_recurrsion(sr + 1, sc, dr, dc);

        ArrayList<String> myPaths = new ArrayList<>();

        for (String path : hPaths) {
            myPaths.add("h" + path);
        }
        for (String path : vPaths) {
            myPaths.add("v" + path);
        }

        return myPaths;
    }
}