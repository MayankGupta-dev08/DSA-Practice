import java.util.*;

public class c17_primeFactorisation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        scn.close();

        for (int div = 2; div * div <= num; div++) {
            while (num % div == 0) {
                System.out.print(div + " ");
                num = num / div;
            }
        }
        if (num != 1) // if num still not 1 means it is also one of prime factor of original num
            System.out.print(num);
    }
}

/*
 * 1440
 * 2 2 2 2 2 3 3 5
 */

/*
 * 46
 * 2 23
 */