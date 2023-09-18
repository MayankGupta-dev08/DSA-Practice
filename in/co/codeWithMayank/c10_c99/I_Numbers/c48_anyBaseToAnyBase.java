package in.co.codeWithMayank.c10_c99;/* Any Base to Any Base
    1. You are given a number n.
    2. You are given a base b1. n is a number on base b.
    3. You are given another base b2.
    4. You are required to convert the number n of base b1 to a number in base b2.
    
    Input Format
        A number n
        A base b1
        A base b2
 */

 import java.util.*;
public class c48_anyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();
        scn.close();
        
        int num_dec = getValInDecimalFromBase(n, sourceBase);
        int num_destBase = getValInBaseFromDec(num_dec, destBase);
        System.out.println(num_destBase);
    }

    public static int getValInDecimalFromBase(int n, int b){
        int ans=0, p=0;
        while(n>0){
            int r=n%10;
            ans += r* (int)Math.pow(b, p);
            p++;
            n=n/10;
        }
        return ans;
    }

    public static int getValInBaseFromDec(int n, int b){
        int ans=0, p=0;
        while(n>0){
            int r=n%b;
            ans += r* (int)Math.pow(10, p);
            p++;
            n=n/b;
        }
        return ans;
    }
}

// input
/* 111001
2
3 */

// output
/* 2010 */