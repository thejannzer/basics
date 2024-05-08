public class Hero extends Person {

    String power;

    public Hero(String name, int age, String power){
        super(name,age);        //Überschreibt name und alter der Person
        this.power = power;     //fügt power hinzu
    }
    
}
