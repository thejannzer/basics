//Error Handling mit Result<> und panic! und unwrap

fn main() {
    // Result... wird verwendet um erwartete Fehler zu behandeln
    // enum Result<T, E>{
    //     Ok(T),                bei erfolgreichem Abschluss Typ T
    //     Err(E),               bei Fehler Typ E
    // }

    //Beispiel Result
    match division(10, 2){
        Ok(result) => println!("Ergebnis: {}", result),
        Err(e) => println!("Fehler: {}", e),
    }

    match division(10, 0){
        Ok(result) => println!("Ergebnis: {}", result),
        Err(e) => println!("Fehler: {}", e),
    }

    //Beispiel unwrap
    let result = division(10, 2).unwrap();      //beendet Programm mit panic! bei Fehler oder gibt den Wert zurück
    println!("Ergebnis: {}", result);


    //panic! für unerwartete Fehler die das Programm beenden... gibt Kontrolle an Aufrufer und sollte deshalb 
    //sparsam verwendet werden
    let v = vec![1, 2, 3];
    println!("Element: {}", access_element(v, 10));       //erzeugt panic!


}

//zu Result
fn division(a: i32, b: i32) -> Result<i32, String>{
    if b == 0{
        Err(String::from("Divison durch Null ist nicht erlaubt!"))
    }else{
        Ok(a/b)
    }
}

//zu panic!
fn access_element(v: Vec<i32>, index: usize) -> i32{
    if index >= v.len(){
        panic!("Index außerhalb des Bereiches!")
    }else{
        v[index]
    }
}
