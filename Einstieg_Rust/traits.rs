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
