// Abstrakte Creator-Klasse
abstract class Application {
    // Factory Method (erzeugt Document)
    public abstract Document createDocument();

    public void openDocument() {
        // Dokument wird erstellt
        Document doc = createDocument();
        // Dokument wird geöffnet
        doc.open();
    }
}

// Konkrete Creator-Klassen (Unterklassen von Application)
class TextApplication extends Application {
    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}

class PdfApplication extends Application {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
