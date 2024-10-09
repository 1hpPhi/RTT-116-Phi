package Classwork.Modules.M303_7;

public class Average {
    public static void main(String[] args) {

        double[] values = {1.2, 6.5, 3.2, 9.6, 8.5};
        double sum = 0;

        for (int pos = 0; pos <values.length; pos++) {
            sum = sum + values[pos];
        }

        //New style for loop
        // For (double v : value)
        // sum = sum + v

        double avg = sum / values.length;

        System.out.println("Average is " + avg);
    }
}
