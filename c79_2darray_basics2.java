// import java.util.*;
public class c79_2darray_basics2 {
    public static void main(String[] args) {
        // int[][] arr = new int[2][2];     //2d Square array
        // int[][] arr = new int[2][3];     //2d rectangle array
        
        // Example of a rect 2d array
        int[][] arr = new int[2][3];
        
        arr[0][0] = 11;
        arr[0][1] = 12;
        arr[0][2] = 13;

        arr[1][0] = 21;
        arr[1][1] = 22;
        arr[1][2] = 23;
        System.out.print("2d rectangular: ");
        print2dArray(arr);
        
        // Example of a jagged 2d array - number of columns is not mentioned immediately, rather seperately defined for each row.
        int[][] arr2 = new int[2][];
        arr2[0] = new int[3];
        arr2[1] = new int[4];
        
        arr2[0][0] = 11;
        arr2[0][1] = 12;
        arr2[0][2] = 13;
        
        arr2[1][0] = 21;
        arr2[1][1] = 22;
        arr2[1][2] = 23;
        arr2[1][3] = 24;
        System.out.print("2d jagged: ");
        print2dArray(arr2);
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
2d rectangular: Your 2D array:-
11 12 13 
21 22 23 
2d jagged: Your 2D array:-
11 12 13 
21 22 23 24 
*/