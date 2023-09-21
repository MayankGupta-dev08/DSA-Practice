package in.co.codeWithMayank.c100_c199.I_Oops;/* When we have not provided any constructor as in some prev questions, then java provides default constructor without any arguments which initialises int with 0 and String with null, but if we have provided our own constructor then java will use that.
    If we have provided only one constructor with argument(s) but we try to make an object using new and default constructor then  java will throw an error, saying it also needs default constructor also. */

// A constructor is a method of a class which get invoked as soon as we created a new object using new keyword. It has no return type and name as same as class.

public class c137_introToClassesAndObjects5_Constructors {

    public static class Person {
        int age;
        String name;

        Person() {
            System.out.println("Person created using default constructor.");
        }

        Person(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("Person created using parameterised constructor.");
        }

        void saysHi() {
            System.out.println(name + " of age: " + age + ", says Hi!");
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 12;
        p1.name = "Ram";

        Person p2 = new Person("Shaam", 10);

        p1.saysHi();
        p2.saysHi();
    }
}

// Person created using default constructor.
// Person created using parameterised constructor.
// Ram of age: 12, says Hi!
// Shaam of age: 10, says Hi!