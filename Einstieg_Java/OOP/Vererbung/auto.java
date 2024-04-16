//Vererbung und Polymorphie
//Auto Oberklasse
/*Vor den Bezeichner einer Methode schreiben wir den Rückgabewert, welcher einen Datentyp darstellt. 
So wie es bei Variablen auch der Fall ist. 
Wenn wir möchten, dass diese Methode nichts zurückgibt, verwenden wir void.
 */

public class auto{
    int geschwindigkeit = 0;
    String farbe;

    public int beschleunigen(int geschwindigkeit){     //muss Rückgabewert vom Typ int haben
        this.geschwindigkeit = geschwindigkeit + 20;
        return geschwindigkeit;
    }
    public String color(String farbe){
        this.farbe = "weiß";
        return farbe;
    }

    
}

