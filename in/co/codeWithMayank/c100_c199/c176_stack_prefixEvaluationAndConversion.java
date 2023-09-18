package in.co.codeWithMayank.c100_c199;/* 1. You are given a prefix expression.
2. You are required to evaluate it and print it's value.
3. You are required to convert it to infix and print it.
4. You are required to convert it to postfix and print it.

Note -> Use brackets in infix expression for indicating precedence.*/

import java.util.*;

public class c176_stack_prefixEvaluationAndConversion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String prefix = scn.nextLine();
        scn.close();
        workingOnPrefix(prefix);
    }

    public static void workingOnPrefix(String prefix) {
        Stack<Integer> eval = new Stack<Integer>();
        Stack<String> infixEquiv = new Stack<String>();
        Stack<String> postfixEquiv = new Stack<String>();

        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                if (eval.size() >= 2) {
                    // important to pop v1 first and then v2 as we are traversing from end
                    int v1 = eval.pop();
                    int v2 = eval.pop();
                    int res = performOperation(v1, v2, ch);
                    eval.push(res);
                }
                workOnInfix(infixEquiv, ch);
                workOnPostfix(postfixEquiv, ch);
            } else {
                eval.push(ch - '0');
                postfixEquiv.push(ch + "");
                infixEquiv.push(ch + "");
            }
        }

        System.out.println(eval.peek());
        System.out.println(infixEquiv.peek());
        System.out.println(postfixEquiv.peek());

    }

    public static int performOperation(int v1, int v2, char optr) {
        if (optr == '+') {
            return v1 + v2;
        } else if (optr == '-') {
            return v1 - v2;
        } else if (optr == '*') {
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }

    public static void workOnInfix(Stack<String> infixEquiv, char optr) {
        // important to pop v1 first and then v2 as we are traversing from end
        String v1 = infixEquiv.pop();
        String v2 = infixEquiv.pop();
        String res = '(' + v1 + optr + v2 + ')';
        infixEquiv.push(res);
    }

    public static void workOnPostfix(Stack<String> postfixEquiv, char optr) {
        // important to pop v1 first and then v2 as we are traversing from end
        String v1 = postfixEquiv.pop();
        String v2 = postfixEquiv.pop();
        String res = v1 + v2 + optr + "";
        postfixEquiv.push(res);
    }
}