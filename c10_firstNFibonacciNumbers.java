/* 1. You've to print first n fibonacci numbers.
2. Take as input "n", the count of fibonacci numbers to print.
3. Print first n fibonacci numbers.*/

import java.util.Scanner;

public class c10_firstNFibonacciNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a=0, b=1;
        if(n<=0)
            System.out.println("Invalid input");
        else{
            for (int i = 1; i <= n; i++) {
                int c=a+b;
                System.out.println(a);
                a=b;
                b=c;
            }
        }
        scn.close();
    }
}

/*
11

0
1
1
2
3
5
8
13
21
34
55
*/