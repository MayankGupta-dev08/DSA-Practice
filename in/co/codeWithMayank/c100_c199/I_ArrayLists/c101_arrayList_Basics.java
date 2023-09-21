package in.co.codeWithMayank.c100_c199.I_ArrayLists;// Array lists are similar to vectors in C++

import java.util.*;

public class c101_arrayList_Basics {
    public static void main(String[] args) {
        // ArrayList declaration and initialisation and its size
        ArrayList<Integer> lst1 = new ArrayList<>();
        System.out.println(lst1 + " --> " + lst1.size());

        // adding elements in ArrayList
        lst1.add(10);
        lst1.add(20);
        lst1.add(30);
        System.out.println(lst1 + " --> " + lst1.size());

        // inserting elements in between
        lst1.add(1, 15);
        lst1.add(3, 25);
        System.out.println(lst1 + " --> " + lst1.size());

        // getting its elements
        int val_i = lst1.get(2); // not by lst1[i]
        System.out.println(val_i);

        // changing its elements
        lst1.set(2, 200); // not by lst1[i] = 12
        System.out.println(lst1 + " --> " + lst1.size());

        // removing its elements
        lst1.remove(2);
        System.out.println(lst1 + " --> " + lst1.size());

        // checking if it is empty
        boolean ans = lst1.isEmpty();
        System.out.println(ans);

        // traversing using loop
        for (int i = 0; i < lst1.size(); i++) {
            System.out.print(lst1.get(i) + " ");
        }
        System.out.println();

        // another way of traversing the array list which could also be used for arrays
        for (int val : lst1) {
            System.out.print(val + " ");
        }
        System.out.println();

        // ArrayList could be of any data type
        ArrayList<String> lst2 = new ArrayList<>();
        lst2.add("Harry");
        lst2.add("Larry");
        lst2.add("Barry");
        lst2.add("Sharry");
        System.out.println(lst2 + " --> " + lst2.size());

    }
}