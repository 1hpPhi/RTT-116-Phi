package org.perscholas;

import java.util.Scanner;
import java.util.StringJoiner;

public class StringExamples {
    public static void main(String[] args) {

        //0 based indexing
        //          012345
        String s = "abcdef";

        System.out.println("This is the length of the string: " + s.length());

        System.out.println(s);

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(5));
        // System.out.println(s.charAt(6)); //No number at position 6.  This is an error

        String r = "abc123abc";
        System.out.println(r.replace('a', 'z'));

        System.out.println(r.replace("abc", "xyz"));

        System.out.println(r.replaceAll("\\d", "9"));

        //substring
        String fileName = "someimage.jpg";

        //0 = starting position, 4 = end position. end position - 1 shows up
        System.out.println(fileName.substring(0, 4));

        //Starting position is given, it will give the rest of the string.
        System.out.println(fileName.substring(4));

        //Where is the dot(.) position?
        System.out.println(fileName.indexOf("."));

        //For files, better to use .lastIndexOf();
        System.out.println(fileName.substring(fileName.indexOf(".")));
        System.out.println(fileName.substring(0, fileName.indexOf(".")));

        //Trying with Email.
        System.out.println("Please enter your email address ");
        Scanner email = new Scanner(System.in);
        String emailEnd = email.nextLine().toString();
        System.out.print("This is your email address: " + emailEnd + "\n");

        System.out.println("This is the end of your email address: " + emailEnd.substring(emailEnd.indexOf("@")));


        String s1 = new String("abc");
        String s2 = new String("abc");
        //Wrong way because == is memory location
        System.out.println(s1 == s2);

        //Right way because it compares value
        //This is Case Sensitive
        System.out.println(s1.equals(s2));
        //This is not case-sensitive
        System.out.println(s1.equalsIgnoreCase(s2));

        String n = "101";
        //int to Integer if you want to turn into string
        Integer n1 = Integer.parseInt(n);

        String n2 = n1.toString();


        StringBuffer sb = new StringBuffer();
        //append will add something to the end of the string
        sb.append("abc");
        sb.append("123");
        sb.insert(4, "xyz");

        //replace function for string buffer
        sb.replace(0, 4, "ABCDEF");

        sb.delete(0, 3);

        sb.reverse();

        //Kba question

        StringBuffer kba = new StringBuffer("ABC");
        kba.replace(0, 7, "DEFG").insert(0, "12345");
        kba.reverse();
        kba.delete(0, 5);

        System.out.println(sb.toString());

        //String Joiner delimiter, prefix, suffix
StringJoiner sj1 = new StringJoiner(",", "{", "}");
StringJoiner sj2 = new StringJoiner(" or ", "[", "]");

sj1.add("Eric");
sj1.add("John");
sj2.add("Jane");
sj2.add("Bob");
sj2.add("Mary");

System.out.println(sj1);
System.out.println(sj2);

System.out.println(sj1.merge(sj2));
    }
}
