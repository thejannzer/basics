// Schnittstelle (abstrakt) aus dem JCF und keine Normale Klasse wie ArrayList oder LinkedList 
// Set ist Sammlung von Elementen 

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class SetandHashSet{
    public static void main(String[] args) {
        
        Set<String> names = new HashSet<>();      //HashSet ist eine Implementation von der Schnittstelle Set 

        names.add("Walter");
        names.add("Paul");
        names.add("Jesse");
        names.add("Mike");

        names.remove("Walter");
        names.remove(0);  //nix passiert weil 0 nicht enthalten ist
        
        // Reihenfolge der Elemente ist nicht wie bei Liste (random)
        // Sets erlauben keine mehrfach vorkommenden Elemente
        // Sets verwenden keinen Index


        System.out.println(names);
        System.out.println(names.contains("Jesse"));

        // Printed alles mit for loop
        for (String name : names){   //wie i in names in Python
            System.out.println(name);
        }

        // Printed alles mit Lambda Expression
        names.forEach(System.out::println);

        // Printed alles mit Iterator
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }

    }
}