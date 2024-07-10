// Vector ist eine Liste, die Elemente des gleichen Types enthält
// wird auf Heap gespeichert
fn main() {
    
    let v: Vec<i32> = Vec::new();       //erstellt Vektor
    let v = vec![1, 2, 3];

    let mut x = Vec::new();   //push fügt Element hinzu
    x.push(1);
    x.push(2);
    x.push(3);

    x.remove(0);                   //entfernt erstes Element

    println!("{}", x.len());             //gibt Länge von x zurück

    let y: Vec<i32> = Vec::with_capacity(4);    //Erstellt Vector der 4 Elemente aufnehmen kann

    println!("{:?}", v.get(2));         //gibt das 3. Element zurück (alternativ Referenz)

    //String Updating
    //String wird definiert als ein struct mit einem Vec, der u8 Werte enthält
    //String werden mit + konkateniert
    {
        let s1 = String::from("Rust ");
        let s2 = String::from("Lecture!");
        let s3 = s1 + &s2;                  //&s2, weil + Ownership von s1 nimmt (s1 ist danach ungültig). Brauchen Referenz auf s2, damit s2 weiter gültig ist
        println!("The string s3 = {}", s3);
    }

    //format formatiert Strings ohne Ownership zu verändern
    let s1 = String::from("Rust");
    let s2 = String::from("Lecture");
    let s3 = String::from("!");
    let s = format!("{s1} {s2}{s3}");
    println!("{}", s);

    //String slice
    {
        let s = String::from("Hello");      //UTF-8 Buchstaben brauchen jeder 1 byte/8 bit (siehe s.len()) ASCII 255 Zeichen
        let s1 = String::from("Лекция");    //braucht 2 bytes pro Symbol
        let s2 = &s1[0..4]; // Prints "Ле"
        println!("UTF-8 encoded word: {} len: {}",s, s.len());
        println!("Unicode word: {} len: {}", s1, s1.len());
        println!("Unicode word slice [0..4]: {}", s2);
    }
}
