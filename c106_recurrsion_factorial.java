import java.util.*;

public class c106_recurrsion_factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int ans = factorial(n);
        System.out.println(ans);
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0)
            return 1;

        return (n * factorial(n - 1));
    }
}
