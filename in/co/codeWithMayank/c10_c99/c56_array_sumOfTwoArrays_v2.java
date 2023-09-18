package in.co.codeWithMayank.c10_c99;

import java.util.*;

public class c56_array_sumOfTwoArrays_v2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter size of arr1: ");
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        fillArray(arr1, scn);
        
        System.out.print("Enter size of arr2: ");
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        fillArray(arr2, scn);
        scn.close();
        
        System.out.println("Sum of the two arrays");
        printSumOfArrays(arr1, arr2);
    }
    
    public static void fillArray(int[] arr, Scanner scn) {
        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
    }

    public static void printSumOfArrays(int[] arr1, int[] arr2) {
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = Math.max(arr1.length-1, arr2.length-1);
        int[] ans = new int[k+1];
        int carry=0;
        
        while(i>=0 && j>=0){
            int d = arr1[i--]+ arr2[j--]+ carry;
            carry = d/10;
            d = d%10;

            ans[k--] = d;
        }
        
        while(i>=0){
            int d = arr1[i--] + carry;
            carry = d/10;
            d = d%10;
            
            ans[k--] = d;
        }
        
        while(j>=0){
            int d = arr2[j--] + carry;
            carry = d/10;
            d = d%10;
            
            ans[k--] = d;
        }

        printArray(ans);
    }

    public static void printArray(int[] ans) {
        for (int i = 0; i < ans.length; i++)
            System.out.println(ans[i]);
    }
}

/* 
Enter size of arr1: 5
Enter the elements of array
3
1
0
7
5
Enter size of arr2: 6
Enter the elements of array
1
1
1
1
1
1
Sum of the two arrays
142186
 */