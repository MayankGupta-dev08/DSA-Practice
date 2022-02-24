import java.util.*;
public class c8_isPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            isPrime(n);
        }
        scn.close();
    }

    public static void isPrime(int n){
        if(n<=1){
            System.out.println("not prime");
            return;
        }

        for (int i = 2; i*i <= n; i++) {
            if(n%i==0){
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("prime");
    }
}
