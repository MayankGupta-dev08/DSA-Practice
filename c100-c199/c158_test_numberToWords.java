/* Write a console application in the choice of your programming language that takes in a currency value (Min Value 00, Max Value 9, 99, 99, 999.99) and prints out a text. For ex. If provided "123456.78", it should print out “Rs. One Lakh Twenty Three Thousand Four Hundred And Fifty Six 78/100 ONLY

The folder should contain output screenshots attached for 3 different numbers
1 number should be in thousands
1 number should be in lakhs
1 number should be in crore */

import java.util.*;

public class c158_test_numberToWords {

    private static final String[] lessThan20 = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
            "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
            "Nineteen" };

    private static final String[] tensPlace = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
            "Eighty", "Ninety" };

    private static final String[] moreThan99 = { "Hundred", "Thousand", "Lakh", "Crore" };

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double num_dbl = scn.nextDouble();

        String ans = numberToWords(num_dbl);
        System.out.println(ans);

        scn.close();
    }

    public static String numberToWords(double num_dbl) {
        if (num_dbl == 0)
            return "Zero";

        int num_int = (int) num_dbl;
        int decimal = (int) ((num_dbl - (double) num_int) * 100);

        String words = helper(num_int);
        words = words + " " + decimal + "/100 ONLY";
        return words.trim();
    }

    private static String helper(int num) {
        String ans;

        if (num == 0) {
            ans = "";
        } else if (num < 20) { // 1 <= num <= 19
            ans = lessThan20[num];
        } else if (num < 100) { // 20 <= num <= 99
            ans = tensPlace[num / 10] + " " + helper(num % 10);
        } else if (num < 1000) { // 100 <= num <= 999 --> Hundreds
            ans = helper(num / 100) + " " + moreThan99[0] + " And " + helper(num % 100);
        } else if (num < 100000) { // 1000 <= num <= 99,999 --> Thousands
            ans = helper(num / 1000) + " " + moreThan99[1] + " " + helper(num % 1000);
        } else if (num < 10000000) { // 100,000 <= num <= 99,99,999 --> Lakhs
            ans = helper(num / 100000) + " " + moreThan99[2] + " " + helper(num % 100000);
        } else { // 100,00,000 <= num <= 99,99,99,999 --> Crores
            ans = helper(num / 10000000) + " " + moreThan99[3] + " " + helper(num % 10000000);
        }

        return ans;
    }
}