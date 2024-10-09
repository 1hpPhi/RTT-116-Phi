package Classwork.Modules.M303_4;

public class IfStatementsExample {
    public static void main(String[] args) {

        int year = 1992;

        if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("The year is a leap year.");
        }
    }
}
