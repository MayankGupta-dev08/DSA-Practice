public class c5_q2_output {
    public static void main(String[] args) {
        int i = 10;
        if (i++ == 10) // 10==10
            System.out.println(i + " is good."); // 11 is good.
        else
            System.out.println(i + " is bad.");

        int j = 20;
        if (j++ == j) // 20==21
            System.out.println(j + " is good.");
        else
            System.out.println(j + " is bad."); // 21 is bad

        int k = 30;
        if (++k == 31) // 31==31
            System.out.println(k + " is good."); // 31 is good.
        else
            System.out.println(k + " is bad.");
    }
}

/*
 * 11 is good. 21 is bad. 31 is good.
 */