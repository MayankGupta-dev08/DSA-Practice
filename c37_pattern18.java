import java.util.*;
public class c37_pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int out_sp = n/2, val=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= out_sp; j++)
                System.out.print("  ");
                
            for (int j = 1; j <= val; j++)
                System.out.print(j+" ");
            
            if(i<=n/2){
                out_sp--;
                val+=2;
            }
            else{
                out_sp++;
                val-=2;
            }
            System.out.println();
        }
    }
}

/* 
5

    1 
  1 2 3 
1 2 3 4 5 
  1 2 3 
    1  
*/