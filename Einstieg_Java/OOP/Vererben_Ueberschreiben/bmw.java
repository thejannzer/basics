public class bmw extends auto {
    //bmw soll 5 km/h schneller sein als ein normales Auto

    @Override
    public int getGeschwindigkeit(int Geschwindigkeit){
        int getGeschwindigkeit = super.getGeschwindigkeit(geschwindigkeit);
        getGeschwindigkeit = getGeschwindigkeit+5;
        return getGeschwindigkeit;
    }
     public String getFarbe(String Farbe){        //Farbe hier auch groß geschrieben, weil neuer wertd idk
        return farbe;
     }
    
}
