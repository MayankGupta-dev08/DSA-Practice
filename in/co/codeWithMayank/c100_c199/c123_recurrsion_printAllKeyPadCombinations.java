package in.co.codeWithMayank.c100_c199;

import java.util.*;

public class c123_recurrsion_printAllKeyPadCombinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        // suppose ipStr = abc and opStr=""
        allKeyPadComb_recurrsion(str, "");
    }

    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void allKeyPadComb_recurrsion(String ipStr, String opStr) {
        if (ipStr.length() == 0) {
            System.out.println(opStr);
            return;
        }

        char ch = ipStr.charAt(0);
        int d = Integer.parseInt(String.valueOf(ch));
        String newIpStr = ipStr.substring(1);

        for (int i = 0; i < codes[d].length(); i++) {
            allKeyPadComb_recurrsion(newIpStr, opStr + codes[d].charAt(i));
        }
    }
}

// 573
// mtg mth mti mug muh mui ntg nth nti nug nuh nui otg oth oti oug ouh oui