fn main() {
    //Variablen
    let x = 4;     //legt Variable x fest, i32 ist Datentyp (int 32 bit) kann auch verändert werden
    println!("x is: {}", x);    //mut muted die Variable x
    let y = "hello";
    println!("{}", y);
    let z = 2.4;    //Variable z float
    println!("{}", z);
    

    //Arrays
    let arr = [1, 2, 3, 4, 5];    //Index 0, 1, 2, 3, 4
    println!("{}", arr[3]);
   
}

// "Hello World" = string literal
// String::from("Hello World") = String