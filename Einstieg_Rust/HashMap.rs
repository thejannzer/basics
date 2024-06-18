//wie dictionary in Python oder HasMap in Java
//Schlüssel K mit Wert V   HashMap<K, V>
use std::collections::HashMap;
fn main() {
    let mut scores = HashMap::new();
    scores.insert(String::from("Alice"), 1.3);
    scores.insert(String::from("Bob"), 2.0);

    //mit get() werden Daten erreicht
    println!("Grade is: {:.1}", scores.get("Alice").unwrap_or(&0.0));

    //Iterieren um alles zu printen
    for (key, value) in &scores {
        println!("{key}: {value:.1}");
    }
}
