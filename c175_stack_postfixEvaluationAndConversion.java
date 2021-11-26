/* 1. You are given a postfix expression.
2. You are required to evaluate it and print it's value.
3. You are required to convert it to infix and print it.
4. You are required to convert it to prefix and print it.

Note -> Use brackets in infix expression for indicating precedence.*/

import java.util.*;

public class c175_stack_postfixEvaluationAndConversion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String postfix = scn.nextLine();
        scn.close();
        workingOnPostfix(postfix);
    }

    public static void workingOnPostfix(String postfix) {
        Stack<Integer> eval = new Stack<Integer>();
        Stack<String> prefixEquiv = new Stack<String>();
        Stack<String> infixEquiv = new Stack<String>();

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                if (eval.size() >= 2) {
                    // important to pop v2 first and then v1
                    int v2 = eval.pop();
                    int v1 = eval.pop();
                    int res = performOperation(v1, v2, ch);
                    eval.push(res);
                }
                workOnInfix(infixEquiv, ch);
                workOnPrefix(prefixEquiv, ch);
            } else {
                eval.push(ch - '0');
                prefixEquiv.push(ch + "");
                infixEquiv.push(ch + "");
            }
        }

        System.out.println(eval.peek());
        System.out.println(infixEquiv.peek());
        System.out.println(prefixEquiv.peek());

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
        // important to pop v2 first and then v1
        String v2 = infixEquiv.pop();
        String v1 = infixEquiv.pop();
        String res = '(' + v1 + optr + v2 + ')';
        infixEquiv.push(res);
    }

    public static void workOnPrefix(Stack<String> prefixEquiv, char optr) {
        // important to pop v2 first and then v1
        String v2 = prefixEquiv.pop();
        String v1 = prefixEquiv.pop();
        String res = optr + "" + v1 + v2;
        prefixEquiv.push(res);
    }
}