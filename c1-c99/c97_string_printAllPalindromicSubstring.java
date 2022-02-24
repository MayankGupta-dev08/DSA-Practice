import java.util.*;

public class c97_string_printAllPalindromicSubstring {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        scn.close();

        allSubstrings(str);
    }

    public static void allSubstrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                if (isPalindrome(sub))
                    System.out.println(sub);
            }
        }
    }

    public static boolean isPalindrome(String str) {
        int l = 0, h = str.length() - 1;
        while (l < h) {
            if (str.charAt(l) != str.charAt(h)) {
                return false;
            } else {
                l++;
                h--;
            }
        }
        return true;
    }
}
