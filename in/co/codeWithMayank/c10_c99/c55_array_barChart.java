package in.co.codeWithMayank.c10_c99;

import java.util.*;
public class c55_array_barChart {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int n = sin.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements for array:-");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sin.nextInt();
        sin.close();
        
        int mx = arr[0];
        for (int i = 1; i < arr.length; i++)
            mx = Math.max(mx, arr[i]);

        barChart(arr, mx);
    }

    public static void barChart(int[] arr, int mx) {
        for (int i = mx; i >= 1; i--) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]>=i)
                    System.out.print("*\t");
                else
                    System.out.print(" \t");
            }
            System.out.println();
        }
    }
}