import java.util.*;

public class c216_gtree_levelOrderLinewiseTraversal {
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<Node>();

        Node() {
        }

        Node(int data) {
            this.data = data;
        }
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
        System.out.println("Node Pre " + node.data);
        for (Node child : node.children) {
            System.out.println("Edge Pre " + node.data + "--" + child.data);
            traversals(child);
            System.out.println("Edge Post " + node.data + "--" + child.data);
        }
        System.out.println("Node Post " + node.data);
    }

    public static void levelOrderTraversal(Node node) {
        Queue<Node> que = new ArrayDeque<>();
        que.add(node);

        // remove -> print --> add child
        while (que.size() > 0) {
            Node n = que.remove();
            System.out.print(n.data + " ");

            for (Node child : n.children) {
                que.add(child);
            }
        }
        System.out.print(".");

    }

    public static void levelOrderLinewise(Node node) {
        // main queue
        Queue<Node> mq = new ArrayDeque<Node>();
        mq.add(node);

        // child queue
        Queue<Node> cq = new ArrayDeque<Node>();
        while (mq.size() > 0) {
            Node n = mq.remove();
            System.out.print(n.data + " ");

            for (Node child : n.children) {
                cq.add(child);
            }

            if (mq.size() == 0) {
                mq = cq;
                cq = new ArrayDeque<Node>();
                System.out.println();
            }
        }
    }

    // another approach of doing the same thing
    public static void levelOrderLinewise_2(Node node) {
        Queue<Node> q = new ArrayDeque<Node>();
        q.add(node);
        q.add(new Node(-1));

        // remove, print, addChild
        while (q.size() > 0) {
            node = q.remove();

            if (node.data != -1) {
                System.out.print(node.data + " ");

                for (Node child : node.children) {
                    q.add(child);
                }
            } else {
                if (q.size() > 0) {
                    q.add(new Node(-1));
                    System.out.println();
                }
            }
        }
    }

    public static void levelOrderLinewise_3(Node node) {
        Queue<Node> q = new ArrayDeque<Node>();
        q.add(node);

        while (q.size() > 0) {
            // nicl = nodes in current level
            int nicl = q.size();

            for (int i = 0; i < nicl; i++) {
                node = q.remove();
                System.out.print(node.data + " ");

                for (Node child : node.children) {
                    q.add(child);
                }
            }
            System.out.println();
        }
    }

    private static class Pair {
        Node node;
        int level;

        Pair(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    public static void levelOrderLinewise_4(Node node) {
        Queue<Pair> q = new ArrayDeque<Pair>();
        q.add(new Pair(node, 1));

        int level = 1;

        // remove, print, addChild
        while (q.size() > 0) {
            Pair p = q.remove();
            if (p.level > level) {
                System.out.println();
                level = p.level;
            }

            System.out.print(p.node.data + " ");
            for (Node child : p.node.children) {
                Pair cp = new Pair(child, p.level + 1);
                q.add(cp);
            }
        }
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

        // traversals(root);

        // levelOrderTraversal(root);

        levelOrderLinewise(root);
        levelOrderLinewise_2(root);
        levelOrderLinewise_3(root);
        levelOrderLinewise_4(root);
    }
}

// 10
// 20 30 40
// 50 60 70 80 90 100
// 110 120