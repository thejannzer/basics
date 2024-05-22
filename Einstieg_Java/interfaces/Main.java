// Schnittstelle = Konstanten oder Methoden, die Implementierungen haben oder nicht. Abstrakter Typ, der festlegt, was eine 
// Klasse tun muss oder nicht... aehnlich zu Vererbung
// Eine Klasse kann im gegensatz zu abstrakten Klassen mehrere Interfaces erben (siehe Fish)
public class Main{
    public static void main(String[] args) {
        
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();
    }
}