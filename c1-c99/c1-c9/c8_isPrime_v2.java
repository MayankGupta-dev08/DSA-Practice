import java.util.*;

public class c8_isPrime_v2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt(); // how many numbers do we want to check for prime or not

        for (int i = 0; i < t; i++) {
            int n = scn.nextInt(); // asking for number for prime check
            if (isPrime(n))
                System.out.println("prime");
            else
                System.out.println("Not prime");
        }
        scn.close();
    }

    public static boolean isPrime(int n) {
        // corner cases
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        // so that we can skip middle five numbers in the below loop
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i += 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false;

        return true;
    }
}
