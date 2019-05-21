package sg.edu.rp.c346.demodatabasecrud;

import java.io.Serializable;

public class Note implements Serializable {

    private int id;
    private String noteContent;

    @Override
    public String toString() {
        return "ID: " + id + ", " + noteContent;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public Note(int id, String noteContent) {
        this.id = id;
        this.noteContent = noteContent;
    }

    public int getId() {
        return id;
    }

    public String getNoteContent() {
        return noteContent;
    }

}
