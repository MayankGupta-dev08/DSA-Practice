package in.co.codeWithMayank.c10_c99;

import java.util.*;
public class c86_2darray_rotateMatrixBy90deg {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int r = scn.nextInt();
        int c = r;  //here it is a square matrix
        int[][] arr = new int[r][c];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();
        rotateMatrixBy90(arr);
    }
    
    public static void rotateMatrixBy90(int[][] arr) {
        transposeOfMatrix(arr);
        reverseEachRowOfMatrix(arr);
        print2dArray(arr);
    }

    public static void transposeOfMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i<=j){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
    }

    public static void reverseEachRowOfMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            int k=arr[i].length-1;
            while (j<k) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
                j++; k--;
            }
        }
    }

    public static void print2dArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}