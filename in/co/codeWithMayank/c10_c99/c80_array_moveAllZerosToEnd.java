package in.co.codeWithMayank.c10_c99;/* Move all zeroes to end of array
Given an array of random numbers, Push all the zero’s of a given array to the end of the array. For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. The order of all other elements should be same. Expected time complexity is O(n) and extra space is O(1)

Read hint 
Traverse the given array ‘arr’ from left to right. While traversing, maintain count of non-zero elements in array. Let the count be ‘count’. For every non-zero element arr[i], put the element at ‘arr[count]’ and increment ‘count’. After complete traversal, all non-zero elements have already been shifted to front end and ‘count’ is set as index of first 0. Now all we need to do is that run a loop which makes all elements zero from ‘count’ till end of the array. */

import java.util.*;
public class c80_array_moveAllZerosToEnd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
        
        System.out.println("Before moving all zeroes to end");
        printArray(arr);
        moveZeroesToEnd(arr);
        System.out.println("After moving all zeroes to end");
        printArray(arr);
        scn.close();
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void moveZeroesToEnd(int[] arr) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[count] = arr[i];
                count++;
            }
        }

        while(count<arr.length){
            arr[count] = 0;
            count++;
        }
    }
}