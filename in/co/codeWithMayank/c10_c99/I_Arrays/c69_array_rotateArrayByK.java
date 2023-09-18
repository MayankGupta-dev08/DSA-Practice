package in.co.codeWithMayank.c10_c99.I_Arrays;/*Rotate An Array
1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
2. Take as input n and k.
3. Print the rotated array.
*/

/* main algorithm - 
    Consider the array in two parts, first half (p1 - contains n-k elements) and second half k elements
    original array = p1 + p2
    steps:
        p1' + p2'
        (p1' + p2')' = p2'' + p1'' = p2 + p1
        and rotated array = p2+p1 , hence done 
*/

import java.io.*;
// import java.util.*;

public class c69_array_rotateArrayByK {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);
    }
    
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void rotate(int[] a, int k) {
        if(a.length<=1)
            return;

        while(k<0)
            k=k+a.length;

        k = k%a.length;

        int i=0, j=a.length-1-k;
        reverse(a, i, j);

        int p=a.length-k, q=a.length-1;
        reverse(a, p, q);

        reverse(a, 0, a.length-1);
    }

    public static void reverse(int[] a, int i, int j){
        while(j>i){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++; j--;
        }
    }
}