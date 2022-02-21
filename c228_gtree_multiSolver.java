import java.util.*;

public class c228_gtree_multiSolver {

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
    private static int sze;
    private static int minn;
    private static int maxx;
    private static int height;

    // depth remains in stack
    public static void multisolver(Node node, int depth) {
        sze++;
        minn = Integer.min(minn, node.data);
        maxx = Integer.max(maxx, node.data);
        height = Integer.max(height, depth);

        for (Node child : node.children) {
            multisolver(child, depth + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };
        Node root = constructGenericTree(arr);

        sze = 0;
        height = 0;
        minn = Integer.MAX_VALUE;
        maxx = Integer.MIN_VALUE;

        multisolver(root, 0);

        System.out.println("size = " + sze);
        System.out.println("height = " + height);
        System.out.println("minn = " + minn);
        System.out.println("maxx = " + maxx);
    }
}

/*
 * size = 12
 * height = 3
 * minn = 10
 * maxx = 120
 */