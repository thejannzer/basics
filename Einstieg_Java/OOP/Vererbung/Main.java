//Main Funktion
public class Main {
    public static void main(String[]args){
        //Objekte erzeugen
        audi audi = new audi();
        bmw bmw = new bmw();
        auto auto = new auto();

        System.out.println("Normalgeschwindigkeit:" + auto.beschleunigen(0));
        System.out.println("Normale Farbe: " + auto.color(""));
        System.out.println("Audi Geschwindigkeit: " + audi.beschleunigen(20));
        System.out.println("BMW Farbe: " + bmw.color(""));
        

    }
    
}
