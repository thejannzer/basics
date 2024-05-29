// Adaptee-Klasse mit einer inkompatiblen Schnittstelle die angepasst werden soll
// Ist inkompatibel, weil sie eine Methode anbietet, die nicht zur Ziel-Schnittstelle passt (nicht vorhanden)
class Adaptee {
    public void specificRequest() {
        System.out.println("Called specificRequest() in Adaptee");
    }
}
