
/**
 * Beschreiben Sie hier die Klasse Schulklasse.
 * 
 * @author (Marinus Eder) 
 * @version (12.12.2017)
 */

import java.util.*;
public class Schulklasse
{
    private String bezeichnung;
    private Schueler schueler0;
    private Schueler schueler1;
    private Schueler schueler2;

    public Schulklasse()
    {
        this.bezeichnung = "- keine Bezeichnung -";
        this.schueler0 = null;
        this.schueler1 = null;
        this.schueler2 = null;
    }
    
    public Schulklasse(String bezeichnung)
    {
        this();
        this.setBezeichnung(bezeichnung);
    }
    
    public Schulklasse(String bezeichnung, Schueler schueler0, Schueler schueler1, Schueler schueler2)
    {
        this(bezeichnung);
        this.setSchueler0(schueler0);
        this.setSchueler1(schueler1);
        this.setSchueler2(schueler2);
    }
    
    public void druckeInfo(){
        System.out.println(this.bezeichnung);
        System.out.println("Name: " + this.schueler0.getName());
        System.out.println("Name: " + this.schueler1.getName());
        System.out.println("Name: " + this.schueler2.getName());
    }
   
  
    public void setBezeichnung(String bezeichnung){
        this.bezeichnung = bezeichnung;
    }
  
    public void setSchueler0(Schueler schueler){
         this.schueler0 = schueler;
    }
    
    public void setSchueler1(Schueler schueler){
         this.schueler1 = schueler;
    }
    
    public void setSchueler2(Schueler schueler){
         this.schueler2 = schueler;
    }
    
    public String getBezeichnung(){
        return this.bezeichnung;
    }
    
    public Schueler getSchueler0(){
        return this.schueler0;
    }
    
    public Schueler getSchueler1(){
        return this.schueler1;
    }
    
    public Schueler getSchueler2(){
        return this.schueler2;
    }
    
}
