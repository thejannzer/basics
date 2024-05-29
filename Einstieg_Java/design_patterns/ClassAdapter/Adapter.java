// Adapter-Klasse, die die Ziel-Schnittstelle implementiert und die Adaptee-Klasse erweitert
class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        // Anpassung der spezifischen Anfrage an die Ziel-Schnittstelle
        specificRequest();
    }
}

// request-Methode wird von specificRequest-Methode überschrieben 