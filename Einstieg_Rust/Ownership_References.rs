fn main() {

    // Scopes begrenzen Gültigkeitsbereiche {...}
    {
     let name = "Caleb"; 
     println!("{name}");
    }
    // println!("{name}");      name nicht gültig


    let name = String::from("Caleb");
    let n = &name;      // Referenz von name... zeigt auf Adresse, nicht auf Wert
    println!("{n}");

    // Ownership
    let first = String::from("Owner");
    let name = first;        //first existiert nicht mehr... moved into name
    println!("{name}");

    let score = 50;
    let point = score;          //keine Fehler, weil int kopiert wird und nicht gemoved
    println!("{score} {point}");
{
    let name = String::from("Hello");
    let name2 = name.clone();  //kopiert (clones) name
    println!("{name} {name2}");
}
{
    let name = String::from("Rust");
    let name2 = &name;        //benutzt Referenz statt .clone()
    let name3 = &name;

    println!("{name} {name2} {name3}");
}

    //Mutable References (nur eine pro Scope möglich)
    let mut name = String::from("Java");
    let name1 = &mut name;
    //let name2 = &mut name;                wäre nicht möglich
    *name1 = String::from("Python");      //zum verändern muss dereferenziert werden mit *

{
    //zu Funktionen und Ownership
    let (mut first, mut last) = generate_name();
    greet(&first, &last);
    println!("Hello {first} {last}");     //würde ohne Referenz nicht funktionieren
}

}
    //Funktionen und Ownership
    fn greet(first: &String, last: &String) {   
        println!("Hello {first} {last}");
    
}

    fn generate_name() -> (String, String){    //Return Typ -> String
        let first = String::from("Mercedes");
        let last = String::from("BMW");
        (first, last)                          //Return ohne ;
}


  


