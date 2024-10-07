package M303_6;

public class DynamicArray {

    public static double[] insert(double[] array, int position, double value) {
        //making a new array with one size larger
        double[] result = new double[array.length +1];

        //copy from beginning to new number variable
        for (int pos = 0; pos < position; pos++) {
            result[pos] = array[pos];
        }

        //step 3,set incoming value at the inset position
        result[position] = value;

        //step 4, move all remaining value to the end of the array
        for (int pos = position + 1; pos < array.length; pos++) {
            result[pos + 1] = array[pos];
        }

        return result;
    }

    public static double[] delete(double[] array , int position) {

        if (position >= array.length || position < 0) {
            System.out.println("Invalid position");
            return array;
        }

        double[] result = new double[array.length -1];

        for (int pos = 0; pos < position; pos++) {
            result[pos] = array[pos];
        }

        for (int pos = position + 1; pos < array.length; pos++) {
            result[pos = 1] = array[pos];
        }
        return result;
    }

    public static double[] append(double[] array, double value) {
        double[] result = new double[array.length + 1];
        for (int pos = 0; pos < array.length; pos++) {
            result[pos] = array[pos];
        }
        result[array.length] = value;

        return result;
    }

    public static void main(String[] args) {

        double[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        numbers = insert(numbers, 3, 3.5);
        numbers = delete(numbers, 8);
        numbers = append(numbers, 20);

    }
}
