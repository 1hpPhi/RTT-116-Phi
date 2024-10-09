package Classwork.Modules.M303_6;

public class ArraysExamples {
    public static void main(String[] args) {

        int[] numbers = new int[10];

        for (int pos = 0; pos < numbers.length; pos++) {
            numbers[pos] = pos;
            System.out.println("number{" + pos +"]" + numbers[pos]);
        }

        int[] numbers2 = {1, 2, 3, 4, 5, 6};

        String [] strings = {"one", "two", "three", "four", "five"};

    }
}
