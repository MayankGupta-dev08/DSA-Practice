import java.util.*;

public class c225_gtree_areTreesSimilar {

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

    // if the two trees have exact same no. of children at each node then it is said
    // to be similar, irrespective of the values otherwise not
    public static boolean areTreesSimilar(Node n1, Node n2) {
        if (n1.children.size() != n2.children.size()) {
            return false;
        }

        for (int i = 0; i < n1.children.size(); i++) {
            Node c1 = n1.children.get(i);
            Node c2 = n2.children.get(i);
            if (areTreesSimilar(c1, c2) == false) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        int[] arr2 = { 11, 22, 55, -1, 66, -1, -1, 33, 77, -1, 88, 111, -1, 122, -1, -1, 99, -1, -1, 44, 133, -1, -1, -1};

        Node root1 = constructGenericTree(arr1);
        Node root2 = constructGenericTree(arr2);

        if (areTreesSimilar(root1, root2)) {
            System.out.println("Both the trees are similar");
        } else {
            System.out.println("Both the trees are not similar");
        }
    }
}