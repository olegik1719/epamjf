package com.github.olegik1719.epamjf.hw01.task02;

import java.util.ArrayList;

public class task02 {

    private static double epsilon = 0.0001;

    public static void main(String... args){
        int n = 0;
        ArrayList<Double> arrayList= new ArrayList<>();
        do {
            n++;
            arrayList.add(expression(n));
        } while (arrayList.get(n-1) >= epsilon);
        System.out.printf("%d%n",n);
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d: %f;%n",i,arrayList.get(i-1));
        }
    }

    private static double expression(int arg){
        return (double) 1/((arg+1)*(arg+1));
    }
}
