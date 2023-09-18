package in.co.codeWithMayank.c10_c99;// Pascal Triangle
import java.util.Scanner;

public class c35_pattern16_v1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                int iCj = fact(i)/(fact(i-j)*fact(j));
                System.out.print(iCj+" ");
            }
            System.out.println();
        }
    }

    public static int fact(int n){
        if(n==1 || n==0)
            return 1;

        return n*fact(n-1);
    }
}

/*
5

1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1 
1 5 10 10 5 1

*/