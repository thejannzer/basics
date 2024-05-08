//"super" wird verwendet um auf Elemente der übergeordneten Klassen zuzugreifen
public class Hero extends Person {

    String power;

    public Hero(String name, int age, String power){
        super(name,age);        //greift auf name und alter der Person zu
        this.power = power;     //fügt power hinzu
    }
    
}
