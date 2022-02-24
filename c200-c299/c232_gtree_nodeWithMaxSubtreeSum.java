import java.util.*;

public class c232_gtree_nodeWithMaxSubtreeSum {

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

    private static int ms = Integer.MIN_VALUE;
    private static int msn = 0;

    // in this question we are returning something else but our main ans is
    // something else, our ans depends on the returned thing.
    // here also we have employed travel and change strategy.
    public static int nodeWithMaxSubtreeSum(Node node) {
        int sum = 0;

        for (Node child : node.children) {
            int csum = nodeWithMaxSubtreeSum(child);
            sum += csum;
        }
        sum += node.data;

        if (sum > ms) {
            ms = sum;
            msn = node.data;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, -50, -1, -60, -1, -1, 30, -70, -1, 80, -110, -1, 120, -1, -1, 90, -1, -1, 40, -100, -1,
                -1,
                -1 };
        Node root = constructGenericTree(arr);
        nodeWithMaxSubtreeSum(root);

        System.out.println(ms + "@" + msn);
    }
}

/*

 */