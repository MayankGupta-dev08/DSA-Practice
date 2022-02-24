import java.util.*;

public class c159_test_perfectNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        if (isPerfectNumber(n)) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect Number");
        }
    }

    public static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int div = 1; div < n; div++) {
            if (n % div == 0) {
                sum += div;
            }
        }

        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }
}