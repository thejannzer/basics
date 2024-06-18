//Match ist Kontrollstruktur, mit der man Code anhand eines Musters vergleichen kann um weitere Operationen auszuführen
//Match muss alle Fälle abdecken!!!
fn main() {
    //Zahl 3 mit verschiedenen Mustern vergleichen. Je nach Wert entsprechende Ausgabe
    let zahl = 3;

    match zahl{
        1 => println!("Eins"),
        2 => println!("Zwei"),
        3 => println!("Drei"),
        4|5|6 => println!("Vier, Fünf oder Sechs"),
        _ => println!("Eine andere Zahl"),      // _ wird verwendet um alle nicht genannten Fälle abzudecken
    }
    
}
