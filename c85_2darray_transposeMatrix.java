import java.util.*;
public class c85_2darray_transposeMatrix {
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
        transposeOfMatrix(arr);
    }

    public static void transposeOfMatrix(int[][] arr) {
        // for transpose we have to move only in the upper triangle or lower triangle
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i<=j){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        print2dArray(arr);
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
