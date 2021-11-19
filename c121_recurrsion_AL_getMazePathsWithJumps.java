/* 1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. 
3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right. */

import java.util.ArrayList;
import java.util.Scanner;

public class c121_recurrsion_AL_getMazePathsWithJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        // sr=0, sc=0 as starting (i,j) = (0,0)
        // sr=r-1, sc=c-1 as destination (i,j) = (r-1,c-1)
        ArrayList<String> paths = getMazePathsWithJumps(0, 0, r - 1, c - 1);
        System.out.println(paths);
    }

    // sr - source row // sc - source column
    // dr - destination row // dc - destination column
    public static ArrayList<String> getMazePathsWithJumps(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> basePaths = new ArrayList<>();
            basePaths.add("");
            return basePaths;
        }

        ArrayList<String> myPaths = new ArrayList<>();

        // for horizontal moves --> one can take a min step of 1 and max step of (dc-sc)
        for (int hStep = 1; hStep <= (dc - sc); hStep++) {
            ArrayList<String> hPaths = getMazePathsWithJumps(sr, sc + hStep, dr, dc);
            for (String path : hPaths) {
                myPaths.add("h" + hStep + path);
            }
        }

        // for vertical moves --> one can take a min step of 1 and max step of (dr-sr)
        for (int vStep = 1; vStep <= (dr - sr); vStep++) {
            ArrayList<String> vPaths = getMazePathsWithJumps(sr + vStep, sc, dr, dc);
            for (String path : vPaths) {
                myPaths.add("v" + vStep + path);
            }
        }

        // for diagonal moves --> one can take a min step of 1 and max step such that it
        // is always less than (dc-sc) && (dr-sr)
        for (int dStep = 1; dStep <= (dc - sc) && dStep <= (dr - sr); dStep++) {
            ArrayList<String> dPaths = getMazePathsWithJumps(sr + dStep, sc + dStep, dr, dc);
            for (String path : dPaths) {
                myPaths.add("d" + dStep + path);
            }
        }

        return myPaths;
    }
}

// Input
// 2
// 3

// Output
// [h1h1v1, h1v1h1, h1d1, h2v1, v1h1h1, v1h2, d1h1]