package in.co.codeWithMayank.c10_c99;/* Constraints
2 <= b <= 10 */

import java.util.*;
public class c47_anyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        scn.close();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
     }
    
    public static int getValueIndecimal(int n, int b){
        int ans=0, p=0;
        while(n>0){
            int r=n%10;
            ans += r* (int)Math.pow(b, p);
            p++;
            n=n/10;
        }
        return ans;
    }
}

// input
/* 1172
8 */

// output
/* 634 */