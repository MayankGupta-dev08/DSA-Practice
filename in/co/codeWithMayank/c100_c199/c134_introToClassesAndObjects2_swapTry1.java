package in.co.codeWithMayank.c100_c199;

public class c134_introToClassesAndObjects2_swapTry1 {

    public static class Person {
        int age;
        String name;

        void saysHi() {
            System.out.println(name + " of age: " + age + ", says Hi!");
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 12;
        p1.name = "Ram";

        Person p2 = new Person();
        p2.age = 10;
        p2.name = "Shaam";

        p1.saysHi();
        p2.saysHi();
        swapTry1(p1, p2);
        System.out.println("-------After swapTry1---------");
        p1.saysHi();
        p2.saysHi();
    }

    // This method fails in swapping two objects as new references named p1 and p2 are created on invokation and they get swap inside the function but as soon as function is over their get deleted
    // only original p1 and p2 remains as it is.
    public static void swapTry1(Person psn1, Person psn2) {
        Person temp = psn1;
        psn1 = psn2;
        psn2 = temp;
    }
}

// Ram of age: 12, says Hi!
// Shaam of age: 10, says Hi!
// -------After swapTry1---------
// Ramu of age: 12, says Hi!
// Shaam of age: 10, says Hi!