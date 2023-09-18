package in.co.codeWithMayank.c100_c199;

import java.util.*;

public class c127_recurrsion_printPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        printPermutations_recurrsive(str, "");
    }

    public static void printPermutations_recurrsive(String ipStr, String opStr) {
        if (ipStr.length() == 0) {
            System.out.println(opStr);
            return;
        }

        for (int i = 0; i < ipStr.length(); i++) {
            char ch = ipStr.charAt(i);
            String newIpStr = ipStr.substring(0, i) + ipStr.substring(i + 1);
            // substring(i+1) will not give an error as max i+1 will be equal to length of the string and 
            // it thows error only if index value is negative or more than length of the string
            printPermutations_recurrsive(newIpStr, opStr + ch);
        }
    }
}

// abc
// abc acb bac bca cab cba