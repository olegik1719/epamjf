package com.github.olegik1719.epamjf.hw01.task06;
/**
 * Class <p>Note</p>.
 * Methods: <br>
 * 1. create; <br>
 * 2. get text; <br>
 * 3. edit; <br>
 * 4. clear; <br>
 * Fields: <br>
 * 1. note; <br>
 *
 * @author olegik1719
 */
public class Note {

    private String note;

    /**
     * Constructor for note:
     *
     * @param data  -- text for it
     */

    public Note(String data){
        note = data;
    }

    /**
     * Getting text
     * @return text in Note
     */

    public String getNote(){
        return note;
    }

    /**
     * Edit note: change text
     * @param data -- new text
     * @return old text
     */
    public String setNote(String data){
        String oldNote = note;
        note = data;
        return oldNote;
    }

    /**
     * Clear note
     * @return old text
     */
    public String clearNote(){
        return setNote("");
    }
}
