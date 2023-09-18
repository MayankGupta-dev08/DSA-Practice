package in.co.codeWithMayank.c100_c199;/* 1. You are given a string exp representing an expression.
2. Assume that the expression is balanced  i.e. the opening and closing brackets match with each other.
3. But, some of the pair of brackets maybe extra/needless. 
4. You are required to print true if you detect extra brackets and false otherwise.

e.g.'
((a + b) + (c + d)) -> false
(a + b) + ((c + d)) -> true 
*/

import java.util.*;

public class c162_stack_duplicateBrackets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();

        boolean flag = isDuplicateBrackets(str);
        if (flag == true)
            System.out.println("Duplicacy present");
        else
            System.out.println("No duplicacy in expression");
    }

    // here one assumption is important that expression is balanced
    public static boolean isDuplicateBrackets(String str) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (ch == ')') {
                // if closing ke atte hi next opening hai, that means in between nothing was
                // there which needed those brackets
                if (st.peek() == '(') {
                    return true;
                } else {
                    while (st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }
        return false;
    }
}


// ((a + b) + (c + d))
// No duplicacy in expression

// (a+b)+((c+d))
// Duplicacy present