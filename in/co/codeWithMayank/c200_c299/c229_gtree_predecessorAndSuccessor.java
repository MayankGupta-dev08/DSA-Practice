package in.co.codeWithMayank.c200_c299;

import java.util.*;

public class c229_gtree_predecessorAndSuccessor {

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

    // all these are in heap
    private static Node predecessor;
    private static Node successor;
    private static int state;

    // in this question also, we have used travel and change strategy
    public static void predecessorAndSuccessor(Node node, int key) {
        if (state == 0) {
            if (node.data == key) {
                state = 1;
            } else {
                predecessor = node;
            }
        } else if (state == 1) {
            successor = node;
            state = 2;
        }

        for (Node child : node.children) {
            predecessorAndSuccessor(child, key);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };
        Node root = constructGenericTree(arr);

        System.out.println("Enter the key value for predecessor and successor");
        Scanner scn = new Scanner(System.in);
        int key = scn.nextInt();
        scn.close();
        successor = null;
        predecessor = null;
        state = 0;
        predecessorAndSuccessor(root, key);

        if (predecessor == null) {
            System.out.println("Predecessor not found");
        } else {
            System.out.println("predecessor = " + predecessor.data);
        }

        if (successor == null) {
            System.out.println("Successor not found");
        } else {
            System.out.println("successor = " + successor.data);
        }
    }
}

/*
 * Enter the key value for predecessor and successor
 * 90
 * predecessor = 120
 * successor = 40
 */