package in.co.codeWithMayank.c10_c99;

import java.util.*;

public class c39_pattern20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int out_sp = n/2, val=1, count=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= out_sp; j++)
                System.out.print("  ");

            for (int j = count; j <= val; j++)
                System.out.print(j+" ");

            for (int j = val-1; j >= count; j--)
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
  2 3 2
3 4 5 4 3
  2 3 2 
    1 
*/