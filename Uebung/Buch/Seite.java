
/**
 * Beschreiben Sie hier die Klasse Seite.
 * 
 * @author Martin Janka
 * @version 2017-11-27
 */
public class Seite{
    // Datenfelder
    private String text ;

    /**
     * Default Konstruktor
     */
    public Seite(){
        text = "-kein Text-";
    }

    /**
     * Konstruktor 1
     */
    public Seite(String text){
        this.text = text;
    }

    /**
     * Set Text
     */
    public void setText(String text){
        if (text != null){
            this.text = text;
        }
    }

    /**
     * Get Text
     */
    public String getText(){
        return this.text;
    }	

    /**
     * Drucke Seiten
     */
    public void druckeSeite(){
        System.out.println(this.text);
    }	
}

