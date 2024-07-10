fn main() {
    //Funktionale Programmierung ist Programmierparadigma, bei dem Funktionen miteinander verknüpft werden, als Parameter
    // dienen und auch als Ergebnisse auftreten können

    //Closures = anonyme Funktionen die in Variablen gespeichert werden und als Parameter genutzt werden
    //Varibalen auf die die Funktion zugreift werden in | | angegeben
    let verdoppeln = |x| x*2;
    println!("Ergebnis: {}", verdoppeln(5));

    let print = ||println!("Returns just a Text and has no Input-Parameter");
    print();


    //Monads = Design Pattern in dem mehrere Operationen miteinander Verknüpft werden
    let username = find_username();
    let age = username.and_then(|name| find_age(&name));
    println!("Age: {:?}", age);
    

}

fn find_username() -> Option<String>{
    Some("Alice".to_string())
}

fn find_age(username: &str) -> Option<u8>{
    match username{
        "Alice" => Some(30),
        _ => None,
    }
}



