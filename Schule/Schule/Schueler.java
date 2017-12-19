
/**
 * Beschreiben Sie hier die Klasse Schueler.
 * 
 * @author (Marinus Eder) 
 * @version (12.12.2017)
 */
public class Schueler
{
    private String name;
    private int alter;
    private Schueler mitschueler;

    public Schueler()
    {
        name = "- Kein Name -";
        alter = -1;
        mitschueler = null;
    }
    
    public Schueler(String name, int alter)
    {
        this();
        this.setName(name);
        this.setAlter(alter);
    }

    
    public void druckeInfo()
    {
        System.out.println("Name: " + this.name + ", Alter: "+ this.alter+",");
        String nameMitschueler = "- kein Mitschueler vorhanden! -";
        if (this.mitschueler != null){
            nameMitschueler = mitschueler.getName();
        }
        System.out.println("Name des Mitschueler: "+ nameMitschueler);
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAlter(int alter){
        if(alter < 0){
            System.out.println("Alter muss positiv sein!");
            return;
        }
        
        this.alter = alter;
    }
    
    public void setMitschueler(Schueler mitschueler){
         this.mitschueler = mitschueler;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAlter(){
        return alter;
    }
    
    public Schueler getMitschueler(){
        return mitschueler;
    }
}
