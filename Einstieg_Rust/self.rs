fn main() {
    struct Punkt{
        x: f32,
        y: f32,
    }

    impl Punkt{     //impl Block wird verwendet um Implementierungen für Structs und Enums zu definieren
        //Konstruktor
        fn new(x: f32, y: f32) -> Self{
            Self{x, y}
        }
        fn anzeigen(&self){
            println!("Punkt: {} {}", self.x, self.y);
        }
    }

    let punkt = Punkt::new(3.0, 4.0);
    punkt.anzeigen();   //ruft Methode auf



}

// self ist Keyword für structs und enums um auf die Instanz einer Methode zuzugreifen
// Self ist der Typ der aktuellen Implementierung