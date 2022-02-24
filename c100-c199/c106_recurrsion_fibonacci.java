import java.util.Scanner;

public class c106_recurrsion_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int ans = nthFibonacci_recurrsion(n);
        System.out.println(ans);
    }

    public static int nthFibonacci_recurrsion(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fibnm1 = nthFibonacci_recurrsion(n - 1);
        int fibnm2 = nthFibonacci_recurrsion(n - 2);
        int nthFib = fibnm1 + fibnm2;
        return nthFib;
    }
}

// 0,1,1,2,3,5,8,13,21,34,55

// input
// 10
// output
// 55