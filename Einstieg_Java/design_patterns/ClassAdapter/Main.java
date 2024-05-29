//Adapter-Klasse erweitert die Adaptee-Klasse (anzupassende Klasse) und implementiert gleichzeitig eine Schnittstelle
//ermöglich Kooperation inkompatibler Klassen (Adapter)

public class Main {
    public static void main(String[] args) {
        Target target = new Adapter();
        // Aufrufen der Methode der Ziel-Schnittstelle
        target.request();  // Output: Called specificRequest() in Adaptee
    }
}
