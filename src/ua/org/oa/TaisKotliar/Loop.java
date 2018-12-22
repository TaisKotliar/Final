package ua.org.oa.TaisKotliar;

import java.lang.reflect.Array;

public class Loop {

    public static void multi(int n) {
        int temp;
        if ((n >= 2) && (n <= 20)) {
            for (int i = 1; i < 10; i++) {
                temp = n * i;
                System.out.println(n + " * " + i + " = " + temp);
            }
        }
    }
}
