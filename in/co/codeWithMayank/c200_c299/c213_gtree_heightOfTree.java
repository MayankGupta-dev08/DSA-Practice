package in.co.codeWithMayank.c200_c299;

import java.util.*;

public class c213_gtree_heightOfTree {

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

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    public static int sizeOfGTree(Node node) {
        int s = 1;
        for (Node child : node.children) {
            int cs = sizeOfGTree(child);
            s += cs;
        }

        return s;
    }

    public static int maxOfTree(Node node) {
        int nmax = Integer.MIN_VALUE;

        for (Node child : node.children) {
            int cmax = maxOfTree(child);
            nmax = Math.max(cmax, nmax);
        }
        nmax = Math.max(node.data, nmax);

        return nmax;
    }

    // finding height in terms of nodes
    // if we have to find in terms of edges than we have to use the value of initial
    // ht as -1;
    public static int heightTree(Node node) {
        int ht = 0;

        for (Node child : node.children) {
            int cht = heightTree(child);
            ht = Math.max(cht, ht);
        }
        ht += 1;

        return ht;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };

        Node root = constructGenericTree(arr);
        display(root);
        int sz = sizeOfGTree(root);
        System.out.println("size of tree: " + sz);

        int ans = maxOfTree(root);
        System.out.println("maximum of tree: " + ans);
    }
}

// 10 -> 20, 30, 40, .
// 20 -> 50, 60, .
// 50 -> .
// 60 -> .
// 30 -> 70, 80, 90, .
// 70 -> .
// 80 -> 110, 120, .
// 110 -> .
// 120 -> .
// 90 -> .
// 40 -> 100, .
// 100 -> .
// size of tree: 12
// maximum of tree: 120