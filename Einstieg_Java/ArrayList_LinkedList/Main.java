//sind beide Implementierungen der Listenschnittstelle in Java aus dem JCF
import java.util.ArrayList;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args) {
        //ArrayList = array mit dynamischer Größe
        //Elemente können nach Kompilation hinzugefügt und entfernt werden
        //Nimmt referenz Datentypen (zeigen auf Objekte und nicht auf konkrete Daten)

        //erstelle ArrayList vom Typ String namens food
        ArrayList<String> food = new ArrayList</*Typ kann weggelassen werden*/>();

        food.add("Pizza");
        food.add("Hot Dog");
        food.add("Hamburger");

        food.set(0, "Sushi");   //ersetzt das erste Element mit Sushi
        food.remove(2);         //erntfernt das 3. element
        food.add(0, "Pasta");   //fügt Pasta an den Anfang hinzu (langsam, weil alle Elemente verrückt werden müssen)

        //printed alle Elemente in food (i = index)
        for (int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }


        //LinkedList ist verkettete Liste mit dynamischer Größe 
        //Methoden sind gleich wie bei ArrayList, aber arbeiten anders!!! (Performance)

        //erstellt neue LinkedList vom Typ String namens names
        LinkedList<String> names = new LinkedList<>();
        names.add("John");
        names.add("Paul");
        names.add("Ringo");

        System.out.println(names.get(2));

        //fügt Jerry an den Anfang ein (schnell über Referenz)
        names.add(0, "Jerry");

    }
}

//Unterschiede ArrayList und LinkedList

//ArrayList verwendet ein dynamisch wachsendes Array, Zugriff auf Elemente erfolgt über index
//LinkedList verwendet eine verkettete Liste in der jedes Element eine Referenz auf das nächste Enthält, zugriff über Refrenz (dauert länger)

//bei ArrayList erfordert Einfügen und Löschen von Elementen verschiebungen in der Liste
//bei LinkedList funktioniert Einfügen und Löschen über Änderungen an der Referenz

//ArrayList besser für häufige Zugriffe
//LinkedList besser für häufige Einfüge und Löschoperationen