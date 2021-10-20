// Becoz c133_introToClassesAndObjects1 is our outermost or main class so, if we want to access the property/data members and functions/methods of class Person thru the main of c133_introToClassesAndObjects1 class then we have to make it class Person a static class.

// p1, p2 or p3 are references of objects (some also refer to them as objects) which store the actual object's reference in stack and the actual object's instance is created in heap.

public class c133_introToClassesAndObjects1 {

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
        p1.saysHi();

        Person p2 = new Person();
        p2.age = 10;
        p2.name = "Shaam";
        p2.saysHi();

        Person p3 = p1;
        p3.name = "Ramu";

        System.out.println("-----------------------------");
        p3.saysHi();
        p1.saysHi();
    }
}

// Ram of age: 12, says Hi!
// Shaam of age: 10, says Hi!
// -----------------------------
// Ramu of age: 12, says Hi!
// Ramu of age: 12, says Hi!