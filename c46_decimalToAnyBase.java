/* Constraints
2 <= b <= 10 */

import java.util.*;
public class c46_decimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        scn.close();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }
    
    public static int getValueInBase(int n, int b){
        // int p=0;
        int pw=1, ans=0;
        while(n>0){
            int r=n%b;
            // ans = ans + (r* (int)Math.pow(10, p));
            // p++;
            ans += r*pw;
            pw*=10;
            n=n/b;
        }
        return ans;
    }
}



// input
/* 634
8 */

// output
/* 1172 */