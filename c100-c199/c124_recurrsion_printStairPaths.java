import java.util.*;

public class c124_recurrsion_printStairPaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        allStairPaths_recurrsion(n, "");
    }

    public static void allStairPaths_recurrsion(int n, String opStr) {
        if (n == 0) {
            System.out.println(opStr);
            return;
        } else if (n < 0) {
            return;
        }

        allStairPaths_recurrsion(n - 1, opStr + "1");
        allStairPaths_recurrsion(n - 2, opStr + "2");
        allStairPaths_recurrsion(n - 3, opStr + "3");
    }
}