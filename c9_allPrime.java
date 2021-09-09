import java.util.Scanner;

public class c9_allPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        System.out.println("prime numbers from "+low+" to "+high+" are:");

        for (int i = low; i <= high; i++) {
            boolean flag=true;
            for (int j = 2; j*j <= i; j++) {
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag==true)
                System.out.println(i);
        }
        scn.close();
    }
}

/*
6
24
prime numbers from 6 to 24 are:
7
11
13
17
19
23
*/