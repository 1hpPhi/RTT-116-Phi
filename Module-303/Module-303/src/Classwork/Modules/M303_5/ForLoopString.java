package Classwork.Modules.M303_5;

public class ForLoopString {

    public static void main(String[] args) {

        String characters = "abcdefg";

        // not that string.length() does use the ()
        for (int pos = 0; pos < characters.length(); pos++) {
            // in the string we are using the method charAt to get the character at a position
            char value = characters.charAt(pos);
            System.out.println("character at position " + pos + " = " + value);
        }

        char one = '1';
        Character c = Character.valueOf(one);

        int x = Integer.parseInt(c.toString());
    }
}
