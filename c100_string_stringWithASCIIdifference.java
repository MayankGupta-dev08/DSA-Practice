/* String With Difference Of Every Two Consecutive Characters
1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
   For "abecd", the answer should be "a1b3e-2c1d", as 
   'b'-'a' = 1
   'e'-'b' = 3
   'c'-'e' = -2
*/

import java.util.*;

public class c100_string_stringWithASCIIdifference {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        StringBuilder ans = new StringBuilder();
        ans.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            int diff = (str.charAt(i) - str.charAt(i - 1));
            ans.append(diff);
            ans.append(str.charAt(i));
        }
        return ans.toString();  // to convert a string build from StringBuilder into String
    }
}