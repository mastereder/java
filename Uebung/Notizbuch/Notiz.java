
/**
 * Beschreiben Sie hier die Klasse Notiz.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.util.*;
public class Notiz
{
    private ArrayList<String> notes;

    public Notiz()
    {
        notes = new ArrayList<>();
    }

    public void addNote(String note)
    {
        notes.add(note);
    }

    public void deleteNote(String note){
        notes.remove(note);        
    }

    public void deleteNotes(){
        notes.clear();        
    }

    public void getNotes(){
        System.out.println(notes);        
    }

    public int getS
    ize(){
        return notes.size();
    }
    
    
    public void setNote(){
        System.out.println(notes);        
    }

}
