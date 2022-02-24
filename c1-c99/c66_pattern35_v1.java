// Radial Pattern
// printing concentric rectangular pattern in a 2D matrix

import java.util.*;
public class c66_pattern35_v1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        for (int i = 1; i <= 2*n -1; i++) {
            int k=n;
            for (int j = 1; j <= 2*n -1; j++) {
                if(i<=n){
                    System.out.print(k+" ");
                    if(j<i)
                        k--;
                    else if(i+j>=2*n)
                        k++;
                }else{
                    System.out.print(k+" ");
                    if(i+j<=2*n -1)
                        k--;
                    else if(j>=i)
                        k++;

                }
            }
            System.out.println();
        }
    }
}

/* 
4

4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4

*/