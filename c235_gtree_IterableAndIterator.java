import java.util.*;

public class c235_gtree_IterableAndIterator {

    // Iterable is an Interface which has signature of a function Iterator
    public static class GenericTree implements Iterable<Integer> {
        Node root;

        public GenericTree(Node root) {
            this.root = root;
        }

        public Iterator<Integer> iterator() {
            Iterator<Integer> obj = new GTPreorderIterator(root);
            return obj;
        }
    }

    public static class GTPreorderIterator implements Iterator<Integer> {
        private Integer nval;
        private Stack<Pair> st;

        public GTPreorderIterator(Node root) {
            st = new Stack<>();
            st.push(new Pair(root, -1));
            next();
        }

        public boolean hasNext() {
            if (nval == null) {
                return false;
            }
            return true;
        }

        public Integer next() {
            Integer cval = nval;

            nval = null;
            while (st.size() > 0) {
                Pair top = st.peek();
                if (top.state == -1) {
                    nval = top.node.data;
                    top.state++;
                    break;
                } else if (top.state == top.node.children.size()) {
                    st.pop();
                } else {
                    Pair cp = new Pair(top.node.children.get(top.state), -1);
                    st.push(cp);

                    top.state++;
                }
            }

            return cval;
        }
    }

    private static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

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

    public static void main(String[] args) {
        int[] arr = { 10, 20, -50, -1, -60, -1, -1, 30, -70, -1, 80, -110, -1, 120, -1, -1, 90, -1, -1, 40, -100, -1,
                -1,
                -1 };
        Node root = constructGenericTree(arr);
        GenericTree gt = new GenericTree(root);

        for (int val : gt) { // syntactical sugar dependent on Iterable
            System.out.print(val + " ");
        }
        System.out.println();

        Iterator<Integer> gti = gt.iterator();
        while (gti.hasNext()) {
            System.out.print(gti.next() + " ");
        }
        System.out.println();
    }
}