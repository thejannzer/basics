//wie dictionary in Python oder HasMap in Java
//Schlüssel K mit Wert V   HashMap<K, V>
use std::collections::HashMap;
fn main() {
    let mut scores = HashMap::new();
    scores.insert(String::from("Alice"), 1.3);          //insert iseriert Wertepaar in Map
    scores.insert(String::from("Bob"), 2.0);

    //mit get() werden Daten erreicht
    println!("Grade is: {:.1}", scores.get("Alice").unwrap_or(&0.0));

    //Iterieren um alles zu printen
    for (key, value) in &scores {
        println!("{key}: {value:.1}");
    }


    //entry() wird verwendet um auf einen Schlüssel zuzugreifen
    let entry = scores.entry(String::from("Bob"));      //mögliche Auswertung mit match


    //or_insert() wird auf entry angewendet und fügt einen Schlüssel hinzu, falls keiner existiert
    let value = scores.entry(String::from("Konrad")).or_insert(3.0);
    println!("Der Wert von Konrad ist {}", value);


    //and_modify() wird auf entry angewendet und erlaubt es den Wert eines existierenden 
    //Schlüssels zu ändern. Wenn der Key nicht existiert, passiert nix
    scores.entry(String::from("Alice")).and_modify(|e| {*e += 1.0});    //Closure e verändert der Wert
    println!("Der modifizierte Wert von Alice ist: {}", scores["Alice"]);
    
}
