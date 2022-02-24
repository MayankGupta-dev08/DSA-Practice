import java.util.*;

public class c224_gtree_distanceBw2Nodes {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static Node constructGenericTree(int[] arr) {
        Node root = null;
        Stack<Node> stk = new Stack<Node>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                Node temp = new Node();
                temp.data = arr[i];

                if (stk.size() == 0) {
                    root = temp;
                } else {
                    stk.peek().children.add(temp);
                }

                stk.push(temp);
            } else {
                stk.pop();
            }
        }

        return root;
    }

    public static void displayGTree(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            displayGTree(child);
        }
    }

    public static boolean findElement(Node node, int key) {
        if (node.data == key) {
            return true;
        }

        for (Node child : node.children) {
            boolean fic = findElement(child, key);
            if (fic) {
                return true;
            }
        }

        return false;
    }

    public static ArrayList<Integer> nodeToRootPath(Node node, int key) {
        if (node.data == key) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(node.data);
            return list;
        }

        for (Node child : node.children) {
            ArrayList<Integer> ptc = nodeToRootPath(child, key);
            if (ptc.size() > 0) {
                ptc.add(node.data);
                return ptc;
            }
        }

        return new ArrayList<>();
    }

    public static int lowestCommonAncestor(Node node, int d1, int d2) {
        ArrayList<Integer> p1 = nodeToRootPath(node, d1);
        ArrayList<Integer> p2 = nodeToRootPath(node, d2);

        int i = p1.size() - 1;
        int j = p2.size() - 1;

        while (i >= 0 && j >= 0 && p1.get(i) == p2.get(j)) {
            i--;
            j--;
        }

        return p1.get(i + 1);
    }

    public static int distanceBw2Nodes(Node node, int d1, int d2) {
        ArrayList<Integer> path1 = nodeToRootPath(node, d1);
        ArrayList<Integer> path2 = nodeToRootPath(node, d2);

        int i = path1.size() - 1;
        int j = path2.size() - 1;

        while (i >= 0 && j >= 0 && path1.get(i) == path2.get(j)) {
            i--;
            j--;
        }
        i++;
        j++;

        return i + j;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };

        Node root = constructGenericTree(arr);
        displayGTree(root);
        System.out.println("Enter the elements for lowest common ancestor in the tree");
        Scanner scn = new Scanner(System.in);
        int data1 = scn.nextInt();
        int data2 = scn.nextInt();
        scn.close();
        if (findElement(root, data1) && findElement(root, data2)) {
            System.out.print("Lowest Common Ancestor of " + data1 + " and " + data2 + ": ");
            System.out.println(lowestCommonAncestor(root, data1, data2));
            System.out.println(distanceBw2Nodes(root, data1, data2));
        } else {
            System.out.println("Key not Found");
        }
    }
}