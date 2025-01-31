package Homework.Modules.M303_11;

import java.util.HashMap;
import java.util.TreeMap;

public class GLab_303_11_6 {

    public static void main(String[] args) {

        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        languages.put(4, "C Sharp");

        System.out.println("HashMap: " + languages);
        // remove element associated with key 2
        String value = languages.remove(2);
        System.out.println("Removed value: " + value);
        System.out.println("Updated HashMap: " + languages);

        HashMap<String, String> newHashMap = new HashMap<>();
// Addition of key and value
        newHashMap.put("Key1", "Lenovo");
        newHashMap.put("Key2", "Motorola");
        newHashMap.put("Key3", "Nokia");
        newHashMap.put("Key4", null);
        newHashMap.put(null, "Sony");
        System.out.println("Original map contains:" + newHashMap);
//getting size of Hashmap
        System.out.println("Size of original Map is:" + newHashMap.size());
//copy contains of one Hashmap to another
        HashMap<String, String> copyHashMap = new HashMap<>();
        copyHashMap.putAll(newHashMap);
        System.out.println("copyHashMap mappings= " + copyHashMap);
//Removal of null key
        String nullKeyValue = copyHashMap.remove(null);
        System.out.println("copyHashMap null key value = " + nullKeyValue);
        System.out.println("copyHashMap after removing null key = " + copyHashMap);
        System.out.println("Size of copyHashMap is:" + copyHashMap.size());

        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap: " + numbers);

        // remove method with single parameter
        int values = numbers.remove("Two");
        System.out.println("Removed value: " + values);

        // remove method with two parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry {Three=3} removed? " + result);
        System.out.println("Updated TreeMap: " + numbers);

        TreeMap<String, Integer> number = new TreeMap<>();
        number.put("First", 1);
        number.put("Second", 2);
        number.put("Third", 3);
        System.out.println("TreeMap: " + number);

        // Using the firstKey() method
        String firstKey = number.firstKey();
        System.out.println("First Key: " + firstKey);
        // Using the lastKey() method
        String lastKey = number.lastKey();
        System.out.println("Last Key: " + lastKey);

        // Using firstEntry() method
        System.out.println("First Entry: " + number.firstEntry());

        // Using the lastEntry() method
        System.out.println("Last Entry: " + number.lastEntry());


    }
}

