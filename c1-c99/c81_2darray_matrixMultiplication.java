import java.util.*;
public class c81_2darray_matrixMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int r1 = scn.nextInt(); //rows
        int c1 = scn.nextInt(); //cols
        int[][] arr1 = new int[r1][c1];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = scn.nextInt();
            }
        }

        int r2 = scn.nextInt(); //rows
        int c2 = scn.nextInt(); //cols
        int[][] arr2 = new int[r2][c2];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = scn.nextInt();
            }
        }

        scn.close();
        matrixMultiplication(arr1, arr2);
    }

    public static void matrixMultiplication(int[][] arr1, int[][] arr2) {
        int r1 = arr1.length;
        int c1 = arr1[0].length;
        int r2 = arr2.length;
        int c2 = arr2[0].length;

        if(c1!=r2){
            System.out.println("Invalid input");
            return;
        }
        
        int[][] ans = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                ans[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    ans[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        print2dArray(ans);
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
