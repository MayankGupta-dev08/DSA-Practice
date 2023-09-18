package in.co.codeWithMayank.c01_c09;

import java.util.*;

public class c2_takingInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String fname = input.next(); // for taking input as string till first space

        System.out.println("Enter your last name: ");
        String lname = input.next();

        System.out.println("Your full name is: " + fname + " " + lname);

        input.nextLine(); // used for flushing the enter which was used in next.int
        // above line is req only when we had used next(), nextInt() or nextFloat()
        // before a nextLine(). If none of the mentioned is used before a nextLine than
        // we can directly use a nextLine() comfortably.
        // also we can use back to back any number of nextLine() or next() after any
        // nextLine() without any need to flush the enter

        String sent = input.nextLine();
        System.out.println("Sentence: " + sent);

        // for taking input as integer
        int num = input.nextInt();
        System.out.println("Value of num=" + num);

        // for taking input as float
        float num2 = input.nextFloat();
        System.out.println("Value of num2=" + num2);

        input.close();
    }
}

/*
 * Enter your first name:
 * Mayank
 * Enter your last name:
 * Gupta
 * Your full name is: Mayank Gupta
 * 8
 * Value of num=8
 * 5
 * Value of num2=5.0
 */