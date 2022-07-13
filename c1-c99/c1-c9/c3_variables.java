public class c3_variables {
    public static void main(String[] args) {

        // boolean type
        boolean flag = true; // 1 bit

        // character type
        char letter = 'A'; // 2 byte

        // numeric type - integer
        byte a = -127; // 1 byte //-127 to 128 (both inclusive)
        short b = 8; // 2 byte //-32,768 to 32,767
        int c = 55; // 4 byte
        long d = 2; // 8 byte
        // numeric type - float
        float e = 3; // 4 byte
        double f = 7; // 8 byte

        System.out.println("boolean flag: " + flag);
        System.out.println("char letter: " + letter);
        System.out.println("byte a: " + a);
        System.out.println("short b: " + b);
        System.out.println("int c: " + c);
        System.out.println("long d: " + d);
        System.out.println("float e: " + e);
        System.out.println("double f: " + f);
    }
}

/*
 * boolean flag: true
 * char letter: A
 * byte a: -127
 * short b: 8
 * int c: 55
 * long d: 2
 * float e: 3.0
 * double f: 7.0
 */