package in.co.codeWithMayank.c10_c99;// import java.io.*;
import java.util.*;

public class c52_arraysBasics01 {
    public static void main(String[] args) throws Exception{
        int[] arr;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = scn.nextInt();
        
        arr = new int[n];
        
        System.out.println("Just created array and printing it without assigning any values:-");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");   //by default all will be 0
        System.out.println();
        

        System.out.println("Now assigning values to elements");
        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter "+(i+1)+" element of array: ");
            arr[i] = scn.nextInt();
        }
        
        System.out.println("Complete array:-");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
        System.out.println();

        scn.close();
    }    
}

/* 
Enter the number of elements in array: 5
Enter the number of elements in array:5
Just created array and printing it without assigning any values:-
0 0 0 0 0 
Now assigning values to elements
Enter 1 element of array: 56
Enter 2 element of array: 37
Enter 3 element of array: 91
Enter 4 element of array: 45
Enter 5 element of array: 88
Complete array:-
56 37 91 45 88  
*/