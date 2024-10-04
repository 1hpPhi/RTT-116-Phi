package Homework.M303_2;

public class GLab_303_2_1 {
    public static void main (String[] args) {
        //Assigning Primitive Values
        int j, k;
        j = 10; // j gets the value 10.
        j = 5; // j gets the value 5. The previous value is overwritten.
        k = j; // k gets the value 5.
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);

        //              Multiple Assignments
        k = j = 10; // (k = (j = 10))
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);


        //Auto-generated method stub
        int a, b = 10, c = 5;
        a = b + c;
        System.out.println("+ operator resulted in " + a);
        a = b - c;
        System.out.println("- operator resulted in " + a);
        a = b * c;
        System.out.println("* operator resulted in " + a);
        a = b / c;
        System.out.println("/ operator resulted in " + a);
        a = b % c;
        System.out.println("% operator resulted in " + a);
        a = b++;
        System.out.println("Postfix ++ operator resulted in " + a);
        a = ++c;
        System.out.println("Prefix ++ operator resulted in " + a);
        a = -b;
        System.out.println("Unary operator resulted in " + a);

        // Some examples of special Cases
        int tooBig = Integer.MAX_VALUE + 1; // -2147483648 which is
        // Integer.MIN_VALUE.
        int tooSmall = Integer.MIN_VALUE - 1; // 2147483647 which is
        // Integer.MAX_VALUE.
        System.out.println("tooBig becomes " + tooBig);
        System.out.println("tooSmall becomes " + tooSmall);
        System.out.println(4.0 / 0.0); // Prints: Infinity
        System.out.println(-4.0 / 0.0); // Prints: -Infinity
        System.out.println(0.0 / 0.0); // Prints: NaN

        double d1 = 12 / 8; // result: 1 by integer division. The value of d1 becomes 1.0.
        double d2 = 12.0F / 8; // result: 1.5
        System.out.println("d1 is " + d1);
        System.out.println("d2 is " + d2);

        //RelationalOperatorsDemo
        int x = 10, y = 5;
        System.out.println("x > y : "+(x > y));
        System.out.println("x < y : "+(x < y));
        System.out.println("x >= y : "+(x >= y));
        System.out.println("x <= y : "+(x <= y));
        System.out.println("x == y : "+(x == y));
        System.out.println("x != y : "+(x != y));

        int variable1 = 50, variable2 = 100, variable3 = 50;
        System.out.println("variable1 = " + variable1);
        System.out.println("variable2 = " + variable2);
        System.out.println("variable3 = " + variable3);
        System.out.println("variable1 == variable2: "
                + (variable1 == variable2));

        System.out.println("variable1 == variable3: "
                + (variable1 == variable3));

        boolean u = true;
        boolean i = false;
        System.out.println("u & i : " + (u & i));
        System.out.println("u && i : " + (u && i));
        System.out.println("u | i : " + (u | i));
        System.out.println("u || i: " + (u || i));
        System.out.println("u ^ i : " + (u ^ i));
        System.out.println("!u : " + (!u));

        int age = 18;
        String result = age < 100 ?
                "Less than 100" : "Greater than 100";
        System.out.println(result); //Less than 100

        //UnaryOperator
        int sum = +1;
        // sum is now 1
        System.out.println(sum);

        sum--;
        // sum is now 0
        System.out.println(sum);

        sum++;
        // sum is now 1
        System.out.println(sum);

        sum = -sum;
        // sum is now -1
        System.out.println(sum);

        boolean ans = false;
        // false
        System.out.println(ans);
        // true
        System.out.println(!ans);
    }
}
