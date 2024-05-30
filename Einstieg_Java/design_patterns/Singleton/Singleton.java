public class Singleton {

    // Private statische Instanzvariable, die die einzige Instanz der Klasse hält
    private static Singleton instance;

    // Privater Konstruktor verhindert die Instanziierung außerhalb der Klasse
    private Singleton() {
    }

    // Öffentliche statische Methode, die den globalen Zugriffspunkt bietet
    public static Singleton getInstance() {
        // Überprüfen, ob die Instanz bereits existiert
        if (instance == null) {
            // Instanziieren der einzigen Instanz
            instance = new Singleton();
        }
        return instance;
    }

    // Beispielmethode, die von der Singleton-Instanz aufgerufen werden kann
    public void showMessage() {
        System.out.println("Hello, I am a Singleton!");
    }
}