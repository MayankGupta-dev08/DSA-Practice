import java.util.*;
public class c79_2darray_basics1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();

        int[][] arr = new int[m][n];    //2d array of rows=m, columns=n
        // this can be a 2d square/rectangle array depending on m and n
            // square if m=n else rectangle
            // but all rows will have same number of columns

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();
        print2dArray(arr);
    }
    
    public static void print2dArray(int[][] arr) {
        System.out.println("Your 2D array:-");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

/* 
2 3
11 12 13 21 22 23
Your 2D array:-
11 12 13 
21 22 23
*/