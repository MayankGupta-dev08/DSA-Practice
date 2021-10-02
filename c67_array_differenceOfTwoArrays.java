import java.util.*;
public class c67_array_differenceOfTwoArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter size of arr1: ");
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        fillArray(arr1, scn);
        
        System.out.print("Enter size of arr2: ");
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        fillArray(arr2, scn);
        scn.close();
        
        System.out.println("Difference of the two arrays");
        printDifferenceOfArrays(arr1, arr2);
    }
    
    public static void fillArray(int[] arr, Scanner scn) {
        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
    }

    public static void printDifferenceOfArrays(int[] arr1, int[] arr2) {
        int i=arr1.length-1;
        int j=arr2.length-1;
        // int k = Math.max(i, j); //we know from assumption that arr2>arr1, so we could have done k=i;
        int k = j;
        int[] ans = new int[k+1];
        // we have given a assumption that arr2>arr1
        int carry=0;
        while(j>=0){
            int d=0;
            arr2[j] += carry;
            int arr1v = (i>=0) ? arr1[i]:0;

            if(arr2[j]>=arr1v){
                carry = 0;
                d = arr2[j] - arr1v;
            }
            else{
                carry = -1;
                d = arr2[j] + 10 - arr1v;
            }

            ans[k] = d;
            i--; j--; k--;
        }

        printAnsArray(ans);
    }

    public static void printAnsArray(int[] arr) {
        int idx=0;
        while(idx < arr.length){
            if(arr[idx]==0)
                idx++;
            else
                break;
        }

        while(idx < arr.length) {
            System.out.println(arr[idx]);
            idx++; 
        }
    }
}