public class audi extends auto {
    //Audi soll nicht wie jedes normale Auto weiß sein, sondern blau

    @Override
    public String getFarbe(String farbe){
        String getFarbe = super.getFarbe(farbe);
        getFarbe = "blau";
        return getFarbe;

    }

    public int getGeschwindigkeit(int Geschwindigkeit){   //wird hier groß geschrieben... weil neuer wert idk
        return geschwindigkeit;
    }
    
}
