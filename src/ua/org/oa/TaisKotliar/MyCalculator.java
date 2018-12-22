package ua.org.oa.TaisKotliar;

public class MyCalculator {
    public static void power(int n, int p) throws Exception{
        if ((n < 0) || (p < 0)) throw new Exception("n or p should not be negative.");
        if ((n == 0) || (p == 0)) throw new Exception("n and p should not be zero.");
        System.out.println((int) Math.pow(n, p));
    }

}
