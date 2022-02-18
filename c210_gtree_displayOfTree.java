import java.util.*;

public class c210_gtree_displayOfTree {

    private static class Node {
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


    // display(10) -> will print itself and it's family
    // d(20), d(30), d(40) will print themselves and their families
    // d(10) -> self(10) and d(20), d(30) and d(40)
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

    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };

        Node root = constructGenericTree(arr);
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
 */