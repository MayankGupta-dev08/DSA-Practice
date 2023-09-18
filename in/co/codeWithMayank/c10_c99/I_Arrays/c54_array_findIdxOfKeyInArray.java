package in.co.codeWithMayank.c10_c99.I_Arrays;

import java.util.*;
public class c54_array_findIdxOfKeyInArray {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int n = sin.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements for array:-");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sin.nextInt();
        
        System.out.print("Enter the element to be searched: ");
        int key = sin.nextInt();
        sin.close();
        
        int keyIdx = indexOfKeyInArray(arr, key);
        System.out.println(keyIdx);
    }

    public static int indexOfKeyInArray(int[] arr, int key) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++){
            if(arr[i]==key){
                ans = i;
                break;
            }
        }
        return ans;
    }
}

/* 
Constraints
1 <= n <= 10^7
-10^9 <= n1, n2 
.. n elements <= 10^9
-10^9 <= d <= 10^9

Sample Input
6
15
30
40
4
11
9
40

Sample Output
2
 */