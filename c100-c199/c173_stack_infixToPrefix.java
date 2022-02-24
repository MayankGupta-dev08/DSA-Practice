/* INFIX TO PREFIX
1. You are given an infix expression.
2. You are required to convert it to prefix and print it. 

Constraints-
    1. Expression is balanced
    2. The only operators used are +, -, *, /
    3. Opening and closing brackets - () - are used to impact precedence of operations
    4. + and - have equal precedence which is less than * and /. * and / also have equal precedence.
    5. In two operators of equal precedence give preference to the one on left.
    6. All operands are single digit numbers.
*/

import java.util.*;

public class c173_stack_infixToPrefix {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String infix = scn.nextLine();
        scn.close();
        String prefix = convertInfix2Prefix(infix);
        System.out.println(prefix);
    }

    public static String convertInfix2Prefix(String infix) {
        Stack<Character> oprtrs = new Stack<Character>();
        Stack<String> oprnds = new Stack<String>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            if (ch == '(') {
                oprtrs.push(ch);
            } else if (ch == ')') {
                while (oprtrs.peek() != '(') {
                    char optr = oprtrs.pop();
                    String v2 = oprnds.pop();
                    String v1 = oprnds.pop();

                    String res = operation(v1, v2, optr);
                    oprnds.push(res);
                }
                oprtrs.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!oprtrs.empty() && oprtrs.peek() != '(' && precedence(ch) <= precedence(oprtrs.peek())) {
                    char optr = oprtrs.pop();
                    String v2 = oprnds.pop();
                    String v1 = oprnds.pop();

                    String res = operation(v1, v2, optr);
                    oprnds.push(res);
                }

                // if it is first oprtr || after the above thing is done, then
                oprtrs.push(ch);
            } else {
                oprnds.push(Character.toString(ch));
            }
        }

        while (oprtrs.size() != 0) {
            char optr = oprtrs.pop();
            String v2 = oprnds.pop();
            String v1 = oprnds.pop();

            String res = operation(v1, v2, optr);
            oprnds.push(res);
        }

        return oprnds.peek();
    }

    public static String operation(String v1, String v2, Character optr) {
        return (Character.toString(optr) + v1 + v2);
    }

    public static int precedence(Character ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '*' || ch == '/') {
            return 2;
        }
        return 0;
    }
}

// Input
// a*(b-c)/d+e

// Output
// +/*a-bcde