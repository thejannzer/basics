// Adapter-Klasse, die die Ziel-Schnittstelle implementiert und eine Instanz der Adaptee-Klasse enthält
class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        // Anpassung der spezifischen Anfrage an die Ziel-Schnittstelle
        adaptee.specificRequest();
    }
}
