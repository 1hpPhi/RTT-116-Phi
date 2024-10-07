package M303_5;

public class WhileLoop {
    public static void main(String[] args) {

        //infinite loop
        //while (true) {
        //    System.out.println("Hello World");
        //}
        String word = "abcdefg";
        int pos  = 0;
        while (pos < word.length()) {
            pos = pos + 1;
            System.out.println("Inside while loop.");
        }
    }
}
