package in.co.codeWithMayank.c10_c99;

import java.util.*;
public class c74_array_firstAndLastOccurrenceOfKey {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
        
        int key = scn.nextInt();
        scn.close();
        firstAndLastOccurrence(arr, key);
    }

    public static void firstAndLastOccurrence(int[] arr, int key) {
        int start=0, end=arr.length-1;
        int first=-1, last=-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==key){
                while(arr[mid-1]==key)
                    mid--;
                first=mid;
                while(arr[mid+1]==key)
                    mid++;
                last=mid;
                break;
            }
            if(arr[mid]<key)
                start = mid+1;
            else
                end = mid-1;
        }
        System.out.println(first);
        System.out.println(last);
    }
}