//Main Funkiton
public class Main{
    public static void main(String[]args){
        //Objekte erzeugen

        bmw bmw = new bmw();
        audi audi = new audi();
        ford ford = new ford();

        //Werte wiedergeben

        System.out.println("BMW geschwindigkeit: "+ bmw.getGeschwindigkeit(0));
        System.out.println("Audi Geschwindigkeit: " + audi.getGeschwindigkeit(0));
        System.out.println("BMW Farbe: " + bmw.getFarbe());
        System.out.println("Audi Farbe: " + audi.getFarbe(null));
        System.out.println("Ford Geschwindigkeit: " + ford.getGeschwindigkeit(0));
        System.out.println("Ford Farbe: " + ford.getFarbe());
    }
}