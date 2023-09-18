package in.co.codeWithMayank.c10_c99;

import java.util.*;

public class c40_pattern21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int spaces = 2*n-3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j+" ");

            for (int j = 1; j <= spaces; j++)
                System.out.print("  ");
            
            if(i<n){
                for (int j = i; j >= 1; j--)
                System.out.print(j+" ");
            }else{
                for (int j = i-1; j >= 1; j--)
                System.out.print(j+" ");
            }

            spaces-=2;
            System.out.println();
        }
    }
}

/* 
7

1                       1	
1 2                   2 1	
1 2 3               3 2 1	
1 2 3 4           4 3 2 1	
1 2 3 4 5       5 4 3 2 1	
1 2 3 4 5 6   6 5 4 3 2 1	
1 2 3 4 5 6 7 6 5 4 3 2 1	
*/