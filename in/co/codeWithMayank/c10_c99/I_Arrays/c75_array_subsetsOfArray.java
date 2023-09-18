package in.co.codeWithMayank.c10_c99.I_Arrays;

import java.util.*;
public class c75_array_subsetsOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
        
        scn.close();
        printSubsetsOfArray(arr);
    }

    public static void printSubsetsOfArray(int[] arr) {
        int total = (int)Math.pow(2, arr.length);
        for (int i = 0; i < total; i++) {
            int temp = i;
            String set = "";
            for (int j = arr.length-1; j >=0 ; j--) {
                int r = temp%2;
                temp = temp/2;

                if(r==0)
                    set = "_ " + set;
                else
                    set = arr[j] + " " + set;
            }
            System.out.println(set);
        }
    }
}