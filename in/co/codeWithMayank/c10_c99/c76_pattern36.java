package in.co.codeWithMayank.c10_c99;// inverted bar chart

import java.util.*;
public class c76_pattern36 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
            mx = Math.max(mx, arr[i]);
        }
        scn.close();
        
        printInvertedBarChart(arr, mx);
    }
    
    public static void printInvertedBarChart(int[]arr, int mx) {
        for (int i = 1; i <= mx; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]>=i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

/* 
7
5 2 6 4 9 3 7  
* * * * * * * 
* * * * * * * 
*   * * * * * 
*   * * *   * 
*   *   *   * 
    *   *   * 
        *   * 
        *     
        *      
        

*/