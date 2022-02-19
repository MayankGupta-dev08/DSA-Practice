import java.util.*;

public class c218_gtree_mirriorOfTree {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
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

    // firstly we will expect the children of root node that all mirror their
    // children
    // then we will reverse the children of the root node, so this will work in post
    // order area
    public static void mirror(Node node) {
        for (Node child : node.children) {
            mirror(child);
        }
        Collections.reverse(node.children);
    }

    public static void main(String[] args) throws Exception {
        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };

        Node root = constructGenericTree(arr);
        display(root);
        mirror(root);
        display(root);
    }

}

/*
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
 * 10 -> 40, 30, 20, .
 * 40 -> 100, .
 * 100 -> .
 * 30 -> 90, 80, 70, .
 * 90 -> .
 * 80 -> 120, 110, .
 * 120 -> .
 * 110 -> .
 * 70 -> .
 * 20 -> 60, 50, .
 * 60 -> .
 * 50 -> .
 */