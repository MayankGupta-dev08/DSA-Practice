package in.co.codeWithMayank.c200_c299;

import java.util.*;

public class c209_gtree_constructTreeUsingArray {

    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<Node>();
    }

    public static Node constructGenericTree(int[] arr) {
        Node root = null;
        Stack<Node> st = new Stack<Node>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node temp = new Node();
                temp.data = arr[i];

                if (st.size() == 0) {
                    root = temp;
                } else {
                    st.peek().children.add(temp);
                }

                st.push(temp);
            }
        }

        return root;
    }

    public static void main(String[] args) {
        
        // the array for constructing the generic tree is based on the euler path where -
        // -    first node will be root node
        // -    consecutive node will be the child node of the prev node untill -1 is encountered
        // - as soon as -1 is encountered this means next number will be used for the same level
        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };

        constructGenericTree(arr);
    }
}