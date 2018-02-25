package com.github.olegik1719.epamjf.hw02.task03;

import lombok.Getter;

@Getter
public class NewbieNotepad extends Notepad {
    private String color;

    public NewbieNotepad(String name, String color){
        super(5, name, 3);
        this.color = color;
    }
}
