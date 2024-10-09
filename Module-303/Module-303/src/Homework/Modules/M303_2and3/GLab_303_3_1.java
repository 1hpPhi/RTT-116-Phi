package Homework.Modules.M303_2and3;

import java.util.Arrays;

public class GLab_303_3_1 {
    public static void main(String[] args) {
        //length() method
        String str1 = "Java";
        String str2 = "";

        System.out.println(str1.length());  // 4
        System.out.println(str2.length());  // 0
        System.out.println("Java".length());  // 4
        System.out.println("Java\n".length()); // 5
        System.out.println("Learn Java".length()); // 10

        //IsEmpty() method
        String s1 = "";
        String s2 = "hello";
        System.out.println(s1.isEmpty());  // true
        System.out.println(s2.isEmpty());  // false

        //Trim() method
        String a1 = "  hello   ";
        System.out.println(a1 + "how are you");        // without trim()
        System.out.println(a1.trim() + "how are you"); // with trim()

        //toLowerCase() method
        String b1 = "HELLO HOW Are You?";
        String b1lower = s1.toLowerCase();
        System.out.println(b1lower);

        //toUpper() method
        String c1 = "hello how are you";
        String c1upper = c1.toUpperCase();
        System.out.println(c1upper);

        //concat() method
        //------By using concat method----
        String str11 = "Learn ";
        String str21 = "Java";
        // concatenate str11 and str21
        System.out.println(str11.concat(str21)); // "Learn Java"

        // concatenate str21 and str11
        System.out.println(str21.concat(str11)); // "JavaLearn "
        //--- By using + operator---
        String s3 = "hello";
        String s4 = "Learners";
        //  String s5 = s3.concat(s4); or
        String s5 = s3 + s4;
        //both of the above statement will give you the same result

        // Three strings are concatenated
        String message = "Welcome " + "to " + "Java";

        // String Chapter is concatenated with number 2
        String s = "Chapter" + 2; // s becomes Chapter2

        // String Supplement is concatenated with character B
        String ss1 = "Supplement" + 'B'; // s1 becomes SupplementB

        //split() method
        String vowels = "a::b::c::d:e";

        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");

        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));

        //charAt() method
        String messages = "Welcome to Java";
        System.out.println("The first character in the message is " + messages.charAt(0));

        //compareTo() method
        String as1 = "hello";
        String as2 = "hello";
        String as3 = "hemlo";
        String as4 = "flag";
        System.out.println(as1.compareTo(as2)); // 0 because both are equal
        System.out.println(as1.compareTo(as3)); //-1 because "l" is only one time lower than "m"
        System.out.println(as1.compareTo(as4)); // 2 because "h" is 2 times greater than "f"

        //Substrings() method
        String str12 = "java is fun";

        // extract substring from index 0 to 3
        System.out.println(str12.substring(0, 4));

        //indexOf() method
        String str13 = "Java is fun";
        int results;

        // getting index of character 's'
        results = str13.indexOf('s');

        System.out.println(results); // 6

        // getting index of character 'J'
        results = str13.lastIndexOf('J');
        System.out.println(results); // 0
        // the last occurrence of 'a' is returned
        results = str13.lastIndexOf('a');
        System.out.println(results); // 3

        // character not in the string
        results = str13.lastIndexOf('j');
        System.out.println(results); // -1

        // getting the last occurrence of "ava"
        results = str13.lastIndexOf("ava");
        System.out.println(results); // 1

        // substring not in the string
        results = str13.lastIndexOf("java");
        System.out.println(results); // -1

        //contains() method
        String str14 = "Learn Java";
        Boolean resulted;

        // check if str1 contains "Java"
        resulted = str14.contains("Java");
        System.out.println(resulted);  // true

        // check if str1 contains "Python"
        resulted = str14.contains("Python");
        System.out.println(resulted);  // false

        // check if str1 contains ""
        resulted = str14.contains("");

        System.out.println(resulted);  // true

        //replace() method
        String str15 = "abc cba";

        // all occurrences of 'a' is replaced with 'z'
        System.out.println(str15.replace('a', 'z'));

        // all occurences of 'L' is replaced with 'J'
        System.out.println("Lava".replace('L', 'J'));
        // character not in the string
        System.out.println("Hello".replace('4', 'J'));
        // all occurrences of "C++" is replaced with "Java"
        System.out.println(str15.replace("C++", "Java"));

        // all occurences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz"));

        // substring not in the string
        System.out.println("Java".replace("C++", "C"));

        //replaceAll()
        String str16 = "Java123is456fun";

        // regex for sequence of digits
        String regex = "\\d+";

        // replace all occurrences of numeric
        // digits by a space
        System.out.println(str16.replaceAll(regex, " "));

        //equals() method
        String s17 = "PerScholas";
        String s27 = "PerScholas";
        String s37 = new String("PerScholas");
        String s47 = "Teksystem";
        System.out.println(s17.equals(s27));//true
        System.out.println(s17.equals(s37));//true
        System.out.println(s17.equals(s47));//false

        //== operator
        String s18 = "Perscholas";
        String s28 = "Perscholas";
        String s38 = new String("Perscholas");
        System.out.println(s18 == s28);//true (because both refer to same instance)
        System.out.println(s18 == s38);//false(because s38 refers to instance created in nonpool)

        //compareTo() method
        String s19 = "Perscholas";
        String s29 = "Perscholas";
        String s39 = "Perschola";
        String s49 = "PerscholasX";
        System.out.println(s1.compareTo(s29)); //0
        System.out.println(s1.compareTo(s39)); // 1(because s19>s39)
        System.out.println(s1.compareTo(s49)); // -1(because s19<s49 )


    }
}
