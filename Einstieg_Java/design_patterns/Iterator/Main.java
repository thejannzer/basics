//Ermöglicht es die Elemente einer Sammlung von Objekten nacheinander zu durchlaufen (iterieren)
//Wird durch Schnittstelle "Iterator" aus dem JCF unterstützt



// Testen der Sammlung und des Iterators
public class Main {
    public static void main(String[] args) {
        IntegerCollection collection = new IntegerCollection(10);
        collection.add(1);
        collection.add(2);
        collection.add(3);

        for (Integer value : collection) {
            System.out.println(value);
        }
    }
}
