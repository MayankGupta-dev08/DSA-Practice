package in.co.codeWithMayank.c100_c199;

import java.util.*;

public class c153_test_hailstoneSeries{

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        hailSeq(n);
    }
    
    public static void hailSeq(int n){
        while(n!=1){
            System.out.print(n+" ");
            if(n%2==0){
                n = n/2;
            }else{
                n = (n*3)+1;
            }
        }
        System.out.println(1);
    }

}

// input
// 13 
// output
// 13 40 20 10 5 16 8 4 2 1