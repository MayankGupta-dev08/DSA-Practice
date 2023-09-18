package in.co.codeWithMayank.c10_c99;// Radial Pattern
// similar to printing concentric rectangular pattern in a 2D matrix

import java.util.*;
public class c66_pattern35_v2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        for (int i = 1; i <= 2*n -1; i++) {
            int k=n;
            for (int j = 1; j <= 2*n -1; j++) {
                if(i<=n){
                    if(k%2==0)
                        System.out.print(k+" ");
                    else
                        System.out.print("# ");
                        
                    if(j<i)
                        k--;
                    else if(i+j>=2*n)
                        k++;
                }else{
                    if(k%2==0)
                        System.out.print(k+" ");
                    else
                        System.out.print("# ");
                    
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
4 # # # # # 4 
4 # 2 2 2 # 4 
4 # 2 # 2 # 4 
4 # 2 2 2 # 4 
4 # # # # # 4 
4 4 4 4 4 4 4

*/