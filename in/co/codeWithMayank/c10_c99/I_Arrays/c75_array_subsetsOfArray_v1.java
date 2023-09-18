package in.co.codeWithMayank.c10_c99.I_Arrays;

import java.util.Scanner;

public class c75_array_subsetsOfArray_v1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        scn.close();
        printSubsetsOfArray_v1(arr);
    }

    public static void printSubsetsOfArray_v1(int[] arr) {
        int total = (int) Math.pow(2, arr.length); //total_subsets = 2^N
        for (int i = 0; i < total; i++) {
            // converting the i to binary to further use them to obtain a subset for the array
            // Eg - N=3 --> total=8 --> 0 to 7 --> 000, 001, 010, 011, 100, 101, 110, 111
            int temp = i;
            String set = "";
            for (int j = arr.length - 1; j >= 0; j--) {
                int r = temp % 2;
                temp = temp / 2;

                if (r == 0)
                    set = "_ " + set;
                else
                    set = arr[j] + " " + set;
            }
            System.out.println(set);
        }
    }
}