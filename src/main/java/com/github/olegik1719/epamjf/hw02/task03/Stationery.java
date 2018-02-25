package com.github.olegik1719.epamjf.hw02.task03;

import lombok.Getter;

@Getter
public abstract class Stationery {
    private final int cost;
    private final String name;
    private final int quality;

    public Stationery(int cost, String name, int quality){
        this.cost = cost;
        this.name = name;
        this.quality = quality;
    }
}
