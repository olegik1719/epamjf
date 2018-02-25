package com.github.olegik1719.epamjf.hw02.task03;

public class Notepad extends Stationery{

    public Notepad(int cost, String name, int quality){
        super(cost,name,quality);
    }

    @Override
    public String toString() {
        return "Notepad "+this.getName()+", cost: " + this.getCost();
    }
}
