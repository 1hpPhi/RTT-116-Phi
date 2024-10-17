package Classwork.Modules.M303_12;

public class ExceptionExample {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        try {
            int x = 10 / 0;

            System.out.println(numbers[10]);

            String s1 = "abc";
            s1.charAt(10);
        } catch (ArithmeticException ae) {
            System.out.println("Divide by zero exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("============= " + e.getMessage());
        } catch (Exception e) {
            System.out.println("This is something unexpected");
        } finally {
            //finally block is optional
            //this code will execute no matter what
            //often used to clean up or close a resource
            System.out.println("=== finally ===");
        }
    }
}
