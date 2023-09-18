package in.co.codeWithMayank.c10_c99;

import java.util.*;

public class c87_2darray_shellRotate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int s = scn.nextInt();
        int r = scn.nextInt();
        scn.close();
        shellRotate(arr, s, r);
        // print2dArray(arr);
    }

    public static void shellRotate(int[][] arr, int s, int r) {
        int[] oneDarr = fill1dArrayFromShell(arr, s);
        rotate1dArray(oneDarr, r);
        fillShellFrom1dArray(arr, s, oneDarr);
        print2dArray(arr);
    }

    public static void rotate1dArray(int[] arr, int r) {
        if(arr.length<=1)
            return;
        
        r = r % arr.length;
        if (r < 0)
            r = r + arr.length;

        reverseArray(arr, 0, arr.length - r - 1);
        reverseArray(arr, arr.length - r, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1);
    }

    public static void reverseArray(int[] arr, int l, int h) {
        while (l < h) {
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
    }

    public static int[] fill1dArrayFromShell(int[][] arr, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;
        // int sz = 2*(maxr-minr+1) + 2*(maxc-minc+1) -4;
        int sz = 2 * (maxr - minr + maxc - minc);
        int[] oneD = new int[sz];

        int idx = 0;
        for (int i = minr; i <= maxr; i++) {
            oneD[idx] = arr[i][minc];
            idx++;
        }
        minc++;

        for (int j = minc; j <= maxc; j++) {
            oneD[idx] = arr[maxr][j];
            idx++;
        }
        maxr--;

        for (int i = maxr; i >= minr; i--) {
            oneD[idx] = arr[i][maxc];
            idx++;
        }
        maxc--;

        for (int j = maxc; j >= minc; j--) {
            oneD[idx] = arr[minr][j];
            idx++;
        }
        minr++;

        return oneD;
    }

    public static void fillShellFrom1dArray(int[][] arr, int s, int[] oneDarr) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int idx = 0;
        for (int i = minr; i <= maxr; i++) {
            arr[i][minc] = oneDarr[idx];
            idx++;
        }
        minc++;

        for (int j = minc; j <= maxc; j++) {
            arr[maxr][j] = oneDarr[idx];
            idx++;
        }
        maxr--;

        for (int i = maxr; i >= minr; i--) {
            arr[i][maxc] = oneDarr[idx];
            idx++;
        }
        maxc--;

        for (int j = maxc; j >= minc; j--) {
            arr[minr][j] = oneDarr[idx];
            idx++;
        }
        minr++;
    }

    public static void print2dArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


/* 
Sample Input
5
7
11
12
13
14
15
16
17
21
22
23
24
25
26
27
31
32
33
34
35
36
37
41
42
43
44
45
46
47
51
52
53
54
55
56
57
2
3
Sample Output
11 12 13 14 15 16 17
21 25 26 36 46 45 27
31 24 33 34 35 44 37
41 23 22 32 42 43 47
51 52 53 54 55 56 57
*/