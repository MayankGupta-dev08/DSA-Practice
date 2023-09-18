package in.co.codeWithMayank.c10_c99.I_Arrays;

import java.util.*;

public class c92_2darray_saddlePointInMatrix {
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
        saddlePointInMatrix(arr);
    }

    public static void saddlePointInMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {

            // finding the j with min value for row=i
            int svj = 0;
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] < arr[i][svj])
                    svj = j;
            }

            // now for the given svj, we will find the row which has max value
            boolean flag = true;
            for (int r = 0; r < arr.length; r++) {
                if (arr[r][svj] > arr[i][svj]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println(arr[i][svj]);
                return; // as their is only one saddle point possible in a matrix
            }
        }
        System.out.println("Invalid input");
    }
}