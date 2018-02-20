package com.github.olegik1719.epamjf.hw01.task06;

import java.util.ArrayList;

public class Notepad implements Pad {

    private ArrayList<Note> notepad = new ArrayList<>();

    public static Notepad getNew(){
        return new Notepad();
    }



    @Override
    public Notepad addNote(String note) {
        notepad.add(new Note(note));
        return this;
    }

    @Override
    public Notepad removeNote(int number) {
        notepad.remove(number);
        return this;
    }

    @Override
    public Notepad editNote(int number, String newText) {
        notepad.get(number).setNote(newText);
        return this;
    }

    @Override
    public Notepad insertNote(int number, String text) {
        notepad.add(number,new Note(text));
        return this;
    }

    @Override
    public Notepad clearNote(int number) {
        notepad.get(number).clearNote();
        return this;
    }


    @Override
    public String getNotes() {
        StringBuilder result = new StringBuilder("Available " + notepad.size() + " records:\n");
        for (int i = 0; i < notepad.size(); i++)
            result.append("Record #")
                  .append(i+1)
                  .append(":\n")
                  .append(notepad.get(i).getNote())
                  .append("\n-------------\n")
            ;
        return result.toString();
    }
}
