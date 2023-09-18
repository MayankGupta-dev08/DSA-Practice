package in.co.codeWithMayank.c10_c99;

import java.util.*;
public class c90_array_pushZeroesToEnd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
            arr[i] = scn.nextInt();

        scn.close();
        // pushZeroesToEnd(arr);   //after sorting zero pointer will be at the first one ie. 0s array will be from 0 to z-1 and 1s will be z and arr.length-1
        pushZeroesToEnd_count(arr);
    }

    public static void pushZeroesToEnd(int[] arr) {
        int zero=0, one=0;
        while(one<arr.length){
            if(arr[one]!=0){
                one++;
            }else if(arr[one]==0){
                swap(arr, zero, one);
                zero++;
                one++;
            }
        }
        printArray(arr);
    
    }

    public static void pushZeroesToEnd_count(int[] arr) {
        int count=0;
        // firstly counting the number of non-zeroes element and shifting it in starting of the array
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0)
                arr[count++] = arr[i];
        }
        // now pushing 0s to the remaining array positions
        while(count<arr.length)
            arr[count++] = 0;

        printArray(arr);
    }

    public static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

/*
10
0 1 0 1 0 0 1 1 1 0 
0 0 0 0 0 1 1 1 1 1
*/