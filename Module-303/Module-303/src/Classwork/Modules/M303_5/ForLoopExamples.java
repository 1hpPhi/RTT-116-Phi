package Classwork.Modules.M303_5;

import java.util.List;
import java.util.ArrayList;

public class ForLoopExamples {
    public static void main(String[] args) {

        //It works great for when you want to count
        // this is also good for positioning within an array or string

        // counting up
        for (int count = 0; count < 10; count++) {
            System.out.println("For loop iteration " + count);
        }

        // count down
        for (int count = 10; count >= 1; count--) {
            System.out.println("For loop iteration " + count);
        }

        // the array is 0 based ... so that means the positions in the array are from 0 to 4
        String[] strings = {"one", "two", "three", "four", "five"};

        // old style for loop
        // note that array.length is used without ()
        for (int pos = 0; pos < strings.length; pos++) {
            // using the array [] to access the location in that array of pos
            String value = strings[pos];
            System.out.println("strings at position " + pos + " = " + value);
        }

        // looping over the characters in a string
        //                   0123456
        String characters = "abcdefg";

        // not that string.length() does use the ()
        for (int pos = 0; pos < characters.length(); pos++) {
            // in the string we are using the method charAt to get the character at a position
            char value = characters.charAt(pos);
            System.out.println("character at position " + pos + " = " + value);
        }

        // looping over a List
        List<String> stringList = new ArrayList<>();
        stringList.add("one"); // position 0
        stringList.add("two"); // position 1
        stringList.add("three"); // pos 2
        stringList.add("four"); // pos 3
        stringList.add("five"); // pos 4

        // not that the list uses .size() to get the number of elements in the list
        for (int pos = 0; pos < stringList.size(); pos++) {
            // we are using the .get function to get an element of the list by its position
            String value = stringList.get(pos);
            System.out.println("string at list position " + pos + " = " + value);

            //New style for loop for (String value : strings)
        }
    }
}
