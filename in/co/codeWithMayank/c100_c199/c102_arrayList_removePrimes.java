package in.co.codeWithMayank.c100_c199;// Array lists are similar to vectors in C++

import java.util.*;

public class c102_arrayList_removePrimes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(scn.nextInt());
        }
        scn.close();
        removePrimes(al);
        System.out.println(al);
    }

    public static void removePrimes(ArrayList<Integer> al) {
        // trick: better to traverse from the end and remove if val is prime
        for (int i = al.size() - 1; i >= 0; i--) {
            if (isPrime(al.get(i))) {
                al.remove(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int div = 2; div * div <= n; div++) {
            if (n % div == 0)
                return false;
        }
        return true;
    }
}