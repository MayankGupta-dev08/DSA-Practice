package in.co.codeWithMayank.c10_c99;

import java.util.*;

public class c71_array_printAllSubarrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
        scn.close();
        System.out.println();

        for (int i = 0; i < arr.length; i++) { //for picking each element and do work for it
            for (int j = i; j < arr.length; j++) { // for actually doing work for picked element (i)
                for (int k = i; k <= j; k++) { //for traversing for i to j
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

/* 
5
1 2 3 4 5

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

2
2 3 
2 3 4 
2 3 4 5 

3 
3 4 
3 4 5 

4 
4 5 

5 
*/