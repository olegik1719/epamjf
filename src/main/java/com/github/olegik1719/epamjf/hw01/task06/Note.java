package com.github.olegik1719.epamjf.hw01.task06;

public class Note {
    private String note="";

    private Note(String data){
        note = data;
    }

    public static Note create(String data){
        return new Note(data);
    }

    public String getNote(){
        return note;
    }

    public String setNote(String data){
        String oldNote = note;
        note = data;
        return oldNote;
    }

    public String clearNote(){
        return setNote("");
    }
}
