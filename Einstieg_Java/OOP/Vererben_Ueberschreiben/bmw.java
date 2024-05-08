public class bmw extends auto {
    //bmw soll 5 km/h schneller sein als ein normales Auto
    //"super" wird verwendet um auf Elemente der übergeordneten Klassen zuzugreifen (nicht überschreiben)

    @Override
    public int getGeschwindigkeit(int Geschwindigkeit){
        int getGeschwindigkeit = super.getGeschwindigkeit(geschwindigkeit);
        getGeschwindigkeit = getGeschwindigkeit+5;
        return getGeschwindigkeit;
    }
     public String getFarbe(){        //Farbe hier auch groß geschrieben, weil neuer wert idk
        return farbe;
     }
    
}