package in.co.codeWithMayank.c10_c99.I_Arrays;

import java.util.*;

public class c56_array_sumOfTwoArrays_v1 {
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
        int ans=0;
        int carry=0, p=1;
        
        while(i>=0 && j>=0){
            int d = arr1[i--]+ arr2[j--]+ carry;
            // i--; j--;
            carry = d/10;
            d = d%10;

            ans += d*p;
            p *= 10;
        }
        
        while(i>=0){
            int d = arr1[i--] + carry;
            // i--;
            carry = d/10;
            d = d%10;
            
            ans += d*p;
            p *= 10;
        }
        
        while(j>=0){
            int d = arr2[j--] + carry;
            // j--;
            carry = d/10;
            d = d%10;
            
            ans += d*p;
            p *= 10;
        }

        System.out.println(ans);
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