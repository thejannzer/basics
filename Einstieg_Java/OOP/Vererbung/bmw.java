//Unterklasse bmw = Schwesterklasse zu audi
//Auto soll nicht fahren
public class bmw extends auto{

    @Override
    public String color(String farbe){
        String color = super.color(farbe);
        color = "blau";
        return color;

    }

}