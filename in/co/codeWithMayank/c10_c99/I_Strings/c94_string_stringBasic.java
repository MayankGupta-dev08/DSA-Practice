package in.co.codeWithMayank.c10_c99.I_Strings;

import java.util.*;

public class c94_string_stringBasic {
    public static void main(String[] args) {
        // Note - string works differently than character array

        // Declaring and initialising a string
        String str = "Hello, java is a good and easy to learn programming language";
        System.out.println(str);

        /*
         * String s1 = "Hello"; String s2 = "how are you"; String s3 = s1 + ", " + s2;
         * System.out.println(s3); //Hello, how are you String s4; s4 = s1 + ", " + s2;
         * System.out.println(s4); //Hello, how are you String s5 = "*"; s5 = s1 + ", "
         * + s2; System.out.println(s5); //Hello, how are you
         * 
         * NOTE - From the above it is clear that we can add two or mare strings to make
         * a new string Also, we can see that we can entirely change an already defined
         * and initialized string. Also we can get the value of any character at any
         * index for a string using charAt(). But we can't change the value at any index
         * value of a string using s.charAt(i), also s[i] doesn't work for strings.
         */

        /*
         * Ways to ask for a string from user:- From next() --> only a word (doesn't
         * consider space, chars before a space is ecountered) From nextLine() --> a
         * line (consider spaces also)
         * 
         * Note - we have to use an extra empty nextLine after a next() if we want to
         * use one, just to flush the space or enter char left by next()
         */

        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(s);
        System.out.println(s.length()); // for array it was an data member but for string it is a function

        // use of charAt(i) -> returns char at index i
        // s[i] --> doesn't work here
        for (int i = 0; i < s.length(); i++) {
            System.out.println(i + ": " + s.charAt(i));
        }
        scn.close();
        // s.charAt(2) = 'z'; //this won't work

        /*
         * substring() function --> s.substring[beginIndex, endIndex), including
         * beginIdx but excluding endIdx
         */
        // s.substring(1, 1); //won't work
        // s.substring(2, 1); //won't work
        String sub = s.substring(1, 3);
        System.out.println(sub);
        System.out.println(s.substring(1)); // start index is 1 and till end of string

        String str1 = "Hey";
        str1 += ','; // appending one char at a time in string
        str1 += 'B'; // appending one char at a time in string
        str1 += 'o'; // appending one char at a time in string
        str1 += 'y'; // appending one char at a time in string
        System.out.println(str1);
        str1 += 10; // convert the int to string and appends
        System.out.println(str1);

        // evaluation in println() or if() is done from left to right
        System.out.println("Hello" + 10 + 20); // Hello1020
        System.out.println(10 + 20 + "Hello"); // 30Hello

        String st = "abc def ghi jkl mno pqr stu vwx yx";
        String[] parts = st.split(" "); // String array
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }

        // Concept of memory, interning, and new in strings
        String s1 = "Intern pool";
        String s2 = "Intern pool";
        String s3 = new String("Intern pool");

        /*
         * All the above 3 statements works differently When we create s1, it will be
         * created in stack with a memory location (suppose 4k) of actual string (rather
         * shell of char array) in heap, as s1 is created and has a value (word) which
         * is being entered in memory for the first time, so the memory location in heap
         * which will be assigned to s1 will be of a shell which will further be having
         * location (let 6k) of character array in which the actual word will be stored.
         * Now, when s2 is created as it is having the exact same word so no new shell
         * will be created in heap and s2 will be assigned the same memory location in
         * stack (4k). Now when s3 will be created using new keyword and String()
         * constructor then a new shell will be created in heap although it is having
         * exact same word, and shell will point to the same char array, so in stack s3
         * will be having the memory location (5k) of newly created shell. Interning-
         * what? - In heap also we have an area known as intern pool where memory
         * sharing is done by the strings. why? - in order to optimise or save space
         * implications? - 1. Comparison of strings - we have to carefully do
         * comparisons on string (as equals and == both works differently with strings)
         * equals always checks char by char and compares the string == checks whether
         * both the strings are having same location or not. So always, use equals for
         * stings instead of == s1==s2 --> true, but s1==s3 --> false s1.equals(s2) -->
         * true, but s1.equals(s3) --> true 2. Immutability - what? -> *Note- Reference
         * is mutable but instance is not, ie. we can change the memory location of
         * string in stack if we have appended the string or assigned it another word,
         * but we can't change the original word by altering one or more of its char,
         * that's why char array (which is the instance) whose address the shell was
         * having can't be changed. why did we needed it --> due to interning
         * implication --> slow performance as for adding a char to a string we have
         * firstly copy all the prev chars which the string was having then we have have
         * to add it to new shell created.
         */

        if (s1 == s2)
            System.out.println("using == --> same");
        else
            System.out.println("using == --> not same");

        if (s1 == s3)
            System.out.println("using == --> same");
        else
            System.out.println("using == --> not same");

        if (s1.equals(s2))
            System.out.println("using .equals() --> same");
        else
            System.out.println("using .equals() --> not same");

        if (s1.equals(s3))
            System.out.println("using .equals() --> same");
        else
            System.out.println("using .equals() --> not same");
    }
}