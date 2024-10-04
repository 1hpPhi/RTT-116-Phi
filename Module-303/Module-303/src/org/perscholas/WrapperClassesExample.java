package org.perscholas;

public class WrapperClassesExample {

    public static void autobox(int x) {
        System.out.println("Function called with " + x);
    }

    public static void main(String[] args) {
        int x = 5;

        //Auto boxing
        Integer y = x;

        //Passing manually
        Integer z = Integer.valueOf(x);

        //Call the function
        autobox(5);
        autobox(x);
        autobox(z);

        //All java objs can be null
        Integer value = null;

        //Primitives can not be null, but wrapper classes can
        //int v1 = null;

        Character r = null;
        System.out.println(r); //Prints out "null"


    }
}
