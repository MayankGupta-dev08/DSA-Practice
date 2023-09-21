package in.co.codeWithMayank.c100_c199.I_Recursion;/* 1. You are given a string str of digits. (will never start with a 0)
2. You are required to encode the str as per following rules
    1 -> a
    2 -> b
    3 -> c
    ..
    25 -> y
    26 -> z
3. Complete the body of printEncodings function - without changing signature - to calculate and print all encodings of str.
    Use the input-output below to get more understanding on what is required
    123 -> abc, aw, lc
    993 -> iic
    013 -> Invalid input. A string starting with 0 will not be passed.
    103 -> jc
    303 -> No output possible. But such a string maybe passed. In this case print nothing. */

import java.util.*;

public class c128_recurrsion_printEncodings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // input a number like 123 or 34 and we will accept in string format
        sc.close();
        printEncodings_recurrsive(str, "");
    }

    static String[] codes = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
            "s", "t", "u", "v", "w", "x", "y", "z" };

    public static void printEncodings_recurrsive(String ipStr, String opStr) {
        if (ipStr.length() == 0) {
            System.out.println(opStr);
            return;
        }

        char ch1 = ipStr.charAt(0);
        if (ch1 == '0') {
            return;
        }
        int d1 = Integer.parseInt(String.valueOf(ch1));
        String new1IpStr = ipStr.substring(1);
        printEncodings_recurrsive(new1IpStr, opStr + codes[d1 - 1]);
        
        if (ipStr.length() >= 2) {
            char ch2 = ipStr.charAt(1);
            String ch12 = "" + ch1 + ch2;
            int d12 = Integer.parseInt(String.valueOf(ch12));
            if (d12 < 27) {
                String new2IpStr = ipStr.substring(2);
                printEncodings_recurrsive(new2IpStr, opStr + codes[d12 - 1]);
            }
        }
    }
}