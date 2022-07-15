// Pascal Triangle
import java.util.Scanner;

public class c35_pattern16_v2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                int iCj = nCr(i, j);
                System.out.print(iCj+" ");
            }
            System.out.println();
        }
    }

    public static int nCr(int n, int r){
        if(n==0 || r==0 || n==r)
            return 1;

        float ans=1;
        r = r<(n-r) ? r:(n-r);
        while(r>=1){
            ans *= n--;
            ans /= r--;
        }
        return (int) ans;
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