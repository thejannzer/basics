//Unterklasse Audi
//geschwindigkeit soll höher sein als in der Oberklasse auto
//anderen Eigenschaften werden vererbt durch wort "extends"

public class audi extends auto{

    @Override       //überschreibt folgende Methode für diese Unterklasse
    public int beschleunigen(int geschwindigkeit){
        int beschleunigen = super.beschleunigen(geschwindigkeit);     //super überschreibt Methode
        beschleunigen = beschleunigen + 5;                            //Erhöht Normalgeschwindigkeit um 5 km/h
        return beschleunigen;
        
    }





}