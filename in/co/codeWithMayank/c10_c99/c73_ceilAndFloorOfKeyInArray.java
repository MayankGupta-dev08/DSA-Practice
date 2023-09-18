package in.co.codeWithMayank.c10_c99;

import java.util.*;
public class c73_ceilAndFloorOfKeyInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
        
        int key = scn.nextInt();
        scn.close();
        printCeilAndFloorOfKey(arr, key);
    }

    public static void printCeilAndFloorOfKey(int[] arr, int key){
        int start = 0, end = arr.length-1;
        int fl = Integer.MIN_VALUE;
        int cl = Integer.MAX_VALUE;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==key){
                System.out.println(key);
                return;
            }
            if(arr[mid]<key){
                start = mid+1;
                fl = Math.max(fl, arr[mid]);
            }
            else{
                end = mid-1;
                cl = Math.min(cl, arr[mid]);
            }
        }
        System.out.println(cl);
        System.out.println(fl);
    }
}