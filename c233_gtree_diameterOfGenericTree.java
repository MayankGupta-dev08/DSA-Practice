import java.util.*;

public class c233_gtree_diameterOfGenericTree {

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

    private static int dia = 0;

    // using travel and change along with finding ans via returning something else
    public static int calcDiaUsingHeight(Node node) {
        int dch = -1; // deepest child height
        int sdch = -1; // second deepest child height

        for (Node child : node.children) {
            int ch = calcDiaUsingHeight(child);

            if (ch > dch) {
                sdch = dch;
                dch = ch;
            } else if (ch > sdch) {
                sdch = ch;
            }
        }

        if (dia < dch + sdch + 2) {
            dia = dch + sdch + 2;
        }

        dch += 1;
        return dch; // returning the height of the node
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, -50, -1, -60, -1, -1, 30, -70, -1, 80, -110, -1, 120, -1, -1, 90, -1, -1, 40, -100, -1,
                -1,
                -1 };
        Node root = constructGenericTree(arr);
        calcDiaUsingHeight(root);
        System.out.println("Diameter of the tree = " + dia);
    }
}

/*
 * Diameter of the tree = 5
 */