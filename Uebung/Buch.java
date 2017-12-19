
/**
 * Write a description of class Buch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buch
{
    // instance variables - replace the example below with your own
    private String titel;
    private String isbn;
    private String verlag;
    private Seite seite0;
    private Seite seite1;
    private Seite seite2;
    private Seite seite3;

    public Buch()
    {
       this.titel = "";
       this.isbn = "";
       this.verlag = "";
       this.seite0 = new Seite ("");
       this.seite1 = new Seite ("");
       this.seite2 = new Seite ("");
       this.seite3 = new Seite ("");
    }
    
    public Buch(String titel)
    {   
       this.titel = titel;
       this.isbn = "";
       this.verlag = "";
       this.seite0 = new Seite("1");
       this.seite1 = new Seite("2");
       this.seite2 = new Seite("3");
       this.seite3 = new Seite("4");
    }

    public Buch(String titel, String isbn, String verlag, String seite0, String seite1, String seite2, String seite3)
    {
       this.titel = titel;
       this.isbn = isbn;
       this.verlag = verlag;
       this.seite0 = new Seite(seite0);
       this.seite1 = new Seite(seite1);
       this.seite2 = new Seite(seite2);
       this.seite3 = new Seite(seite3);
    }
    
    public void drucken()
    {
        System.out.println(titel);
        
        seite0.drucken();
        seite1.drucken();
        seite2.drucken();
        seite3.drucken();
    }
    
    public void setTitel(String titel)
    {
        this.titel = titel;
    }
    
    public String getTitel()
    {
        return this.titel;
    }
    
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }
    
    public String getIsbn()
    {
        return this.isbn;
    }
    
    
    public void setVerlag(String verlag)
    {
        this.verlag = verlag;
    }
    
    public String getVerlag()
    {
        return this.verlag;
    }
    
    public void setSeite0(Seite seite0)
    {
        this.seite0 = seite0;
    }
    
    public Seite getSeite0()
    {
        return this.seite0;
    }
    
    public void setSeite1(Seite seite1)
    {
        this.seite1 = seite1;
    }
     
    public Seite getSeite1()
    {
        return this.seite1;
    }
    
    public void setSeite2(Seite seite2)
    {
        this.seite2 = seite2;
    }
        
    public Seite getSeite2()
    {
        return this.seite2;
    }
    
    public void setSeite3(Seite seite3)
    {
        this.seite3 = seite3;
    }
    
    public Seite getSeite3()
    {
        return this.seite3;
    }
}
