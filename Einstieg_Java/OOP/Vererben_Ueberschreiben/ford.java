public class ford extends auto {

    @Override
    public int getGeschwindigkeit(int Geschwindigkeit){
        int getGeschwindigkeit = super.getGeschwindigkeit(geschwindigkeit);
        getGeschwindigkeit = getGeschwindigkeit + 3;
        return getGeschwindigkeit;
    }

    public String getFarbe(){
        return farbe;
    }
    
}
