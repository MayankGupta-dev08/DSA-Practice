package in.co.codeWithMayank.c100_c199;// import java.io.*;
// import java.util.*;

public class c192_LList_reverseLListIteratively {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head, tail;
        int size;

        public LinkedList() {
            head = null;
            tail = null;
            size = 0;
        }

        int size() {
            return size;
        }

        void addLast(int val) {
            Node node = new Node();
            node.data = val;
            node.next = null;

            if (size == 0) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            size++;
        }

        void display() {
            if (head == null) {
                return;
            }

            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void removeFirst() {
            if (head == null) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size--;
            } else {
                Node temp = head;
                head = temp.next;
                size--;
            }
        }

        int getFirst() {
            if (head == null) {
                System.out.println("List is empty");
                return -1;
            }
            return head.data;
        }

        int getLast() {
            if (tail == null) {
                System.out.println("List is empty");
                return -1;
            }
            return tail.data;
        }

        int getAt(int idx) {
            if (head == null) {
                System.out.println("List is empty");
                return -1;
            } else if (idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");
                return -1;
            } else {
                Node temp = head;
                int count = 0;
                while (count < idx && temp != null) {
                    temp = temp.next;
                    count++;
                }
                return temp.data;
            }
        }

        void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if (head == null) {
                tail = temp;
            }
            size++;
        }

        void addAt(int idx, int val) {
            if (idx < 0 || idx > size) {
                System.out.println("Invalid arguments");
                return;
            }

            Node node = new Node();
            node.data = val;

            if (idx == 0 || size == 0) { // insert at first
                node.next = head;
                head = node;
                if (head == null) {
                    tail = node;
                }
            } else if (idx == size) { // insert at last
                node.next = null;
                tail.next = node;
                tail = node;
            } else {
                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                node.next = temp.next;
                temp.next = node;
            }

            size++;
        }

        void removeLast() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size--;
            } else {
                Node temp = head;
                while (temp.next != tail) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
                size--;
            }
        }

        void removeAt(int idx) {
            if (idx < 0 || idx > size - 1) {
                System.out.println("Invalid argument");
            } else if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size--;
            } else if (idx == 0) {
                head = head.next;
                size--;
            } else if (idx == size - 1) {
                Node temp = head;
                while (temp.next != tail) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
                size--;
            } else {
                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;
            }
        }

        // for reversing the linked list iteratively using data only
        private Node getNodeAt(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp;
        }

        void reverseLL_dataIterative() {
            if (size == 0) {
                System.out.println("List is empty");
                return;
            } else if (size == 1) {
                return;
            } else {
                int li = 0;
                int ri = size - 1;

                while (li < ri) {
                    Node left = getNodeAt(li);
                    Node right = getNodeAt(ri);

                    int temp = left.data;
                    left.data = right.data;
                    right.data = temp;

                    li++;
                    ri--;
                }

            }
        }

        // using two node pointers -> prev and curr 
        void reverseLL_pointerIterative() {
            Node prev = null;
            Node curr = head;

            while (curr != null) {
                Node temp = curr.next;

                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            Node temp = head;
            head = tail;
            tail = temp;
        }

    }

    public static void main(String[] args) {

    }

}