package Homework.Modules.M303_11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class GLab_303_11_5 implements cities_Comparator {

    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();
        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();
        // Using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);

        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("HashSet1: " + evenNumbers);

        HashSet<Integer> number = new HashSet<>();
        number.add(1);
        numbers.add(3);
        System.out.println("HashSet2: " + number);

        // Union of two set
        number.addAll(evenNumbers);
        System.out.println("Union is: " + number);

        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("HashSet2: " + oddNumbers);

        // Difference between HashSet1 and HashSet2
        primeNumbers.removeAll(oddNumbers);
        System.out.println("Difference : " + primeNumbers);

        HashSet<String> hset = new HashSet<String>();

        // Adding elements to the HashSet
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");
        //Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");
        //Addition of null values
        hset.add(null);
        hset.add(null);
// Using advanced for loop
        for (String str : hset) {
            System.out.println(" ---> " + str);
        }

        TreeSet<Integer> num_Treeset = new TreeSet<>();
        num_Treeset.add(20);
        num_Treeset.add(5);
        num_Treeset.add(15);
        num_Treeset.add(25);
        num_Treeset.add(10);

        // Call iterator() method to define Iterator for TreeSet
        Iterator<Integer> iter_set = num_Treeset.iterator();
        System.out.print("TreeSet using Iterator: ");
        // Access TreeSet elements using Iterator
        while(iter_set.hasNext()) {
            System.out.print(iter_set.next());
            System.out.print(", ");
        }

        TreeSet<Integer> numberz = new TreeSet<>();
        numberz.add(2);
        numberz.add(5);
        numberz.add(6);
        System.out.println("TreeSet: " + numberz);

        // Using the remove() method
        boolean value1 = numberz.remove(5);
        System.out.println("Is 5 removed? " + value1);

        // Using the removeAll() method
        boolean value2 = numberz.removeAll(numberz);
        System.out.println("Are all elements removed? " + value2);

        TreeSet<Integer> num = new TreeSet<>();
        num.add(2);
        num.add(5);
        num.add(6);
        System.out.println("TreeSet: " + num);

        // Using the first() method
        int first = num.first();
        System.out.println("First Number: " + first);

        // Using the last() method
        int last = num.last();
        System.out.println("Last Number: " + last);


    //public static void main(String[] args) {
        // Create a TreeSet with user-defined comparator
        /*TreeSet<String> cities = new TreeSet<>(new cities_Comparator());
        //add elements to the comparator
        cities.add("UAE");
        cities.add("Mumbai");
        cities.add("NewYork");
        cities.add("Hyderabad");
        cities.add("Karachi");
        cities.add("Xanadu");
        cities.add("Lahore");
        cities.add("Zagazig");
        cities.add("Yingkou");

        //print the contents of TreeSet
        System.out.println("TreeSet: " + cities);*/
    }
}

