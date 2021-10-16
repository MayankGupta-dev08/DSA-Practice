import java.util.Scanner;

public class c114_recurrsion_firstIndexOfKey {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int key = scn.nextInt();
        scn.close();
        int ans = firstIndexOfKey_recurrsion(arr, 0, key);
        System.out.println(ans);
    }

    public static int firstIndexOfKey_recurrsion(int[] arr, int idx, int key) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == key) {
            return idx;
        }

        return firstIndexOfKey_recurrsion(arr, idx + 1, key);
    }
}