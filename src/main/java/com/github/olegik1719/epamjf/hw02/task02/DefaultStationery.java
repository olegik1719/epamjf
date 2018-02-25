package com.github.olegik1719.epamjf.hw02.task02;

public class DefaultStationery implements Stationery {
    @Override
    public int getCost() {
        return new java.util.Random().nextInt();
    }
}
