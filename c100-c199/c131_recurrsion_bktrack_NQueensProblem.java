/* 1. You are given a number n, the size of a chess board.
2. You are required to place n number of queens in the n * n cells of board such that no queen can kill another.
Note - Queens kill at distance in all 8 directions
3. Complete the body of printNQueens function - without changing signature - to calculate and print all safe configurations of n-queens. Use sample input and output to get more idea.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you. */

import java.util.Scanner;

public class c131_recurrsion_bktrack_NQueensProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[][] board = new int[n][n];
        nQueensProblem_recurrsion(board, 0, "");
    }

    public static void nQueensProblem_recurrsion(int[][] board, int rowIdx, String nQpos) {
        if (rowIdx == board.length) {
            System.out.println(nQpos + ".");
            return;
        }

        for (int colIdx = 0; colIdx < board.length; colIdx++) {
            if (isValidPosForQueen(board, rowIdx, colIdx) == true) {
                board[rowIdx][colIdx] = 1;
                nQueensProblem_recurrsion(board, rowIdx + 1, nQpos + rowIdx + "-" + colIdx + ", ");
                board[rowIdx][colIdx] = 0;
            }
        }
    }

    public static boolean isValidPosForQueen(int[][] board, int row, int col) {
        // for checking colums above the current row
        for (int i = row - 1, j = col; i >= 0; i--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        // for checking squares in the diagonal left of current (row,col)
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        // for checking squares in the diagonal right of current (row,col)
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }
}