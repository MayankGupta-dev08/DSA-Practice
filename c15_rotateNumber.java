/*Rotate A Number
1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
2. Take as input n and k.
3. Print the rotated number.
4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
   n = 12340056
   k = 3
   r = 05612340
*/

import java.util.Scanner;

public class c15_rotateNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int k = scn.nextInt();
        scn.close();
        int temp = num, len=0;
        while(temp!=0){
            temp = temp/10;
            len++;
        }
        if(num!=0 || len!=1){
            while(k<0)
                k=len+k;
            
            if(k>=len)
                k=k%len;
            
            for (int i = 1; i <= k; i++) {
                int r=num%10;
                num=num/10;
                num=num + (r * (int)Math.pow(10, len-1));
            }
        }

        System.out.println("Rotated number: "+num);
    }
}

/*
-123
1
Rotated number: -312
*/

/*
5629842
2
Rotated number: 4256298
*/

/*
5629842
-2
Rotated number: 2984256
*/