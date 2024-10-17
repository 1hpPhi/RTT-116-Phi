package Classwork.Modules.M303_11;

import java.util.*;

public class ListSetExample {

    public static void main(String[] args) {

        //Objects = any type
        //Not used ver often due to having to "find" out type before calling it
        List<Object> objects = new ArrayList<>();
        objects.add("String");
        objects.add(Integer.parseInt("1"));
        objects.add(20.0);

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(3);

        for (Integer i : intList) {
            System.out.println(i);

            //you can not remove an element from a list inside a regular for loop
        }

        Iterator<Integer> iterator = intList.iterator();

        //loop over list using iterator, checking if iterator (list) has a next element
        while (iterator.hasNext()) {
            //.next is 2 operation, 1) return element at the pointer -- 2)move the pointer over 1 element
            Integer i = iterator.next();

            //primary reason to use iterator is  when you want to remove something from the list while you are iterating the list

            if (i == 3) {
                iterator.remove();
            }
        }

        System.out.println("=====================================================");
        //using set is good for operations
        //Union
        //Intersection
        //Subset
        Set<Integer> intSet = new HashSet<>();
        intSet.add(2);
        intSet.add(3);
        intSet.add(3);
        intSet.add(1);
        intSet.add(5);
        intSet.add(4);
        intSet.add(5);
        intSet.add(5);
        intSet.add(10);

        for (Integer i : intSet) {
            System.out.println(i);
        }
    }
}
