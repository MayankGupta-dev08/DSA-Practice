package in.co.codeWithMayank.c10_c99.I_Patterns;

import java.util.*;

public class c27_pattern8 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    scn.close();
    
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print((j+i-1) + " ");
      }
      System.out.println();
    }
  }
}

/*
6

1 
2 3 
3 4 5 
4 5 6 7 
5 6 7 8 9 
6 7 8 9 10 11

*/