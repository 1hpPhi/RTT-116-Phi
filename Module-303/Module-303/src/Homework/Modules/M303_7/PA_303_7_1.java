package Homework.Modules.M303_7;

import java.util.Scanner;
import java.util.Arrays;

public class PA_303_7_1 {
    public static void main(String[] args) {

        //Task 1
        int array[] = {1, 2, 3};
        System.out.println(array);

        //Task 2
        int array2[] = {13, 5, 7, 68, 2};
        System.out.println(array2[2]);

        //Task 3
        String array3[] = {"red", "green", "blue", "yellow"};
        System.out.println(array3.length);
        array3.clone().toString();

        //Task 4
        int[] array4 = new int[5];
        System.out.println(array4[0]);
        System.out.println(array4[4]);

        System.out.println(array4.length - 1);
        System.out.println(array4[0]);
        System.out.println(array4[4]);

        //Task 5
        int[] array5 = new int[5];

        for (int i = 0; i < array5.length; i++) {
            array5[i] = i + 1;
        }


        //Task 6
        int[] array6 = new int[5];

        for (int j = 0; j < array6.length; j++) {
        array6[j] = j * 2;;
        }

        //Task 7
        int[] array7 = {1, 3, 5, 7, 9};

        for (int l = 0; l < array7.length; l++) {
            if (array7[l] != array7[2]) {
                System.out.println(array7[l]);
            }

        }

        //Task 8
        String[] array8 = {"red", "green", "blue", "yellow", "purple"};
        int m = 0;
        int n = 0;

        Scanner pos = new Scanner(System.in);
        System.out.println("What position do you want to switch? ");
        m = pos.nextInt();
        System.out.println("This is what you put " + m);
        System.out.println("What position do you want to switch? ");
        n = pos.nextInt();
        System.out.println("This is what you put " + n);

        String temp = array8[m];
        array8[m] = array8[n];
        array8[n] = temp;

        for (String str : array8) {
            System.out.println(str);
        }

        //Task 9
        int[] array9 = {4, 2, 9, 13, 1, 0};

        Arrays.sort(array9);

        System.out.println("Array in ascending order ");

        for (int v = 0; v < array9.length; v++){
            System.out.println(array9[v]);
            if (v < array9.length - 1){
                System.out.println(", ");
            }
        }
        int under = array9[0];
        int over = array9[array9.length - 1];

        System.out.println("This is your biggest value " + over);
        System.out.println("This is your smallest value " + under);

        //Task 10




    }
}
