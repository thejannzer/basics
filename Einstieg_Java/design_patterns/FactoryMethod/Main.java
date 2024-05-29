//= Klasse von der Instanzen erzeugt werden sollen mit einer oder mehreren static Methoden, die Objekte desselben Typs 
//erzeugen und an den Aufrufer zurück geben (kapselt Instanziierung von Objekten) --> mehr Flexibilität und Erweiterbarkeit
//rufen den new-Operator auf um Objekte zu instanzieren

public class Main {
    public static void main(String[] args) {
        // Textdokument-Anwendung verwenden
        Application textApp = new TextApplication();
        textApp.openDocument(); // Ruft createDocument auf um ein TextDocument-Objekt zu erstellen

        // PDF-Dokument-Anwendung verwenden
        Application pdfApp = new PdfApplication();
        pdfApp.openDocument(); // Ruft createDocument auf um ein PdfDocument-Objekt zu erstellen
    }
}
