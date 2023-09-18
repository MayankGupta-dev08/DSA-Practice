package in.co.codeWithMayank.c10_c99;

import java.util.*;

public class c26_pattern7 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    scn.close();

    int counter = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(counter + " ");
        counter++;
      }
      System.out.println();
    }
  }
}

/*
6

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21

 */