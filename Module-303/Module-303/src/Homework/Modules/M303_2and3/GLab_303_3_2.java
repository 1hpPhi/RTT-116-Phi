package Homework.Modules.M303_2and3;

import java.util.Scanner;

public class GLab_303_3_2 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter three words separated by spaces: ");
        String s1 = input1.next();
        String s2 = input1.next();
        String s3 = input1.next();
        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
        System.out.println("s3 is " + s3);

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s = input2.nextLine();
        char ch = s.charAt(0);
        System.out.println("The character entered is " + ch);
    }
}