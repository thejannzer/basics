fn main() {
    //Struct = Datenstruktur, die es ermöglicht mehrere Werte unterschiedlicher Datentypen zu gruppieren
    
    #[derive(Debug)]            //Debug Trait (Trait=Sammlung von Methoden), sorgt dafür, dass alles geprinted werden kann
    //Classic Struct            //Debug-Trait ermöglicht es, Instanzen der Struktur in einem menschenlesbaren Format auszugeben
    //Definition des Structs:
    struct User{
        username: String,
        email: String,
        sign_in_count: u64,
        active: bool,
    }

    //Erstellung einer Instanz des Structs:
    let user1 = User {
        username: String::from("thejannzer"),
        email: String::from("thejannzer@gamil.com"),
        sign_in_count: 21,
        active: true,
    };
    println!("Username: {}", user1.username);
    println!("Alles: {:?}", user1);    //{:?} Platzhalter um Daten in Debugformatierung auszugeben... stellt Werte des Struct dar

    //Tuple Struct... keine benannten Felder, sondern Felder, die Position haben
    struct Color(i32, i32, i32);
    
    let black = Color(0,0,0);
    println!("Black: ({}, {}, {})", black.0, black.1, black.2);

    


    //Enum = Datenstruktur mit der man einen Wert aus einer vordefinierten Menge von Varianten wählen kann
    enum Ampel{         //enum "Ampel" mit 3 Varianten/Zuständen
        Red,
        Yellow,
        Green,
    }
    let light = Ampel::Red;       //erstellt Variable red mit vordefinierten Wert aus Ampel
    
    //enum mit match auswerten (status)
    fn status(light: Ampel){
        match light{
            Ampel::Red => println!("Das Licht ist Rot!"),
            Ampel::Green => println!("Das Licht ist Grün!"),
            Ampel::Yellow => println!("Das Licht ist Gelb"),
        }
    }
    status(light);

    

    //impl wird benutzt um structs und enums zu implementieren
    
}

