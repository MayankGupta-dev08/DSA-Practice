import java.util.*;
public class c42_pattern23_v2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int out_sp=0, stars=n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= out_sp; j++)
                System.out.print("  ");
                
            for (int j = 1; j <= stars; j++){
                if(i>(n/2)+1 && i<n && j>1 && j<stars){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }

            if(i<=n/2){
                stars-=2;
                out_sp++;
            }else{
                stars+=2;
                out_sp--;
            }
            System.out.println();
        }
    }
}

/* 
7

* * * * * * * 
  * * * * * 
    * * * 
      * 
    *   * 
  *       * 
* * * * * * * 

*/