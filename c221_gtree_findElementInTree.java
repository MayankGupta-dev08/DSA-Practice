import java.util.*;

public class c221_gtree_findElementInTree {
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

    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };

        Node root = constructGenericTree(arr);
        displayGTree(root);
        System.out.println("Enter the element to be searched in the tree");
        Scanner scn = new Scanner(System.in);
        int key = scn.nextInt();
        if (findElement(root, key)) {
            System.out.println("Key Found");
        } else {
            System.out.println("Key not Found");
        }
    }
}
