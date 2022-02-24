/* Any Base Subtraction
    1. You are given a base b.
    2. You are given two numbers n1 and n2 of base b.
    3. You are required to subtract n1 from n2 and print the value.
        Input Format
            A base b
            A number n1
            A number n2
        Output Format
            A number of base b equal in value to n2 - n1.
*/

import java.util.*;
public class c50_anyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        scn.close();
        
        int d = getDifference(b, n1, n2);
        System.out.println(d);
     }
    
    public static int getDifference(int b, int n1, int n2){
        // we are assuming that n2>n1 and if not we will swap both.
        if(n1>n2){
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        
        int ans=0;
        int carry=0, p=1;
        while(n2>0){
            int d1 = n1%10;
            int d2 = n2%10;
            n1 = n1/10;
            n2 = n2/10;

            int d=0;
            d2 = d2 + carry;

            if(d2>=d1){
                carry = 0;
                d = d2-d1;
            }else{
                carry = -1;
                d = d2-d1 + b; 
            }

            ans += d*p;
            p *= 10;
        }
        return ans;
    }
}

// input
/* 8
1
100 */

// output
/* 77 */