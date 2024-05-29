//Organisiert Einzelobjekte oder Mengen von Einzelobjekten... nützlich für hierarchische Datenstrukturen (Bäume, Verzeichnisse, ...)
/*
 * 3 Teile:
 * 1. Component: Basisklasse/Schnittstelle für alle Objekte in der Komposition. 
 *               Interface für Leaf(Einzelobjekte) und Composite(Menge von Objekten).
 * 
 * 2. Leaf: Repräsentiert Blattelemente der Komposition (Objekte ohne Unterobjekte)
 * 
 * 3. Composite: Enthält Komposita und Blätter als Kindobjekte
 */

//Beispiel: Hierarchie von graphischen Objekten. Jedes Objekt kann einfache Form (Leaf) oder Gruppe von
//          Formen (Composite) sein.

public class Main{
    public static void main(String[] args) {
        //Erstellen von Blattelementen
        Graphic circle = new Circle();
        Graphic square = new Square();

        //Erstellen von Composite Objekten
        CompositeGraphic composite1 = new CompositeGraphic();
        composite1.add(circle);
        composite1.add(square);

        CompositeGraphic composite2 = new CompositeGraphic();
        composite2.add(composite1);
        composite2.add(new Circle());

        //Zeichnen aller Objekte
        System.out.println("Composite 1");
        composite1.draw();

        System.out.println("\nComposite 2");
        composite2.draw();
    }
}