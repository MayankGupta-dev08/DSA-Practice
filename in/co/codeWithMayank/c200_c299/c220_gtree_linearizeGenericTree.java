package in.co.codeWithMayank.c200_c299;

import java.util.*;

public class c220_gtree_linearizeGenericTree {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static Node constructGenericTree(int[] arr) {
        Node root = null;
        Stack<Node> stk = new Stack<Node>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                Node temp = new Node();
                temp.data = arr[i];

                if (stk.size() == 0) {
                    root = temp;
                } else {
                    stk.peek().children.add(temp);
                }

                stk.push(temp);
            } else {
                stk.pop();
            }
        }

        return root;
    }

    public static void displayGTree(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            displayGTree(child);
        }
    }

    // we will work in post order, asuming all the child of root are linearized
    // time complexity = O(n*n)
    public static void linearize(Node node) {
        for (Node child : node.children) {
            linearize(child);
        }

        while (node.children.size() > 1) {
            Node lc = node.children.remove(node.children.size() - 1); // lc = lastChild
            Node slc = node.children.get(node.children.size() - 1); // slc = 2ndlastChild
            Node slt = getTail(slc); // slt = 2ndlastChildTail
            slt.children.add(lc);
        }
    }

    private static Node getTail(Node node) {
        while (node.children.size() == 1) {
            node = node.children.get(0);
        }
        return node;
    }

    // time complexity = O(n)
    public static Node linearize_efficient(Node node) {
        if (node.children.size() == 0) {
            return node;
        }

        Node lkt = linearize_efficient(node.children.get(node.children.size() - 1)); // lkt = lastKiTail
        while (node.children.size() > 1) {
            Node last = node.children.remove(node.children.size() - 1);
            Node slc = node.children.get(node.children.size() - 1);
            Node slt = linearize_efficient(slc);
            slt.children.add(last);
        }
        return lkt;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };

        Node root = constructGenericTree(arr);
        System.out.println("Original Generic Tree");
        displayGTree(root);
        // linearize(root);
        linearize_efficient(root);
        System.out.println("Linearize Generic Tree");
        displayGTree(root);
    }
}

/*
 * Original Generic Tree
 * 10 -> 20, 30, 40, .
 * 20 -> 50, 60, .
 * 50 -> .
 * 60 -> .
 * 30 -> 70, 80, 90, .
 * 70 -> .
 * 80 -> 110, 120, .
 * 110 -> .
 * 120 -> .
 * 90 -> .
 * 40 -> 100, .
 * 100 -> .
 * Linearize Generic Tree
 * 10 -> 20, .
 * 20 -> 50, .
 * 50 -> 60, .
 * 60 -> 30, .
 * 30 -> 70, .
 * 70 -> 80, .
 * 80 -> 110, .
 * 110 -> 120, .
 * 120 -> 90, .
 * 90 -> 40, .
 * 40 -> 100, .
 * 100 -> .
 */