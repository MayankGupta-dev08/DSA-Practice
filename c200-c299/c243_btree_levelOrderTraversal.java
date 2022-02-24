import java.util.*;

public class c243_btree_levelOrderTraversal {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        public Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static Node bTreeConstructor(Integer[] arr) {
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx = 0;
        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == 1) { // we have to set the left node
                idx++;
                if (arr[idx] != null) {
                    top.node.left = new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }
                top.state++;
            } else if (top.state == 2) { // we have to set the right node
                idx++;
                if (arr[idx] != null) {
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }
                top.state++;
            } else {
                st.pop();
            }
        }

        return root;
    }

    public static void displayBTree(Node node) {
        if (node == null) {
            return;
        }

        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);

        displayBTree(node.left);
        displayBTree(node.right);
    }

    // level order traversal in the binary tree
    public static void levelorder(Node node) {
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);

        while (mq.size() > 0) {
            int count = mq.size();
            for (int i = 0; i < count; i++) {
                Node temp = mq.remove();
                System.out.print(temp.data + " ");

                if (temp.left != null) {
                    mq.add(temp.left);
                }

                if (temp.right != null) {
                    mq.add(temp.right);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
                null };
        Node root = bTreeConstructor(arr);

        System.out.println("Level order traversal -> Binary tree");
        levelorder(root);
    }
}

/*
 * Level order traversal -> Binary tree
 * 50
 * 25 75
 * 12 37 62 87
 * 30 70
 */