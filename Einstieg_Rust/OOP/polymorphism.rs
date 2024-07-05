// 4.Polymorphismus
// ermöglicht es, dass verschiedene Datentypen auf die gleiche 
// Weise behandelt werden können, indem gemeinsame Traits (Interface/Schnittstelle)
// verwendet werden
// Definieren eines Traits
trait Summarizable {
    fn summarize(&self) -> String;
}

// Implementierung des Traits für den Typ 'Article'
struct Article {
    headline: String,
    content: String,
}

impl Summarizable for Article {
    fn summarize(&self) -> String {
        format!("{}: {}", self.headline, self.content)
    }
}

// Generische Funktion, die das Trait verwendet
fn notify<T: Summarizable>(item: &T) {
    println!("Breaking news! {}", item.summarize());
}

fn main() {
    let article = Article {
        headline: String::from("Rust 1.50 Released"),
        content: String::from("Rust 1.50 has been officially released with new features."),
    };

    notify(&article);
}

