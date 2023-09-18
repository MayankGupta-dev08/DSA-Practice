package in.co.codeWithMayank.c200_c299;

import java.util.*;

public class c248_btree_printAllNodeAtKLevelsFar {

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

    public static ArrayList<Node> node2rootPath(Node node, int key) {
        if (node == null) {
            return new ArrayList<>();
        }

        if (node.data == key) {
            var list = new ArrayList<Node>();
            list.add(node);
            return list;
        }

        var lpath = node2rootPath(node.left, key);
        if (lpath.size() > 0) {
            lpath.add(node);
            return lpath;
        }

        var rpath = node2rootPath(node.right, key);
        if (rpath.size() > 0) {
            rpath.add(node);
            return rpath;
        }

        return new ArrayList<>();
    }

    public static void printAllAtKLevelDown(Node node, int k, Node blocker) {
        if (node == null || k < 0 || node == blocker) {
            return;
        }

        if (k == 0) {
            System.out.println(node.data);
        }

        printAllAtKLevelDown(node.left, k - 1, blocker);
        printAllAtKLevelDown(node.right, k - 1, blocker);
    }

    public static void printAllNodeAtKLevelsFar(Node node, int key, int k) {
        var pathOfKey = node2rootPath(node, key);
        for (int i = 0; i < pathOfKey.size(); i++) {
            printAllAtKLevelDown(pathOfKey.get(i), k - i, i == 0 ? null : pathOfKey.get(i - 1));
        }
    }

    public static void main(String[] args) {
        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
                null };
        Node root = bTreeConstructor(arr);
        Scanner scn = new Scanner(System.in);
        int key = scn.nextInt();
        int k = scn.nextInt();
        scn.close();
        printAllNodeAtKLevelsFar(root, key, k);
    }
}

// Input
/*
 * 37
 * 2
 */

// Output
 /*
 * 12
 * 50
 */