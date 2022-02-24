import java.util.*;

public class c30_pattern11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i+j==n-1 || i==j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

/*
5

*       *
  *   *
    *
  *   *
*       *

*/

