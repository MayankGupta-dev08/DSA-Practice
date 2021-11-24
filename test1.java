import java.util.*;

public class test1 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();
        boolean flag = isBalanced(str);
        if (flag == true) {
            System.out.println("It is balanced");
        } else {
            System.out.println("It is not balanced");
        }
    }

    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (c == '[') {
                st.push(c);
            } else if (c == ']') {
                if (st.size() == 0 || st.peek() == ']') {
                    return false;
                } else {
                    st.pop();
                }
            }
        }
        return true;
    }
}

// []][][