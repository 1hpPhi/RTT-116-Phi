package org.perscholas;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        System.out.print("Enter the radius of the circle ");

        Scanner scanner = new Scanner(System.in);

        //After a number value, you need to put a "nextLine();" so the program throws the "enter" out.
        double x = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("You have entered a radius of " + x);

        double area = x * x * 3.14159;

        System.out.println("The area of the circle is " + area);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        //Unknown if there is a scanner.next""() for java so we used scanner.next() to get the very next input.
        //charAt(0); is taking the character at the first position.
        System.out.println("Enter a Character: ");
        char character = scanner.next().charAt(0);
        System.out.println("Your character is \"" + character + "\"" );

        System.out.println("Enter your Height in cm ");
        double height = scanner.nextDouble();
        System.out.println("You are " + height + " cm");

        System.out.println("Enter an integer to convert into a character. ");
        int characterInt = scanner.nextInt();
        char convertedChar = (char) characterInt;
        System.out.println("You are " + characterInt + " character");
    }
}
