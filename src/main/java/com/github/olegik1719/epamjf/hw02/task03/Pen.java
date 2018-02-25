package com.github.olegik1719.epamjf.hw02.task03;

public class Pen  extends Stationery{

    public Pen(int cost, String name, int quality){
        super(cost,name,quality);
    }

    @Override
    public String toString() {
        return "Pen "+this.getName()+", cost: " + this.getCost();
    }
}
