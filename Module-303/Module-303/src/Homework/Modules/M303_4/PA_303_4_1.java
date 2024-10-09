package Homework.Modules.M303_4;

import java.util.Scanner;

public class PA_303_4_1 {
    public static void main(String[] args) {

        //Problem 1
        Scanner x = new Scanner(System.in);

        if(x.nextInt() < 10) {
            System.out.println("x is less than 10");
        }

        //Problem 2
        Scanner y = new Scanner(System.in);

        if(y.nextInt() <= 10) {
            System.out.println("x is less than 10");
        } else if(y.nextInt() > 10) {
            System.out.println("x is greater than 10");
        }

        //Problem 3
        Scanner z = new Scanner(System.in);

        if(z.nextInt() <= 10) {
            System.out.println("x is less than 10");
        } else if(z.nextInt() > 10 && z.nextInt() < 20) {
            System.out.println("x is greater than 10, but less than 20");
        } else if (z.nextInt() <= 20) {
            System.out.println("x is greater than 20");
        }

        //Problem 4
        Scanner a = new Scanner(System.in);

        if(a.nextInt() <= 10) {
            System.out.println("x is out of range");
        } else if(z.nextInt() >= 10 && z.nextInt() <= 20) {
            System.out.println("x is in range");
        }

        //Problem 5
        Scanner grade = new Scanner(System.in);
        if(grade.nextInt() < 0 || grade.nextInt() > 100) {
            System.out.println("Grade is out of range");
        } else if(grade.nextInt() <= 100 && grade.nextInt() >= 0) {
            int g = grade.nextInt() % 10;
                if (g <= 5) {
                    System.out.println("Grade: F");
                } else if (g == 6) {
                    System.out.println("Grade: D");
                } else if (g == 7) {
                    System.out.println("Grade: C");
                } else if (g == 8) {
                    System.out.println("Grade: B");
                } else if (g >= 9) {
                    System.out.println("Grade: A");
                }
        }

        //Problem 6
        Scanner day = new Scanner(System.in);
        switch (day.nextInt()) {
            case 1: System.out.println("Sunday");
            break;
            case 2: System.out.println("Monday");
            break;
            case 3: System.out.println("Tuesday");
            break;
            case 4: System.out.println("Wednesday");
            break;
            case 5: System.out.println("Thursday");
            break;
            case 6: System.out.println("Friday");
            break;
            case 7: System.out.println("Saturday");
            break;
            default: System.out.println("Out of range");
        }
    }
}
