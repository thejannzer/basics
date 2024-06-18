//self ist Keyword für structs und enums um auf die Instanz einer Methode zuzugreifen
fn main() {
    struct Punkt{
        x: f32,
        y: f32,
    }

    impl Punkt{     //impl Block wird verwendet um Implementierungen für Structs und Enums zu definieren
        fn anzeigen(&self){
            println!("Punkt: {} {}", self.x, self.y);
        }
    }

    let p = Punkt{
        x: 3.0,
        y: 4.0
    };
    p.anzeigen();   //ruft Methode auf
}
