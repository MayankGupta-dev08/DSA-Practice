package in.co.codeWithMayank.c10_c99.I_Patterns;// Character Pattern
import java.util.*;

public class c57_pattern26 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        for (int i = 0; i < n; i++) {
            char c = (char)(65+i);
            for (int j = 0; j <= i; j++) {
                if(j==0 || j==i)
                    System.out.print(c);
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}


/* 
input
5

output
A
BB
C*C
D**D
E***E 
*/