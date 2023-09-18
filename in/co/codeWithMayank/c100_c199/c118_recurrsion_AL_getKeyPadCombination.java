package in.co.codeWithMayank.c100_c199;/* 1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
2. The following list is the key to characters map :
    0 -> .;
    1 -> abc
    2 -> def
    3 -> ghi
    4 -> jkl
    5 -> mno
    6 -> pqrs
    7 -> tu
    8 -> vwx
    9 -> yz
3. Complete the body of getKPC function - without changing signature - to get the list of all words that could be produced by the keys in str. */

import java.util.ArrayList;
import java.util.Scanner;

public class c118_recurrsion_AL_getKeyPadCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        ArrayList<String> ans = getKeyPadCombination_recurrsion(str);
        System.out.println(ans);
    }

    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    /* // total number of possible words = d1*d2*d3.. , where di is the no. of
    // alphabets asscociated with that number in keypad, if str = 573, then total
    // possible words = 3*2*3 = 18, as 5->m,n,o 7->t,u 3->g,h,i
    // faith will be of 73 --> [tg, th, ti, ug, uh, ui]
    // our expectation for abc --> [mtg, mth, mti, mug, muh, mui, ntg, tnh, tin,
    // ug, nuh, nui, otg, oth, oti, oug, ouh, oui] */
    public static ArrayList<String> getKeyPadCombination_recurrsion(String str) {
        if (str.length() == 0) {
            ArrayList<String> baseRes = new ArrayList<>();
            baseRes.add("");
            return baseRes;
        }

        char ch = str.charAt(0);
        int dgt = Character.getNumericValue(ch);
        String ros = str.substring(1);
        ArrayList<String> recurrRes = getKeyPadCombination_recurrsion(ros);

        ArrayList<String> myRes = new ArrayList<>();
        for (int i = 0; i < codes[dgt].length(); i++) {
            for (String recStr : recurrRes) {
                myRes.add(codes[dgt].charAt(i) + recStr);
            }
        }
        return myRes;
    }
}

// 573
// [mtg,mth,mti,mug,muh,mui,ntg,nth,nti,nug,nuh,nui,otg,oth,oti,oug,ouh,oui]