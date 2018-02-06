package com.github.olegik1719.epamjf.hw01.task03;

public class Main {

    private static double a=1;
    private static double b=2;
    private static int n=20;

    public static void main(String[] args) {
        for (int i = 0; i <= n ; i++) {
            double arg = a+i*(b-a)/n;
            System.out.printf("%1.3f: %.7f%n",arg, expression(arg));
        }

    }

    private static double expression(double x){
        return Math.tan(2*x) - 3;
    }
}
