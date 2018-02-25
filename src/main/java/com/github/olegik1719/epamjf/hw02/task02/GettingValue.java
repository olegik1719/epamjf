package com.github.olegik1719.epamjf.hw02.task02;

import java.util.ArrayList;

public class GettingValue {
    private final static int N_SIZE = 10;
    public static void main(String[] args) {
        ArrayList<Stationery> stationeries = new ArrayList<>();
        for (int i = 0; i < N_SIZE; i++) {
            stationeries.add(new DefaultStationery());
        }
        int n_Value = 0;
        for (Stationery stationery:stationeries){
            n_Value += stationery.getCost();
        }
        System.out.printf("%s%n", n_Value);
    }


}
