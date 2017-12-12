
/**
 * Beschreiben Sie hier die Klasse Ball.
 * 
 * @author Martin Janka
 * @version 2017-12-05
 */
public class Ball
{
    private double maxFuellmenge;
    private double aktFuellmenge;

    public Ball(double maxFuellmenge){
        this.maxFuellmenge = maxFuellmenge;
        aktFuellmenge = 0;
    }

    public double getAktFuellmenge(){
        return aktFuellmenge;
    }

    public double getMaxFuellmenge(){
        return maxFuellmenge;
    }

    public void aufpumpen(double fuellmenge){
        if (fuellmenge < 0.0){
            System.out.println("Negative Wert sind nicht möglich");
            return;
        }
        double neueFuellmenge = aktFuellmenge + fuellmenge;
        if(neueFuellmenge > maxFuellmenge){
            System.out.println("Maximale Füllmenge erreicht");
            aktFuellmenge = maxFuellmenge;
            return;
            
        }  
        double saveAktMenge = aktFuellmenge;
        if(neueFuellmenge > aktFuellmenge){
            aktFuellmenge = neueFuellmenge;

        }
    }       

    public void luftRausLassen(double menge){

        if (menge <= 0.0){
            System.out.println("Bitte geben Sie einen gültigen Wert ein");
            return;
        }
        double neueMenge = aktFuellmenge - menge;
        if(neueMenge <= 0.0){
            System.out.println("Ball ist leer");
            aktFuellmenge = 0.0;
            return;
        }  

        if(neueMenge < aktFuellmenge){
            aktFuellmenge = neueMenge;
        }
    }     
    
    public double getLuftdruckInProzent(){
        double inProzent = aktFuellmenge/maxFuellmenge*100;
        return inProzent;
    }
    
    public void c(){
        System.out.println("Aktuelle Fuellmenge: "+ aktFuellmenge + ", Maximale Fuellmenge: " + maxFuellmenge);
        System.out.println("Luftdruck in Prozent: " + getLuftdruckInProzent());
    }
}

