import java.util.*;
public class c6_q3_sep3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.close();
        for (int i = 0; i <= n; i++) {
            if(i%2==0)
                System.out.println(i+" is even");
            else
                System.out.println(i+" is odd");
        }
    }
}

/*
5
0 is even
1 is odd
2 is even
3 is odd
4 is even
5 is odd
*/