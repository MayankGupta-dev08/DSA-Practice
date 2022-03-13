import java.util.*;

public class testFile {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("What is your Date Of Birth (dd, mm, yyyy)");
        int dd = scn.nextInt();
        int mm = scn.nextInt();
        int yyyy = scn.nextInt();
        scn.close();
        System.out.println("Your date of birth: " + dd + "/" + mm + "/" + yyyy);
    }
}

/*
 * What is your Date Of Birth (dd, mm, yyyy)
 * 08
 * 04
 * 1998
 * Your date of birth: 8/4/1998
 */