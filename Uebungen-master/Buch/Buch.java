/**
 * Beschreiben Sie hier die Klasse Seite.
 * 
 * @author Martin Janka
 * @version 2017-11-27
 */
public class Buch 
{
    // Datenfelder
    private String titel;
    private Seite seite0;
    private Seite seite1;
    private Seite seite2;
    private Seite seite3;

    /**
     * Default Konstruktor
     */
    public Buch(){
        this.titel = "-kein Titel-";
        this.seite0 = new Seite();
        this.seite1 = new Seite();
        this.seite2 = new Seite();

        this.seite3 = new Seite();
    }

    /**
     * Konstruktor 1, durch die erste Anweisung (muss immer die erste sein) wird der default Konstruktor
     * aufgerufen, abgearbeitet. Und dann der im default Konstruktor gesetzte Titel mit der lokalen Variablen
     * Titel überschrieben.
     */
    public Buch(String titel){
        this();
        this.titel = titel;
    }

    /**
     * Konstruktor 2
     */
    public Buch (String titel, Seite seite0, Seite seite1, Seite seite2, Seite seite3){
        this.titel = titel;
        this.seite0 = seite0;
        this.seite1 = seite1;
        this.seite2 = seite2;
        this.seite3 = seite3;
    }

    /**
     * get Titel
     */
    public String getTitel(){
        return this.titel;
    }

    /**
     * set Titel
     */
    public void setTitel(String titel){
        if (titel != null){
            this.titel = titel;
        }
    }

    /**
     * get Seite0
     */
    public Seite getSeite0(){
        return this.seite0;
    }

    /**
     * set Seite0
     */
    public void setSeite0(Seite seite0){
        if (seite0 != null){
            this.seite0 = seite0;
        }
    }

    /**
     * get Seite1
     */
    public Seite getSeite1(){
        return this.seite1;
    }

    /**
     * set Seite1
     */
    public void setSeite1(Seite seite1){
        this.seite1 = seite1;
    }

    /**
     * get Seite2
     */
    public Seite getSeite2(){
        return this.seite2;
    }

    /**
     * set Seite2
     */
    public void setSeite2(Seite seite2){
        this.seite2 = seite2;
    }

    /**
     * get Seite3
     */
    public Seite getSeite3(){
        return this.seite3;
    }

    /**
     * set Seite3
     */
    public void setSeite3(Seite seite3){
        this.seite3 = seite3;
    }
}
