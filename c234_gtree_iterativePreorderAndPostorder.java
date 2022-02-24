import java.util.*;

public class c234_gtree_iterativePreorderAndPostorder {

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

    // Pair class for this question
    private static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static void iterativePreorderAndPostorder(Node node) {
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(node, -1));

        String pre = "";
        String post = "";

        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == -1) {
                pre += top.node.data + " ";
                top.state++;
            } else if (top.state == top.node.children.size()) {
                post += top.node.data + " ";
                st.pop();
            } else {
                Pair cp = new Pair(top.node.children.get(top.state), -1);
                st.push(cp);

                top.state++;
            }
        }

        System.out.println("Preorder for the tree: " + pre);
        System.out.println("Postorder for the tree: " + post);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, -50, -1, -60, -1, -1, 30, -70, -1, 80, -110, -1, 120, -1, -1, 90, -1, -1, 40, -100, -1,
                -1,
                -1 };
        Node root = constructGenericTree(arr);
        iterativePreorderAndPostorder(root);
    }
}

/*
 * Preorder for the tree: 10 20 -50 -60 30 -70 80 -110 120 90 40 -100
 * Postorder for the tree: -50 -60 20 -70 -110 120 80 90 30 -100 40 10
 */