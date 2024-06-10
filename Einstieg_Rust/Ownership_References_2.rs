fn main() {
    //Garbage Collector kontrolliert Speicherbelegung
    //und auch Speicherfreigabe... in C muss dies selbst erledigt werden

    //In Rust wird die Speicherbelegung durch Ownership-Regeln kontrolliert (Speichersicherheit)
    //1. Jeder Wert hat einen Owner
    //2. Es kann nur einen Owner geben
    //3. Wenn der Owner den Gültigkeitsbereich verlässt, wird der Wert gedropt (sein Speicherplatz freigegeben)

    //Heap und Stack siehe Book chapter 4

    //String/string literal
    { 
        let str_lit = "hello"; // “str_lit” is declared and valid only in Scope
    } 

    let string = String::from("Hello"); // String

    let mut string = String::from("Hello"); // We need a mutable string for editing
    string.push_str(", world!"); // push_str() appends a literal to a String
    println!("{}", string);

    //Strings sind mutable, aber string literals nicht

    //Copy und Move
    {
        let x = 5;
        let y = x;  //Wert von x wird kopiert (Bei String move)

        println!("Adress of x: {:p}", &x);
        println!("Adress of y: {:p}", &y);
    }
    {
        let s1 = String::from("Hello");
        let s2 = s1; // Value of “s1” is moved into “s2”
        println!("{}, World!", s1); //Fehler 
    }        

    //--> Lösung = Refenrences + Borrowing
    //Referenz zeigt auf Adresse einer Variable und nicht auf den Wert
    //Mit der Referenzierung leihen (borrow) wir uns die Daten
    //Zur Editierung muss Dereferenziert werden (*)
    {
        let s1 = String ::from("Hello");
        let s2 = &s1;
        println!("{}, World!", s1);
    }
    {
        let a = String::from("Hello");
        i_am_owner(&a);
        println!("Content of a: {}", a);
    }
    fn i_am_owner(input: &String) {
        println!("Content of input: {}", input);
    } 


}
