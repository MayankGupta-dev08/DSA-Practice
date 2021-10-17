import java.util.ArrayList;
import java.util.Scanner;

public class c117_recurrsion_AL_printAllSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        ArrayList<String> ans = allSubsequences_recurrsion(str);
        System.out.println(ans);
    }

    // total number of subsequence = 2^n and total substrings = (n(n+1))/2
    // faith will be of bc --> [--, -c, b-, bc]
    // our expectation for abc --> [---, --c, -b-, -bc, a--, a-c, ab-, abc]
    public static ArrayList<String> allSubsequences_recurrsion(String str) {
        if (str.length() == 0) {
            ArrayList<String> baseRes = new ArrayList<>();
            baseRes.add("");
            return baseRes;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> recurrRes = allSubsequences_recurrsion(ros);

        ArrayList<String> myRes = new ArrayList<>();
        for (String recrStr : recurrRes) {
            myRes.add("" + recrStr);
        }
        for (String recrStr : recurrRes) {
            myRes.add(ch + recrStr);
        }
        return myRes;
    }
}

// Total number of subsequences = 2^n

// abcd
// [, d, c, cd, b, bd, bc, bcd, a, ad, ac, acd, ab, abd, abc, abcd]