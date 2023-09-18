package in.co.codeWithMayank.c10_c99;

import java.util.*;
public class c41_pattern22 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int spaces = n/2;
        int stars = 1;
        for (int i = 1; i <= n; i++) {
            if(i!=(n/2)+1){
                for (int j = 1; j <= spaces; j++)
                    System.out.print("  ");
            }else{
                for (int j = 1; j <= spaces; j++)
                    System.out.print("* ");
            }
            for (int j = 1; j <= stars; j++)
                System.out.print("* ");
            
            if(i<=n/2)
                stars++;
            else
                stars--;
            System.out.println();
        }
    }
}

/*
5

    *
    * *
* * * * *
    * *
    *

*/