package in.co.codeWithMayank.c10_c99.I_Patterns;

import java.util.*;

public class c38_pattern19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int out_sp = n/2, val=1, count=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= out_sp; j++)
                System.out.print("  ");

            for (int j = count; j < val+count; j++)
                System.out.print(j+" ");
            
            if(i<=n/2){
                out_sp--;
                val+=2;
                count++;
            }
            else{
                out_sp++;
                val-=2;
                count--;
            }
            System.out.println();
        }
    }
}

/* 
5

    1 
  2 3 4
3 4 5 6 7
  2 3 4 
    1 
*/