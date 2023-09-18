package in.co.codeWithMayank.c10_c99.I_Arrays;/* Probability Question
An urn contains 8 balls : 4 red , 2 blue and 2 green. Now n balls are drawn out of the urn. Calculate the probability that out of n drawn balls exactly x balls are red.
Find your answer multiplied by 100 and return the integer part. 
All required values for computation will be in integer range.
x is always less than equal to 4 and x is always less than equal to n. 

Input format :
    Two spaced integers : n and x
Output format :
    Integer part of (Probability * 100).  */

import java.util.*;

public class c77_probabilityQuestion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        scn.close();

        int nmr = nCr(4, x) * nCr(4, n-x);
        int dmr = nCr(8, n);

        int ans = (nmr*100)/dmr;
        System.out.println(ans);
    }

    public static int nCr(int n, int r) {
        if(n==1 || r==0 || n==r)
            return 1;

        float ans=1;
        r = r<(n-r) ? r:(n-r);
        while(r>=1){
            ans = ans*n;
            ans = ans/r;
            n--; r--;
        }
        return (int)ans;
    }
}

/* 
3
1

42 
*/