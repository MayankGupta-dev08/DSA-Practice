package in.co.codeWithMayank.c200_c299;

import java.util.*;

public class c249_btree_root2LeafPathOfSum {

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

    public static void root2LeafPathOfSum(Node node, String path, int sum, int lo, int hi) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            sum += node.data;
            if (sum >= lo && sum <= hi) {
                System.out.println(path + node.data);
            }
            return;
        }

        root2LeafPathOfSum(node.left, path + node.data + " ", sum + node.data, lo, hi);
        root2LeafPathOfSum(node.right, path + node.data + " ", sum + node.data, lo, hi);
    }

    public static void main(String[] args) {
        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, 40, null, null, 75, 62, 60, null, null, 70, null,
                null, 87, null, null };
        Scanner scn = new Scanner(System.in);
        int lo = scn.nextInt();
        int hi = scn.nextInt();
        scn.close();

        Node root = bTreeConstructor(arr);
        root2LeafPathOfSum(root, "", 0, lo, hi);
    }
}

// Input
/*
 * 150
 * 250
 */

// Output
/*
 * 50 25 37 40
 * 50 75 62 60
 * 50 75 87
 */