package in.co.codeWithMayank.c10_c99.I_Strings;

import java.util.*;
public class c96_string_printAllSubstrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        scn.close();
        printAllSubstrings(s);
    }

    public static void printAllSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                // we  have done j=i+1 as s.substring(0,0) is ' ' as j is excluding
                System.out.println(s.substring(i, j));;
            }
        }
    }
}

/* 
Sample Input
abcd
Sample Output
a
ab
abc
abcd
b
bc
bcd
c
cd
d
*/