package in.co.codeWithMayank.c10_c99.I_Strings;/* String Compression
1. You are given a string. 
2. You have to compress the given string in the following two ways - 
   First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
   For "aaabbccdee", the compressed string will be "abcde".
   Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
   For "aaabbccdee", the compressed string will be "a3b2c2de2".
*/

import java.util.*;

public class c98_string_stringCompression12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();

        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }

    public static String compression1(String str) {
        String ans = str.substring(0, 1);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                ans += str.charAt(i);
            }
        }
        return ans;
    }

    public static String compression2(String str) {
        String ans = str.substring(0, 1);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                if (count != 1)
                    ans += count;
                ans += str.charAt(i);
                count = 1;
            }
        }
        if (count != 1)
            ans += count;
        return ans;
    }
}