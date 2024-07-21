//Option-Type ist Werkzeug zur Behandlung von optionalen Werten
//enthält entweder einen Wert (Some) oder keinen (None) (also optional)
fn main() {
    let some_number: Option<i32> = Some(5);
    let some_string: Option<&str> = Some("Hello, Rust!");
    //&str = String literal(Referenz auf Zeichenkette)
    let absent_number: Option<i32> = None;

    println!("{:?}, {:?}, {:?}", some_number, some_string, absent_number);

    //unwrap
    //gibt Wert zurück wenn Wert Some() ist und panic wenn der Wert None() ist
    let some_number: Option<i32> = Some(5);
    let value = some_number.unwrap();
    println!("The value is: {}", value);
    
    //unwrap_or
    //gibt Wert zurück bei Some() und einen Standardwert bei None()
    let some_number: Option<i32> = None;
    let value = some_number.unwrap_or(10);
    println!("The value is: {}", value);

    //map
    //wendet Funktion auf den Wert an, wenn es Some() ist und gibt "None" zurück, wenn es None() ist
    let some_number: Option<i32> = Some(5);
    let new_number = some_number.map(|x| x + 1);
    println!("{:?}", new_number);
}

    //Option Typ ist gut für Fehleresistenz des Codes