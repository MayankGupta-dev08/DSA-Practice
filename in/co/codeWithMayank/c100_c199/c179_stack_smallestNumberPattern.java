package in.co.codeWithMayank.c100_c199;/* 1. You are given a pattern of upto 8 length containing characters 'i' and 'd'.
2. 'd' stands for decreasing and 'i' stands for increasing
3. You have to print the smallest number, using the digits 1 to 9 only without repetition, such that 
the digit decreases following a d and increases follwing an i.

e.g.
d -> 21
i -> 12
ddd -> 4321
iii -> 1234
dddiddd -> 43218765
iiddd -> 126543 */

import java.util.*;

public class c179_stack_smallestNumberPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // sequence only consist of d or i
        String sequence = scn.next();
        scn.close();
        smallestNumberPattern(sequence);
    }

    public static void smallestNumberPattern(String sequence) {
        Stack<Integer> st = new Stack<Integer>();
        int num = 1;

        for (int i = 0; i < sequence.length(); i++) {
            char ch = sequence.charAt(i);

            if (ch == 'd') {
                st.push(num);
                num++;
            } else {
                st.push(num);
                num++;

                while (st.size() > 0) {
                    System.out.print(st.pop());
                }
            }
        }
        // to add the last number.
        st.push(num);
        while (st.size() > 0) {
            System.out.print(st.pop());
        }
    }

}