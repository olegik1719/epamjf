package com.github.olegik1719.epamjf.hw01.task06;

public interface Pad {
    Pad addNote(String text);
    Pad removeNote(int number);
    Pad editNote(int number, String newText);
    String getNotes();
}