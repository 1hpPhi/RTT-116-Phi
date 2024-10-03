package org.perscholas;

public class IncrementVariables {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 0;

        //These variable are not used and should be cleaned up and deleted so it does not confuse your partners
        int d = 20;
        int e = 40;
        int f = 30;

        int result = -a;
        System.out.println(result);

        result = +a;
        System.out.println(result);

        //We assign c = b then we increment b because of the ++
        c = b++;
        System.out.println(c);

        //We increment a first because of the -- then we assign the new number of a to c
        c = ++a;
        System.out.println(c);
    }
}
