import java.util.*;

public class c214_gtree_traversals {
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

    public static int sizeOfGTree(Node node) {
        int s = 1;
        for (Node child : node.children) {
            int cs = sizeOfGTree(child);
            s += cs;
        }

        return s;
    }

    public static int maxOfTree(Node node) {
        int nmax = Integer.MIN_VALUE;

        for (Node child : node.children) {
            int cmax = maxOfTree(child);
            nmax = Math.max(cmax, nmax);
        }
        nmax = Math.max(node.data, nmax);

        return nmax;
    }

    public static int heightTree(Node node) {
        int ht = 0;

        for (Node child : node.children) {
            int cht = heightTree(child);
            ht = Math.max(cht, ht);
        }
        ht += 1;

        return ht;
    }

    public static void traversals(Node node) {
        // euler's left, on the way deep in the recursion, node's pre area
        System.out.println("Node Pre " + node.data);
        for (Node child : node.children) {
            // edge pre area
            System.out.println("Edge Pre " + node.data + "--" + child.data);
            traversals(child);
            // edge post area
            System.out.println("Edge Post " + node.data + "--" + child.data);
        }
        // euler's right, on the way out of the recursion, node's post area
        System.out.println("Node Post " + node.data);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };

        Node root = constructGenericTree(arr);
        // display(root);
        // int sz = sizeOfGTree(root);
        // System.out.println("size of tree: " + sz);

        // int ans = maxOfTree(root);
        // System.out.println("maximum of tree: " + ans);
        traversals(root);
    }
}

/*
 * Node Pre 10
 * Edge Pre 10--20
 * Node Pre 20
 * Edge Pre 20--50
 * Node Pre 50
 * Node Post 50
 * Edge Post 20--50
 * Edge Pre 20--60
 * Node Pre 60
 * Node Post 60
 * Edge Post 20--60
 * Node Post 20
 * Edge Post 10--20
 * Edge Pre 10--30
 * Node Pre 30
 * Edge Pre 30--70
 * Node Pre 70
 * Node Post 70
 * Edge Post 30--70
 * Edge Pre 30--80
 * Node Pre 80
 * Edge Pre 80--110
 * Node Pre 110
 * Node Post 110
 * Edge Post 80--110
 * Edge Pre 80--120
 * Node Pre 120
 * Node Post 120
 * Edge Post 80--120
 * Node Post 80
 * Edge Post 30--80
 * Edge Pre 30--90
 * Node Pre 90
 * Node Post 90
 * Edge Post 30--90
 * Node Post 30
 * Edge Post 10--30
 * Edge Pre 10--40
 * Node Pre 40
 * Edge Pre 40--100
 * Node Pre 100
 * Node Post 100
 * Edge Post 40--100
 * Node Post 40
 * Edge Post 10--40
 * Node Post 10
 */