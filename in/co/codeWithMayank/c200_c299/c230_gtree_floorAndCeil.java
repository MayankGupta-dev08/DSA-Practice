package in.co.codeWithMayank.c200_c299;

import java.util.*;

public class c230_gtree_floorAndCeil {

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
    private static int floor;
    private static int ceil;

    // in this question also, we have used travel and change strategy
    public static void floorAndCeil(Node node, int key) {
        if (node.data > key && node.data < ceil) {
            ceil = node.data; // smallest among larger
        }

        if (node.data < key && node.data > floor) {
            floor = node.data; // largest among smaller
        }

        for (Node child : node.children) {
            floorAndCeil(child, key);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };
        Node root = constructGenericTree(arr);

        System.out.println("Enter the key value for floor and ceil");
        Scanner scn = new Scanner(System.in);
        int key = scn.nextInt();
        scn.close();

        floor = Integer.MIN_VALUE;
        ceil = Integer.MAX_VALUE;
        floorAndCeil(root, key);

        System.out.println("floor = " + floor);
        System.out.println("ceil = " + ceil);
    }
}

/*
 * Enter the key value for floor and ceil
 * 65
 * floor = 60
 * ceil = 70
 */