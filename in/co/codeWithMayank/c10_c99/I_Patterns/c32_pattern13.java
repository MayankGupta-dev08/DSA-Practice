package in.co.codeWithMayank.c10_c99.I_Patterns;

import java.util.*;

public class c32_pattern13 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();  //assumption - n will always be odd
    scn.close();

    int str=n/2 +1, space=1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= str; j++)
        System.out.print("* ");

      for (int j = 1; j <= space; j++)
        System.out.print("  ");
                
      for (int j = 1; j <= str; j++)
        System.out.print("* ");

      if(i<=n/2){
        str--;
        space+=2;
      }
      else{
        str++;
        space-=2;
      }

      System.out.println();
    }
  }
}

/*
5

* * *   * * * 
* *       * * 
*           * 
* *       * * 
* * *   * * * 

*/