package in.co.codeWithMayank.c100_c199;

public class c137_introToClassesAndObjects6_example1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Ram";
        p1.age = 12;

        Person p2 = new Person("Shaam", 10);

        // System.out.println(p1.name + ", " + p1.age);
        // System.out.println(p2.name + ", " + p2.age);

        // p1.saysHi();
        // p2.saysHi();

        p1.eat();
        p2.walk();
        p2.walk(100);

        System.out.println("Total persons = " + Person.count);

        Developer d1 = new Developer("Mayank", 23, "FullStack Developer");
        d1.eat();
        d1.saysHi();
        d1.walk(2);

        System.out.println("Total persons = " + Person.count);
    }

}

class Person {
    // class property/ attributes
    String name;
    int age;

    // static keyword allows us to use this class member without any object just
    // with the help of className
    static int count;

    // default constructor, if parameterised is not provided then class also
    // provides this automatically
    public Person() {
        count++;
        System.out.println("Called default constructor.");
    }

    // parameterised constructor
    public Person(String name, int age) {
        this(); // calls default constructor of same class
        this.name = name;
        this.age = age;
        System.out.println("Called parameterised constructor.");
    }

    void saysHi() {
        System.out.println(name + " of age: " + age + ", says Hi!");
    }

    void eat() {
        System.out.println(name + " is eating!");
    }

    void walk() {
        System.out.println(name + " is walking!");
    }

    // function overloading
    void walk(int steps) {
        System.out.println(name + " walked " + steps + " steps.");
    }
}

class Developer extends Person {
    String role;

    public Developer(String name, int age, String role) {
        super(name, age); // to call the parent constructor
        this.role = role;
    }

    void work() {
        System.out.println("Hey, I'm a " + role + " & I am working!");
    }

    // method overriding
    void eat() {
        System.out.println("Developer " + name + " is eating!");
    }
}