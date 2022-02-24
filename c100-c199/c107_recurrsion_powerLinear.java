import java.util.*;

public class c107_recurrsion_powerLinear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        scn.close();
        if (n < 0) {
            float fans = (float) powerLinear(x, n * (-1));  //  multiplied by -1 inorder to make the power positive
            System.out.println(1 / fans);
        } else {
            int ans = powerLinear(x, n);
            System.out.println(ans);
        }
    }

    public static int powerLinear(int x, int n) {
        if (n == 0)
            return 1;

        if (n == 1)
            return x;

        return (x * powerLinear(x, n - 1));
    }
}

/* Sample Input
2 3
Sample Output
8 */

/* Sample Input
2 -3
Sample Output
0.125 */