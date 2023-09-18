package in.co.codeWithMayank.c100_c199;/* When a new object is created using default constructor given by java language then its properties which will be of number type will have value of 0 and those of string type will have value equal to null. */

public class c136_introToClassesAndObjects4_swapTry3 {

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
        swapTry3(p1, p2);
        System.out.println("-------After swapTry3---------");
        p1.saysHi();
        p2.saysHi();
    }

    // This method passes in swapping two objects as this time we try to change the
    // properties of the two objects which are stored in heap thru the references.
    public static void swapTry3(Person psn1, Person psn2) {
        psn1 = new Person();

        int tempAge = psn1.age;
        psn1.age = psn2.age;
        psn2.age = tempAge;

        psn2 = new Person();

        String tempName = psn1.name;
        psn1.name = psn2.name;
        psn2.name = tempName;
    }
}

// Ram of age: 12, says Hi!
// Shaam of age: 10, says Hi!
// -------After swapTry3---------
// Ramu of age: 12, says Hi!
// Shaam of age: 0, says Hi!