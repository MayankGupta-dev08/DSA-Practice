package in.co.codeWithMayank.c10_c99;

import java.util.*;
public class c82_2darray_waveTraversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] arr = new int[r][c];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();
        printWaveTraversal_2dArray(arr);
    }

    public static void printWaveTraversal_2dArray(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        for (int j = 0; j < c; j++) {
            if(j%2==0){
                for (int i = 0; i < r; i++)
                    System.out.println(arr[i][j]);
            }else{
                for (int i = r-1; i >= 0; i--)
                    System.out.println(arr[i][j]);
            }
        }
    }
}