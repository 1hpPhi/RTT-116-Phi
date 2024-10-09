package Homework.Modules.M303_2and3;

public class PA_303_2_1 {
    public static void main(String[] args) {
        //Problem 1
        int x = 4; //not sure why this line is indented this way.
       int y = 6;
       int z = x + y;
       System.out.println("z = " + z);

       //Problem 2
        double a = 4.2;
        double b = 6.5;
        double c = a + b;
        System.out.println("c = " + c);

        //Problem 3
        int j = 8;
        double k = 9.1;
        double l = j + k;
        System.out.println("l = " + l); //Answer will be a double because 1 one the variable is a double.

        //Problem 4
        double m = 9.6; //To make it a decimal, we have to change it into a double
        int n = 3;
        double o = m / n; //This will also need to change to a double
        System.out.println("o = " + o);

        //Problem 5
        double u = 8.4;
        double i = 5.6;
        double p = u / i;
        System.out.println("p = " + p);
        double t = (int) u / (int) i;
        System.out.println("t = " + t);

        // This is the end of the assignment
    }
}
