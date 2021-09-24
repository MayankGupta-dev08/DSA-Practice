import java.util.*;
public class c72_array_binarySearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
        
        int key = scn.nextInt();
        scn.close();
        int keyIdx = binarySearch(arr, key);
        System.out.println(keyIdx);
    }

    public static int binarySearch(int[] arr, int key) {
        int idx=-1;
        int start = 0, end = arr.length-1;

        while (start<=end) {
            int mid = start + (end-start)/2;
            if(arr[mid]==key)
                return mid;
            
            if(arr[mid]>key)
                end = mid-1;
            else
                start = mid+1;
        }

        return idx;
    }
}
