import java.util.*;

public class c27_pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+i+" ");
            }
            System.out.println();
        }
    }
}

/*
5

1 
2 3 
3 4 5 
4 5 6 7 
5 6 7 8 9 

*/