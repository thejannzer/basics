//Verhindert, dass von einer Klasse mehr als ein Objekt erzeugt werden kann
// Hauptmethode zum Testen des Singleton-Musters

public class Main{
public static void main(String[] args) {
    // Abrufen der einzigen Instanz der Singleton-Klasse
    Singleton singleton = Singleton.getInstance();

    // Aufrufen einer Methode der Singleton-Instanz
    singleton.showMessage();
    }
}