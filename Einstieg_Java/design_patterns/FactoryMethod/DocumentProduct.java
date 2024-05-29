// Produkt-Schnittstelle
interface Document {
    void open();
}

// Konkrete Produktklassen
class TextDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Text Document");
    }
}

class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF Document");
    }
}
