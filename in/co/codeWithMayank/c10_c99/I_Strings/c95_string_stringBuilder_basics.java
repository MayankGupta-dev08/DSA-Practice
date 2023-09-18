package in.co.codeWithMayank.c10_c99.I_Strings;

import java.util.*;

public class c95_string_stringBuilder_basics {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string: "); // hello
        String str = scn.nextLine(); // asking for a string from user
        scn.close();

        StringBuilder s = new StringBuilder(str); // creating a new string using StringBuilder class
        System.out.println(s);

        char ch = s.charAt(0); // get
        System.out.println(ch);

        s.setCharAt(0, 'j'); // set
        System.out.println(s);

        s.insert(2, 'y'); // insert
        System.out.println(s);

        s.deleteCharAt(2); // delete
        System.out.println(s);

        s.append('g'); // append
        System.out.println(s);

        System.out.println(s.length());

        // comparison of performance of String vs StringBuilder in terms of operations
        StringVsStringBuilder();
        // StringBuilder is far better as it does the job of appending in O(1) as
        // compare to String which takes O(n*n) = O((n*(n+1))/2)

        StringToStringBuilder();
    }

    public static void StringVsStringBuilder() {
        int n = 100000;

        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + i;
        }
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);

        long sTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i);
        }
        long eTime = System.currentTimeMillis();
        long d = eTime - sTime;
        System.out.println(d);
    }

    public static void StringToStringBuilder() {
        String strs[] = { "Arshad", "Althamas", "Johar", "Javed", "Raju", "Krishna" };
        StringBuilder sb = new StringBuilder();
        sb.append(strs[0]);
        sb.append(" " + strs[1]);
        sb.append(" " + strs[2]);
        sb.append(" " + strs[3]);
        sb.append(" " + strs[4]);
        sb.append(" " + strs[5]);
        String singleString = sb.toString();
        System.out.println(singleString);
    }
}