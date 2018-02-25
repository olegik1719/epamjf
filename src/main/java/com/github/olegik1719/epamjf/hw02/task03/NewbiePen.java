package com.github.olegik1719.epamjf.hw02.task03;

import lombok.Getter;

@Getter
public class NewbiePen extends Pen{
    private String color;

    public NewbiePen(String name, String color){
        super(5, name, 3);
        this.color = color;
    }

}
