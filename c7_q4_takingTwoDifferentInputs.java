import java.util.*;

public class c7_q4_takingTwoDifferentInputs{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(scn.nextLine()); //coverting string to int
        
        System.out.print("Enter your name: ");
        String name = scn.nextLine();
        
        System.out.println("Dear "+name+", Here is the counting.");
        for (int i = 1; i <= num; i++)
            System.out.println(i);
        System.out.println("Done!");

        scn.close();
    }
}

/*
Enter a number: 8
Enter your name: Mayank
Dear Mayank, Here is the counting.
1
2
3
4
5
6
7
8
Done!
*/