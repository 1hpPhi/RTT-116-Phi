package Classwork.Modules.M303_11;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<String,Integer> numbers = new HashMap<>();
        //Value can be duplicate but Key can not
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("ten", 10);
        numbers.put("Ten", 10);

        Integer x = numbers.get("one");
        Integer x2 = numbers.get("two");

        for (String key : numbers.keySet()) {
            Integer value = numbers.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
