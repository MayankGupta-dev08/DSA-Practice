import java.util.*;

public class c91_2darray_diagonalTraversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        // int m = scn.nextInt();
        // given in the question that it is a square matrix
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();
        print2dArrayDiagonalTraversal(arr);
    }

    public static void print2dArrayDiagonalTraversal(int[][] arr) {
        for (int diff = 0; diff < arr.length; diff++) {
            for (int i = 0, j = diff; j < arr.length; i++, j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
