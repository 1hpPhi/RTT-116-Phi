package Classwork.Modules.M303_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamForEachExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        list = Arrays.asList(list.toString());

        list.stream().forEach(e -> {
                    System.out.println(e.toUpperCase());
                }
        );

        //how its usually seen
        list.stream().forEach(e -> System.out.println(e.toUpperCase()));

        List<String> filteredList1 = list.stream()
                .filter(e -> !e.startsWith("o"))
                .filter(e -> e.startsWith("t"))
                .collect(Collectors.toList());

        //primary use is to find something in an entity
        //list.stream().filter(e -> !e.startsWith("F")).collect(Collectors.toList());

        List<String> filteredList2 = list.stream().filter(e -> !e.startsWith("o")).filter(e -> e.startsWith("t")).collect(Collectors.toList());
        filteredList2.stream().forEach(a -> System.out.println(a));

        //fast way of removing an item from a list in one line of code
        // list.removeIf (e -> e.startsWith("o"));


    }
}
