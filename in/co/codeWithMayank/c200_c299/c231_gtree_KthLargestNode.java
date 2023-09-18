package in.co.codeWithMayank.c200_c299;

import java.util.*;

public class c231_gtree_KthLargestNode {

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

    public static int KthLargestNode(Node node, int k) {
        floor = Integer.MIN_VALUE; // for largest among smaller
        int factor = Integer.MAX_VALUE;

        for (int i = 0; i < k; i++) {
            floorAndCeil(node, factor); // will set floor
            factor = floor;
            floor = Integer.MIN_VALUE;
        }

        return factor;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };
        Node root = constructGenericTree(arr);

        System.out.println("Enter the value of k");
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        scn.close();

        int kthLargest = KthLargestNode(root, k);
        System.out.println("Kth largest node value of the tree: " + kthLargest);
    }
}

/*
 * Enter the value of k
 * 4
 * Kth largest node value of the tree: 90
 */