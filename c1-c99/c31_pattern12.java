import java.util.Scanner;

public class c31_pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();  //assumption - n will always be odd
        scn.close();

        int str=1, space=n/2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++)
                System.out.print("  ");
                
            for (int j = 1; j <= str; j++)
                System.out.print("* ");

            if(i<=n/2){
                str=str+2;
                space--;
            }
            else{
                str=str-2;
                space++;
            }

            System.out.println();
        }
    }
}

/*
5
    *   
  * * * 
* * * * * 
  * * *
    * 

*/