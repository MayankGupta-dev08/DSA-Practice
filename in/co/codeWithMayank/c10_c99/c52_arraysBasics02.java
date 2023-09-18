package in.co.codeWithMayank.c10_c99;// import java.io.*;
// import java.util.*;

public class c52_arraysBasics02 {
    public static void main(String[] args){
        int[] arrOne;        
        arrOne = new int[3];

        arrOne[0] = 55;
        arrOne[1] = 98;
        arrOne[2] = 76;

        int[] arrTwo = arrOne;
        arrTwo[1] = 100;
        arrOne[2] = 200;
        
        System.out.println("Array One elements:-");
        for (int i = 0; i < arrOne.length; i++)
            System.out.print(arrOne[i]+" ");
        System.out.println();
        
        System.out.println("Array Two elements:-");
        for (int i = 0; i < arrTwo.length; i++)
        System.out.print(arrTwo[i]+" ");
        System.out.println();
        
        swap(arrOne, 0, 2);
        System.out.println("After swapping arrOne elements:-");
        for (int i = 0; i < arrOne.length; i++)
            System.out.print(arrOne[i]+" ");
        System.out.println();

    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }    
}

/* 
Array One elements:-
55 100 200 
Array Two elements:-
55 100 200
After swapping arrOne elements:-
200 100 55
*/

/* This means if we do like this than it is said shallow copying and in this case arrTwo will be pointing to starting address of arrOne and any change in either of them will lead to change in both */