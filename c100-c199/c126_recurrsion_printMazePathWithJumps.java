import java.util.*;

public class c126_recurrsion_printMazePathWithJumps {
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

        for (int hStep = 1; hStep <= (dc - sc); hStep++) {
            printMazePaths_recurrsion(sr, sc + hStep, dr, dc, opStr + "h" + hStep);
        }
        for (int vStep = 1; vStep <= (dr - sr); vStep++) {
            printMazePaths_recurrsion(sr + vStep, sc, dr, dc, opStr + "v" + vStep);
        }
        for (int dStep = 1; dStep <= (dc - sc) && dStep <= (dr - sr); dStep++) {
            printMazePaths_recurrsion(sr + dStep, sc + dStep, dr, dc, opStr + "d" + dStep);
        }
    }
}