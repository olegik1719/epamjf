package com.github.olegik1719.epamjf.hw01.task06;

/**
 * Interface <p>Pad</p>.
 * main interface for notepad. Main contract for it:
 * Methods: <br>
 * 1. add Note; <br>
 * 2. insert Note; <br>
 * 3. remove Note; <br>
 * 4. clear Note; <br>
 * 5. edit Note; <br>
 * 6. get all notes<br>
 *
 * @author olegik1719
 */

public interface Pad {
    Pad addNote(String text);
    Pad removeNote(int number);
    Pad editNote(int number, String newText);
    Pad insertNote(int number, String text);
    Pad clearNote(int number);
    String getNotes();
}
