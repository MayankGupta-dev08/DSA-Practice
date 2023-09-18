package in.co.codeWithMayank.c01_c09;/*
JAVA
    * Founder - James Gosling in 1995
    * It is a OOPs language
    * It is easy to learn
    * It is platform independent
    * It is multi-threaded
*/

public class c1_start {
    public static void main(String[] args) {
        System.out.print("Hello guys, ");
        System.out.print("we are working with java.\n");
        System.out.println("Hello World!");

        int x = 15, y = 10;
        int sum = x + y;
        int prd = x * y;
        System.out.println("Sum of " + x + " and " + y + " is: " + sum);
        System.out.println("Product of " + x + " and " + y + " is: " + prd);

        int v1 = x / y;
        int v2 = x % y;
        int v3 = y / x;
        System.out.println("x/y: " + v1);
        System.out.println("x%y: " + v2);
        System.out.println("y/x: " + v3);

        int exp1 = x * y / x + y; // x*y than x*y/x then x*y/x+y
        int exp2 = (x * y) / (x + y);
        System.out.println("x*y/x+y : " + exp1);
        System.out.println("(x*y)/(x+y) : " + exp2);
    }
}

/*
 * Hello guys, we are working with java.
 * Hello World!
 * Sum of 15 and 10 is: 25
 * Product of 15 and 10 is: 150
 * x/y: 1
 * x%y: 5
 * y/x: 0
 * x*y/x+y : 20
 * (x*y)/(x+y) : 6
 */