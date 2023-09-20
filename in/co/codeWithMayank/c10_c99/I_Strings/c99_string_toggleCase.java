package in.co.codeWithMayank.c10_c99.I_Strings;

import java.util.*;

public class c99_string_toggleCase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();

        System.out.println(toggleCase(str));
        System.out.println(toggleCase_v2(str));
    }

    public static String toggleCase(String str) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                ch = Character.toLowerCase(ch);
                ans.append(ch);
            } else {
                ch = Character.toUpperCase(ch);
                ans.append(ch);
            }
        }
        return ans.toString();
    }

    public static String toggleCase_v2(String str) {
        StringBuilder ans = new StringBuilder();
        //  a --> 97 and A --> 65
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                char uch = (char) ('A' + ch - 'a') ;
                ans.append(uch);
            } else { // (ch>= 'A' && ch<='Z')
                char lch = (char) ('a' + ch - 'A');
                ans.append(lch);
            }
        }
        return ans.toString();
    }
}