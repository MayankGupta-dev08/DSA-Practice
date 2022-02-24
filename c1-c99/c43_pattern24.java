import java.util.*;
public class c43_pattern24 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        /* for (int i = 1; i <= n; i++) {
            if(i==1){
                for (int j = 1; j <= n; j++){
                    if(j<=(n/2)+1 || j==n)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            else if(i<=n/2){
                for (int j = 1; j <= n; j++){
                    if(j==(n/2)+1 || j==n)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            else if(i==n/2 +1){
                for (int j = 1; j <= n; j++)
                System.out.print("* ");
            }
            else if(i==n){
                for (int j = 1; j <= n; j++){
                    if(j>=(n/2)+1 || j==1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            else if(i>n/2 +1){
                for (int j = 1; j <= n; j++){
                    if(j==(n/2)+1 || j==1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }    
            }
            System.out.println();
        } */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++){
                if ((i==1 && (j<=n/2 +1 || j==n)) 
                || (i<=n/2 &&(j==n/2 +1 || j==n)) 
                || (i==n/2 +1) 
                || (i==n && (j>=n/2 +1 || j==1)) 
                || (i>n/2 +1 && (j==n/2 +1 || j==1)))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

/* 
7

* * * *     * 
      *     * 
      *     * 
* * * * * * * 
*     *       
*     *       
*     * * * * 

*/