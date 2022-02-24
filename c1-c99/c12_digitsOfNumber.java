import java.util.Scanner;

public class c12_digitsOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int num=n, count=0;
        while(num!=0){
            num=num/10;
            count++;
        }

        int divisor = (int) Math.pow(10, count-1);
        while(divisor!=0){
            System.out.println(n/divisor);
            n=n%divisor;
            divisor=divisor/10;
        }
    }
}

/*
564321
5
6
4
3
2
1
*/