// 2.Encapsulation
// Interface um andere Detail zu verbergen
// gewährleistet Wiederverwendbarkeit und bessere Wartbarkeit
mod library {
    pub mod books {
        pub fn borrow_book() {
            println!("Book borrowed!");
        }
        
        fn return_book() {
            println!("Book returned!");
        }
    }
}

fn main() {
    library::books::borrow_book();      // Funktion ist öffentlich (pub)
// library::books::return_book();       // Fehler: Funktion ist privat
}

// mod = Modul... kapselt den Code und erlaubt Kontrolle darüber
// welche Teile sichtbar sind und welche nicht
