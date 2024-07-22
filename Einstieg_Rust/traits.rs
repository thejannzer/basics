use std::iter::Sum;

// Traits sind Interfaces, die Sets von Methoden definieren
// Interfaces geben vor, was eine Klasse implementieren soll
fn main() {
    
    pub trait Summary{
        fn summarize(&self) -> String;
    }

    pub struct NewsArticle{
        headline: String,
        location: String,
        author: String,
        content: String,
    }

    impl Summary for NewsArticle{
        fn summarize(&self) -> String{
            format!("{}, by {} ({})", self.headline, self.author, self.location)
        }
    }

    pub struct Tweet{
        username: String,
        content: String,
    }

    impl Summary for Tweet{
        fn summarize(&self) -> String {
            format!("{}: {}", self.username, self.content)
        }
    }
}

// Copy Trait kopiert den Wert eines Elementes (primitive Datentypen)
// Clone Trait erlaubt tiefe Kopien der Werte von Elementen, also auch von komplexen Datentypen wie String
// Debug Trait ermöglicht es Typen für den Programmierer lesbar zu formatieren und wiederzugeben ({:?})
// Display Trait ist noch lesefreundlicher als der Debug Trait

// self = erstes Argument in der Methode bei traits und impl (Referenz auf das Objekt)
// Self = Typ des aktuellen Objekts

/*  trait Clone{
        fn clone(&self) -> Self;
    }
*/  