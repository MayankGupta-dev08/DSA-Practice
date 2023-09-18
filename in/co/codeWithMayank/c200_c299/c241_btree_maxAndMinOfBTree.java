package in.co.codeWithMayank.c200_c299;

import java.util.*;

public class c241_btree_maxAndMinOfBTree {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        public Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static Node bTreeConstructor(Integer[] arr) {
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx = 0;
        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == 1) { // we have to set the left node
                idx++;
                if (arr[idx] != null) {
                    top.node.left = new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }
                top.state++;
            } else if (top.state == 2) { // we have to set the right node
                idx++;
                if (arr[idx] != null) {
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }
                top.state++;
            } else {
                st.pop();
            }
        }

        return root;
    }

    public static void displayBTree(Node node) {
        if (node == null) {
            return;
        }

        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);

        displayBTree(node.left);
        displayBTree(node.right);
    }

    // max of the binary tree
    public static int max(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        int cmax = Math.max(max(node.left), max(node.right));
        return Math.max(cmax, node.data);
    }

    // min of the binary tree
    public static int min(Node node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }
        int cmin = Math.min(min(node.left), min(node.right));
        return Math.min(cmin, node.data);
    }

    public static void main(String[] args) {
        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
                null };
        Node root = bTreeConstructor(arr);
        // displayBTree(root);
        System.out.println("max of Binary Tree = " + max(root));
        System.out.println("min of Binary Tree = " + min(root));
    }
}

/*
 * max of Binary Tree = 87
 * min of Binary Tree = 12
 */