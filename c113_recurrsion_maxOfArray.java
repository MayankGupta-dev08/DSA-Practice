import java.util.Scanner;

public class c113_recurrsion_maxOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        int ans = maxOfArray_recurrsion(arr, 0);
        System.out.println(ans);
    }

    public static int maxOfArray_recurrsion(int[] arr, int idx) {
        if (arr.length <= 0) {
            return -1;
        }
        if (arr.length == 1) {
            return arr[0];
        }
        if (idx == arr.length - 1) {
            return arr[idx];
        }

        int max = maxOfArray_recurrsion(arr, idx + 1);
        if (max < arr[idx]) {
            max = arr[idx];
        }
        return max;
    }
}