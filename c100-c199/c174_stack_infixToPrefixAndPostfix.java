import java.util.*;

public class c174_stack_infixToPrefixAndPostfix {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String infix = scn.nextLine();
        scn.close();
        infixConversions(infix);
    }

    public static void infixConversions(String infix) {
        Stack<Character> oprtrs = new Stack<Character>();
        Stack<String> prefix = new Stack<String>();
        Stack<String> postfix = new Stack<String>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            if (ch == '(') {
                oprtrs.push(ch);
            } else if (ch == ')') {
                while (oprtrs.peek() != '(') {
                    char optr = oprtrs.pop();
                    workOnPrefix(optr, prefix);
                    workOnPostfix(optr, postfix);
                }
                oprtrs.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!oprtrs.empty() && oprtrs.peek() != '(' && precedence(ch) <= precedence(oprtrs.peek())) {
                    char optr = oprtrs.pop();
                    workOnPrefix(optr, prefix);
                    workOnPostfix(optr, postfix);
                }

                // if it is first oprtr or after doing the above work, then
                oprtrs.push(ch);
            } else {
                prefix.push("" + ch);
                postfix.push("" + ch);
            }
        }

        // if still operator stack is not empty
        while (oprtrs.size() != 0) {
            char optr = oprtrs.pop();
            workOnPrefix(optr, prefix);
            workOnPostfix(optr, postfix);
        }

        System.out.println("Postfix equiv: " + postfix.peek());
        System.out.println("Prefix equiv: " + prefix.peek());
    }

    public static void workOnPrefix(char optr, Stack<String> prefix) {
        String v2 = prefix.pop();
        String v1 = prefix.pop();

        String res = optr + v1 + v2;
        prefix.push(res);
    }

    public static void workOnPostfix(char optr, Stack<String> postfix) {
        String v2 = postfix.pop();
        String v1 = postfix.pop();

        String res = v1 + v2 + optr;
        postfix.push(res);
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
// Postfix equiv: abc-*d/e+
// Prefix equiv: +/*a-bcde