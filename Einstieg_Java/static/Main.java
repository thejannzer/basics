// static Sachen gehören zur Klasse und nicht zu den Instanzen einer Klasse

public class Main {
    public static void main(String[] args) {
        Cat mycat = new Cat();

        mycat.meow();

        //non static:
        //Cat.meow();  geht nicht... Methoden gelten nur für konkrete Objekte und nicht ganze Klassen

        mycat.name = "Stella";
        mycat.age = 8;

        //non static:
        //Cat.name = "Rob";   geht nicht... nur für konkrete Objekte

        //static
        System.out.println(Cat.getCatCount());      //möglich, weil static 
                                                    //erhöht catCount der Klasse und nicht catCount einer konkreten Instanz
    }

    
}
