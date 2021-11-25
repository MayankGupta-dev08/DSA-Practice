/* INFIX EVALUATION - 
1. You are given an infix expression.
2. You are required to evaluate and print it's value.

Constraints
    1. Expression is balanced
    2. The only operators used are +, -, *, /
    3. Opening and closing brackets - () - are used to impact precedence of operations
    4. + and - have equal precedence which is less than * and /. * and / also have equal precedence.
    5. In two operators of equal precedence give preference to the one on left.
    6. All operands are single digit numbers.
*/

import java.util.*;

public class c171_stack_infixEvaluation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();
        int ans = evaluateInfix(str);
        System.out.println(ans);
    }

    public static int evaluateInfix(String str) {
        Stack<Character> operators = new Stack<Character>();
        Stack<Integer> operands = new Stack<Integer>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                operators.push(ch);
            } else if (Character.isDigit(ch)) { // check for digit
                operands.push(ch - '0'); // char to int
            } else if (ch == ')') {
                while (operators.peek() != '(') {
                    char optr = operators.pop();
                    int v2 = operands.pop(); // inportant in case of - and /
                    int v1 = operands.pop();

                    int res = operation(v1, v2, optr);
                    operands.push(res);
                }
                operators.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // ch is waiting for higher priorities to be solved first
                while (!operators.empty() && operators.peek() != '('
                        && precedence(ch) <= precedence(operators.peek())) {
                    char optr = operators.pop();
                    int v2 = operands.pop(); // inportant in case of - and /
                    int v1 = operands.pop();

                    int res = operation(v1, v2, optr);
                    operands.push(res);
                }
                // the very first operator will be pushed directly to the stack
                // now ch will be pushed in operators Stack
                operators.push(ch);
            }
        }

        while (operators.size() != 0) {
            char optr = operators.pop();
            int v2 = operands.pop(); // inportant in case of - and /
            int v1 = operands.pop();

            int res = operation(v1, v2, optr);
            operands.push(res);
        }

        return operands.peek();
    }

    public static int precedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        }
        if (ch == '*' || ch == '/')
            return 2;

        return 0;
    }

    public static int operation(int v1, int v2, char ch) {
        if (ch == '+')
            return v1 + v2;

        else if (ch == '-')
            return v1 - v2;

        else if (ch == '*')
            return v1 * v2;

        else if (ch == '/')
            return v1 / v2;

        return 0;
    }
}