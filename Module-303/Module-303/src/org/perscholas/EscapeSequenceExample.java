package org.perscholas;

public class EscapeSequenceExample {

    public static void main(String[] args) {
        // "\n" is a New Line
        System.out.print("This is line 1\nThis is line 2\n");
        System.out.print("This is line 3\nThis is line 4\n");
        System.out.println("This is line 5");

        // "\t" is a Tab
        System.out.println("This is a tab -->\t<--");
        // "\" is to escape (escape sequence) the " "
        System.out.println("This is how to put a quote in a string \\ to not get affected by the \".");

        // This is a string literal. The new string object is created and set to "abc".
        String x = "abc";
        String y = new String("abc");

        //This will print String x in all UPPERCASE.
        System.out.println(x.toUpperCase());

        //In contrast to Non-primitive data types, Primitives do not have functions.
        int a = 5;
        //a. does not have any functions
    }
}
