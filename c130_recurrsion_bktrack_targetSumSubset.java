import java.util.Scanner;

public class c130_recurrsion_bktrack_targetSumSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        sc.close();
        printTargetSumSubsets_recurrsion(arr, 0, target, "", 0);
    }

    // sos --> sum of subset
    public static void printTargetSumSubsets_recurrsion(int[] arr, int idx, int target, String subset, int sos) {
        if (idx == arr.length) {
            if (sos == target) {
                System.out.println(subset + ".");
            }
            return;
        }

        printTargetSumSubsets_recurrsion(arr, idx + 1, target, subset + arr[idx] + ", ", sos + arr[idx]);
        printTargetSumSubsets_recurrsion(arr, idx + 1, target, subset, sos);
    }
}