package Classwork.Modules.M303_11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericExample {

    public static void main(String[] args) {

        //old way, both sides between <>
        List<String> strings = new ArrayList<String>();
        strings.add("String1");
        //string.add(1)

        //new way, only on left side between <>
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        //ints.add("String2");

        //this is a map
        //Map<K/Key, V/Value>
        Map<String, Integer> m = new HashMap<>();
        m.put("one",1);
    }
}
