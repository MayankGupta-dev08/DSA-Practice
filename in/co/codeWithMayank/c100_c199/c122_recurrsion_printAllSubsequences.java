package in.co.codeWithMayank.c100_c199;

import java.util.Scanner;

public class c122_recurrsion_printAllSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        // suppose ipStr = abc and opStr=""
        allSubsequences_recurrsion(str, "");
    }

    public static void allSubsequences_recurrsion(String ipStr, String opStr) {
        if (ipStr.length() == 0) {
            System.out.println(opStr);
            return;
        }

        char ch = ipStr.charAt(0);
        String newIpStr = ipStr.substring(1);
        allSubsequences_recurrsion(newIpStr, opStr);
        allSubsequences_recurrsion(newIpStr, opStr + ch);
    }
}

// abc
//
// c
// b
// bc
// a
// ac
// ab
// abc