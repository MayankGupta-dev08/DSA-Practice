package in.co.codeWithMayank.c100_c199.I_Recursion;/* 1. You are given a number n, the size of a chess board.
2. You are given a row and a column, as a starting point for a knight piece.
3. You are required to generate the all moves of a knight starting in (row, col) such that knight visits 
     all cells of the board exactly once.
4. Complete the body of printKnightsTour function - without changing signature - to calculate and 
     print all configurations of the chess board representing the route
     of knight through the chess board. Use sample input and output to get more idea.

Note -> When moving from (r, c) to the possible 8 options give first precedence to (r - 2, c + 1) and 
               move in clockwise manner to
               explore other options. */

import java.util.Scanner;

public class c132_recurrsion_bktrack_knightTourProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rowIdx = sc.nextInt();
        int colIdx = sc.nextInt();
        sc.close();

        int[][] chessBoard = new int[n][n];
        knightTourProblem_backtracking(chessBoard, rowIdx, colIdx, 1);
    }

    public static void knightTourProblem_backtracking(int[][] chessBoard, int row, int col, int moveNum) {
        if (row < 0 || col < 0 || row > chessBoard.length - 1 || col > chessBoard.length - 1
                || chessBoard[row][col] > 0) {
            return;
        } else if (moveNum == chessBoard.length * chessBoard.length) {
            chessBoard[row][col] = moveNum;
            displayChessBoard(chessBoard);
            chessBoard[row][col] = 0;
            return;
        }

        chessBoard[row][col] = moveNum;
        knightTourProblem_backtracking(chessBoard, row - 2, col + 1, moveNum + 1);
        knightTourProblem_backtracking(chessBoard, row - 1, col + 2, moveNum + 1);
        knightTourProblem_backtracking(chessBoard, row + 1, col + 2, moveNum + 1);
        knightTourProblem_backtracking(chessBoard, row + 2, col + 1, moveNum + 1);
        knightTourProblem_backtracking(chessBoard, row + 2, col - 1, moveNum + 1);
        knightTourProblem_backtracking(chessBoard, row + 1, col - 2, moveNum + 1);
        knightTourProblem_backtracking(chessBoard, row - 1, col - 2, moveNum + 1);
        knightTourProblem_backtracking(chessBoard, row - 2, col - 1, moveNum + 1);
        chessBoard[row][col] = 0;
    }

    public static void displayChessBoard(int[][] chessBoard) {
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}