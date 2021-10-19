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

        boolean[][] visited = new boolean[r][c]; // by default all values will be false
        sc.close();
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