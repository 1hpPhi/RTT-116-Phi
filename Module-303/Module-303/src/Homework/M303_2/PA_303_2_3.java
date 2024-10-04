package Homework.M303_2;

public class PA_303_2_3 {
    public static void main(String[] args) {

        //Problem 1
        int x = 2;
        System.out.println("x: " + Integer.toBinaryString(x));
        //x <<= 1 OR
        x = x << 1;
        System.out.println("x: " + Integer.toBinaryString(x));
        x = x << 9;
        System.out.println("x: " + Integer.toBinaryString(x));
        x = x << 17;
        System.out.println("x: " + Integer.toBinaryString(x));
        x = x << 88;
        System.out.println("x: " + Integer.toBinaryString(x));

        //Problem 2
        int i = 150;
        System.out.println("i: " + Integer.toBinaryString(i));
        //x >>= 2 OR
        i = i >> 2;
        System.out.println("i: " + Integer.toBinaryString(i));
        i = i >> 225;
        System.out.println("i: " + Integer.toBinaryString(i));
        i = i >> 1555;
        System.out.println("i: " + Integer.toBinaryString(i));
        i = i >> 32456;
        System.out.println("i: " + Integer.toBinaryString(i));

        //Problem 3
        int a = 7;
        int b = 17;
        int z = a & b;
        System.out.println("z: " + Integer.toBinaryString(z));

        //Problem 4
        z = a | b;
        System.out.println("z: " + Integer.toBinaryString(z));

        //Problem 5
        int u = 5;
        int t = u++;
        System.out.println("t: " + t);
        int r = ++u;
        System.out.println("r: " + r);

        //Problem 6
        int h = 0;
        int e = h++;

        System.out.println("e: " + e);
        e = h++;
        System.out.println("e: " + e);
        e = h++;
        System.out.println("e: " + e);
        e = h++;
        System.out.println("e: " + e);

        //Problem 7
        int o = 5;
        int p = 8;
        int sum = ++o + p;
        System.out.println("sum: " + sum);

        int sum2 = o++ + p;
        System.out.println("sum2: " + sum2);

    }
}
