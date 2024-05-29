// Adapter erbt hier nicht von der Adaptee-Klasse, sondern er enthält eine Instanz der Adaptee-Klasse und ruft ihre
// Methoden auf. --> Mehr Flexibilität, da Adapter und Adaptee nicht durch Vererbung gekoppelt sind

public class Main {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        // Erstellen eines Adapter-Objekts und Übergeben des Adaptee-Objekts
        Target target = new Adapter(adaptee);
        // Aufrufen der Methode der Ziel-Schnittstelle
        target.request();  // Output: Called specificRequest() in Adaptee
    }
}
//Aufruf von request() führt intern zu einem Aufruf von specificRequest() auf dem Adaptee-Objekt

