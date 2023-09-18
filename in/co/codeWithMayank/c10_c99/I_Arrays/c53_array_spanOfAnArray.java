package in.co.codeWithMayank.c10_c99;

import java.util.*;
public class c53_array_spanOfAnArray {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int n = sin.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements for array:-");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sin.nextInt();
        
        sin.close();
        int span = spanOfArray(arr);
        System.out.println(span);
    }

    public static int spanOfArray(int[] arr) {
        int ans = 0;
        int mn = arr[0];
        int mx = arr[0];
        for (int i = 1; i < arr.length; i++){
            mx = Math.max(mx, arr[i]);
            mn = Math.min(mn, arr[i]);
        }
        ans = mx-mn;
        return ans;
    }
}

/* 
Constraints
1 <= n <= 10^4
0 <= n1, n2
 .. n elements <= 10 ^9

 Sample Input
6
15
30
40
4
11
9

Sample Output
36 
*/