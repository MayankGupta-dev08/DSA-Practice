package in.co.codeWithMayank.c100_c199;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class c116_recurrsion_AllIndicesOfArray {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int key = Integer.parseInt(br.readLine());

        int[] iarr = allIndices_recurrsion(arr, key, 0, 0);

        if (iarr.length == 0) {
            System.out.println();
            return;
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices_recurrsion(int[] arr, int key, int idx, int fsf) {
        if (idx == arr.length) {
            return new int[fsf];    // after whole array is checked, and we have got the size of iarr which will be = fsf
        }

        if (arr[idx] == key) {
            int[] iarr = allIndices_recurrsion(arr, key, idx + 1, fsf + 1);
            iarr[fsf] = idx;
            return iarr;
        } else {
            int[] iarr = allIndices_recurrsion(arr, key, idx + 1, fsf);
            return iarr;
        }
    }
}