package Homework.Modules.M303_7;

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
        int i = 0;

        while (array5 != null) {
            System.out.println(array5[i]);
            array5[i]++;
        }

        //Task 6
        int[] array6 = new int[5];
        int j = 0;

        while (array6 != null) {
            System.out.println(array6[j * 2]);
            array6[j]++;
        }

        //Task 7
        int[] array7 = new int[5];
        int k = 0;

        while (array7 != null && k != 2) {
            System.out.println(array7[k]);
            array7[k]++;
        }

        //Task 8
        
    }
}
