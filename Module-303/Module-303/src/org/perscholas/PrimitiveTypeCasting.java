package org.perscholas;

public class PrimitiveTypeCasting {
    public static void main(String[] args) {
        int x = 5;

        //y is an "int" which only takes a whole number.
        int y = 5 / 2;
        System.out.println(y);

        //We will get a decimal number because we have a decimal number for one of the numbers
        double z = 5 / 2.0;
        System.out.println(z);

        //Both are a "float" number so it can Math correctly.
        double d = 5.0 / 2.0;
        System.out.println(d);

        //Type casting way of doing it.
        double e = (double)5 / (double)2;
        System.out.println(e);

        //Another example of type casting.
        int j = 5;
        int k = 2;
        double l = (double)j / (double)k;
        System.out.println(l);


    }
}
