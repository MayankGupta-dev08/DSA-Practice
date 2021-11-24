/* 1. You are given a string exp representing an expression.
2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.

e.g.
[(a + b) + {(c + d) * (e / f)}] -> true
[(a + b) + {(c + d) * (e / f)]} -> false --> brackets mismatch
(a + b) + {(c + d) * (e / f)}] -> false  --> extra closing bracket
([(a + b) + {(c + d) * (e / f)}] -> false --> extra opening bracket
*/

import java.util.*;

public class c163_stack_BalancedBrackets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();

        boolean flag = isBalancedExpressions(str);
        if (flag == true)
            System.out.println("Balanced Expressions: " + str);
        else
            System.out.println("Unbalanced Expressions: " + str);
    }

    public static boolean isBalancedExpressions(String str) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (ch == ')' || ch == ']' || ch == '}') {
                if (st.empty()) {
                    return false;
                } else if (bracketsMatched(ch, st) == false) {
                    return false;
                } else { // stack is not empty and brackets matched so we are good
                    st.pop();
                }
            } else if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            }
        }
        // if at the end of still stack has any brackets left, it means extra brackets
        if (st.size() != 0)
            return false;
        else
            return true;
    }

    public static boolean bracketsMatched(Character ch, Stack<Character> st) {
        if (ch == ')' && st.peek() != '(') {
            return false;
        }
        if (ch == ']' && st.peek() != '[') {
            return false;
        }
        if (ch == '}' && st.peek() != '{') {
            return false;
        }
        return true;
    }
}