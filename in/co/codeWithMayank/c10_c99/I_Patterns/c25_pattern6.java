package in.co.codeWithMayank.c10_c99.I_Patterns;

import java.util.*;

public class c25_pattern6 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    scn.close();
    
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }
}

/*
6

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6

 */