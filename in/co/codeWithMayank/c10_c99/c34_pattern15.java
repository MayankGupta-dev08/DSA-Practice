package in.co.codeWithMayank.c10_c99;

import java.util.Scanner;

public class c34_pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int a=0, b=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int c=a+b;
                System.out.print(a+" ");
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
}

/*
5

0 
1 1 
2 3 5 
8 13 21 34 
55 89 144 233 377 

*/