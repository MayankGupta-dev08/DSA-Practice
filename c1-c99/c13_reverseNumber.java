import java.util.Scanner;

public class c13_reverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        while(n>0){
            System.out.println(n%10);
            n=n/10;
        }
    }
}

/*
56389
9
8
3
6
5
*/