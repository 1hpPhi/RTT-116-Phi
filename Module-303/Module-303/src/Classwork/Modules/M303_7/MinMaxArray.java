package Classwork.Modules.M303_7;

public class MinMaxArray {
    public static void main(String[] args) {

        int[] values = {1, 2, 3, 4, 5, 6, 8, 7, 0, -1};

        int min = values[0];
        int max = values[0];

        for (int v :values) {
            if (v < min) {
                min = v;
            }

            if (v > max) {
                max = v;
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
