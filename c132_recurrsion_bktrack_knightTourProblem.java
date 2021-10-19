import java.util.Scanner;

public class c132_recurrsion_bktrack_knightTourProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[][] chessBoard = new int[n][n];
        knightTourProblem_backtracking(chessBoard, 0, "");
    }

    public static void knightTourProblem_backtracking(int[][] chessBoard, int rowIdx, String ans) {

    }
}