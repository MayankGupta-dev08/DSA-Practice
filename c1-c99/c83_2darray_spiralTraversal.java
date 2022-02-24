import java.util.*;
public class c83_2darray_spiralTraversal {
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
        printSpiralTraversal_2dArray(arr);
    }

    public static void printSpiralTraversal_2dArray(int[][] arr) {
        int rmin=0, cmin=0;
        int rmax = arr.length-1;
        int cmax = arr[0].length-1;
        int tne = (arr.length*arr[0].length);
        int count = 1;
        while(count<=tne){
            // for left column
            for (int k = rmin; k<=rmax && count<=tne; k++){
                System.out.println(arr[k][cmin]);
                count++;
            }
            cmin++;
            
            // for bottom row
            for (int k = cmin; k<=cmax && count<=tne; k++){
                System.out.println(arr[rmax][k]);
                count++;
            }
            rmax--;
            
            // for right column
            for (int k = rmax; k>=rmin && count<=tne; k--){
                System.out.println(arr[k][cmax]);
                count++;
            }
            cmax--;
            
            // for top row
            for (int k = cmax; k>=cmin && count<=tne; k--){
                System.out.println(arr[rmin][k]);
                count++;
            }
            rmin++;
        }
    }
}