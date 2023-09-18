package in.co.codeWithMayank.c100_c199;/* 1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a. The numbers can be 1 or 0 only.
4. You are standing in the top-left corner and have to reach the bottom-right corner. 
Only four moves are allowed 't' (1-step up), 'l' (1-step left), 'd' (1-step down) 'r' (1-step right). You can only move to cells which have 0 value in them. You can't move out of the boundaries or in the cells which have value 1 in them (1 means obstacle)
5. Complete the body of floodfill function - without changing signature - to print all paths that can be used to move from top-left to bottom-right.

Note1 -> Please check the sample input and output for details
Note2 -> If all four moves are available make moves in the order 't', 'l', 'd' and 'r' */

import java.util.Scanner;

public class c129_recurrsion_bktrack_floodFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        boolean[][] visited = new boolean[r][c]; // by default all values will be false
        floodFill_backtracking(arr, 0, 0, "", visited);
    }

    public static void floodFill_backtracking(int[][] maze, int sr, int sc, String path, boolean[][] visited) {
        if (sr < 0 || sc < 0 || sr > maze.length - 1 || sc > maze[0].length - 1 || maze[sr][sc] == 1
                || visited[sr][sc] == true) {
            return;
        } else if (sr == maze.length - 1 && sc == maze[0].length - 1) {
            System.out.println(path);
            return;
        }

        visited[sr][sc] = true;
        floodFill_backtracking(maze, sr - 1, sc, path + "t", visited);
        floodFill_backtracking(maze, sr, sc - 1, path + "l", visited);
        floodFill_backtracking(maze, sr + 1, sc, path + "d", visited);
        floodFill_backtracking(maze, sr, sc + 1, path + "r", visited);
        visited[sr][sc] = false;
    }
}