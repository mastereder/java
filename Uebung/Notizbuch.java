
/**
 * Write a description of class Notizbuch here.
 * 
 * @author (Marinus Eder) 
 * 
 * @version (18.12.2017)
 */
import java.util.ArrayList;
public class Notizbuch
{
    private ArrayList<String> notizen;
       
    public Notizbuch(){
        notizen = new ArrayList<>();
    }
        
    public void hinzufuegen(String notiz){
        notizen.add(notiz);
    }
    
    public int anzahlNotizen(){
        return notizen.size();
    }
    
    public void zeigeNotiz(int index){
        if(index < 0){
            System.out.println("Falscher Index - keine negativwerte erlaubt!");
        } else if(index < anzahlNotizen()){
            System.out.println(notizen.get(index));
        } else {
            System.out.println("Index ist zu groß!");
        }
    }
    
    public String loescheNotiz (int index){
        if(checkIndex(index)){
            String zuLoeschen = notizen.get(index);
            notizen.remove(index);
            return zuLoeschen;        
        }
        return null;
    }
    
    private boolean checkIndex(int index){
        return index >= 0 && index < anzahlNotizen();
    }

}






