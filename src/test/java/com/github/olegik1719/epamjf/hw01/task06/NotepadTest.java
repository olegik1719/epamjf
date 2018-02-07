package com.github.olegik1719.epamjf.hw01.task06;

import org.junit.Test;

import static org.junit.Assert.*;

public class NotepadTest {

    @Test
    public void getNotes() {
        Notepad notepad = Notepad.getNew()
                .addNote("Note 01")
                .addNote("Note 02")
                .addNote("Note 03")
                .removeNote(2)
                .editNote(1,"Last Note")
                .addNote(1,"include")
                .clearNote(1)
            ;
        System.out.printf("%s%n", notepad.getNotes());
    }
}