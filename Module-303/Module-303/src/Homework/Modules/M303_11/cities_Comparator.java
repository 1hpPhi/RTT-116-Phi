package Homework.Modules.M303_11;

import java.util.Comparator;

public interface cities_Comparator extends Comparator<String> {
    @Override
    public default int compare(String cities_one, String cities_two) {
        int value =  cities_one.compareTo(cities_two);
        // sort elements in reverse order
        if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
