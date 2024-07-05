// Idiomatic Rust... siehe cargo clippy

// OOP dient der Flexibilität und Wiederverwendbarkeit des Codes 
// 1.Abstraction 2.Encapsulation 3.Inheritance 4.Polymorphism
// Rust ist nicht direkt objekt-orientiert, da sich Rust auf Performance und Typ-Sicherheit spezialisiert

// Klasse ist ein Bauplan für Objekte mit ähnlichen Eigenschaften

// 1.Abstraction verbirgt die Details einer Implementierung
// und legt nur die wesentlichen Merkmale und Schnittstellen offen
// Das macht Code wiederverwendbar und wartbarer
struct Rectangle {
    width: u32,
    height: u32,
}

impl Rectangle {
    fn area(&self) -> u32 {
        self.width * self.height
    }
}

fn main() {
    let rect = Rectangle { width: 30, height: 50 };
    println!("Area: {}", rect.area());
}
