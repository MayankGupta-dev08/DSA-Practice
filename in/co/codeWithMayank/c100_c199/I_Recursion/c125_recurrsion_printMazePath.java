package in.co.codeWithMayank.c100_c199.I_Recursion;

import java.util.*;

public class c125_recurrsion_printMazePath {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        printMazePaths_recurrsion(0, 0, r - 1, c - 1, "");
    }

    // sr - source row // sc - source column
    // dr - destination row // dc - destination column
    public static void printMazePaths_recurrsion(int sr, int sc, int dr, int dc, String opStr) {
        if (sr == dr && sc == dc) {
            System.out.println(opStr);
            return;
        } else if (sr > dr || sc > dc) {
            return;
        }

        printMazePaths_recurrsion(sr, sc + 1, dr, dc, opStr + "h");
        printMazePaths_recurrsion(sr + 1, sc, dr, dc, opStr + "v");
    }
}