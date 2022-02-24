/*The Curious Case Of Benjamin Bulbs
1. You are given n number of bulbs. They are all switched off. A weird fluctuation in voltage hits the circuit n times. In the 1st fluctuation all bulbs are toggled, in the 2nd fluctuation every 2nd bulb is toggled, in the 3rd fluctuation every 3rd bulb is toggled and so on. You've to find which bulbs will be switched on after n fluctuations.
2. Take as input a number n, representing the number of bulbs.
3. Print all the bulbs that will be on after the nth fluctuation in voltage.
*/

/*Approach-
all the bulbs will be toggled according to the number of times it has factors.
Example - b1 will have 1 factor, b2 = 2, b3 =2, b4 =4, b5 =2, b6 =4, b7 =2, b8 =4 and so on.
we can notice from this that all bulbs which has even number of factor will be off by end and bulbs which has odd number of factors will remain on.
trick - only bulbs which are perfect square numbered ie. b1, b4, b9, b16... will have odd number of factors.
*/

import java.util.*;

public class c19_benjaminBulbsCase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        System.out.println("bulbs which will remain ON");
        for (int i = 1; i*i <= n; i++) {
            System.out.println(i*i);
        }
    }
}

/*
20
bulbs which will remain ON
1
4
9
16
*/