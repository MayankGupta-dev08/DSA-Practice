import java.util.*;

public class c161_test_playWithPalindromes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        String[] strArray = new String[n];
        for (int i = 0; i < n; i++) {
            strArray[i] = scn.next();
        }
        scn.close();

        playWithPalindromes(strArray);
    }

    public static void playWithPalindromes(String[] strArray) {
        for (int i = 0; i < strArray.length; i++) {
            String s = strArray[i];
            if (isPalindrome(s)) {
                for (int j = 0; j < (s.length() + 1) / 2; j++) {
                    System.out.print(s.charAt(j));
                }
                System.out.println();
            } else {
                ArrayList<List<String>> result = new ArrayList<List<String>>();
                allPalindromicPartitions(s, "", result);
                System.out.println(result);
            }
        }
    }

    public static boolean isPalindrome(String s) {
        int l = 0, h = s.length() - 1;
        while (l < h) {
            if (s.charAt(l) != s.charAt(h)) {
                return false;
            } else {
                l++;
                h--;
            }
        }
        return true;
    }

    // Function to print all palindromic partions of a string
    // asf - ans so far
    public static void allPalindromicPartitions(String s, String asf, ArrayList<List<String>> result) {
        if (s.length() == 0) {
            // System.out.println(asf);
            result.add(Arrays.asList(asf.split(",")));
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            String prefix = s.substring(0, i + 1);
            String ros = s.substring(i + 1);
            if (isPalindrome(prefix)) {
                String ansSoFar = "";
                if (!asf.equals(""))
                    ansSoFar = asf + "," + prefix;
                else
                    ansSoFar = prefix;
                allPalindromicPartitions(ros, ansSoFar, result);
            }
        }
    }
}

/* Input */
// 3
// nitin
// motor
// rotor

/* Output */
// nit
// (m)(o)(t)(o)(r)
// (m)(oto)(r)
// rot