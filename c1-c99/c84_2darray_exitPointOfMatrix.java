import java.util.*;
public class c84_2darray_exitPointOfMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] arr = new int[r][c];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();
        exitPointOfMatrix(arr);
    }

    public static void exitPointOfMatrix(int[][] arr) {
        // for directions --> dir = 0->e, 1->s, 2->w, 3->n
        int dir = 0;
        int i=0, j=0;
        int r=arr.length, c=arr[0].length;
        while(i>=0 && i<r && j>=0 && j<c){
            dir = (dir + arr[i][j])%4;
            if(dir == 0){       //moving in east
                j++;
            }else if(dir == 1){ //moving in south
                i++;
            }else if(dir == 2){ //moving in west
                j--;
            }else if(dir == 3){ //moving in north
                i--;
            }
        }

        // becoz when pointer will exit it will be exiting due to one of the below conditions
        if(i<0){
            i++;
        }else if(i>=r){
            i--;
        }else if(j<0){
            j++;
        }else if(j>=c){
            j--;
        }
        System.out.println(i);
        System.out.println(j);
    }
}
