fn main() {
    //Integer
    let x = 4;     //legt Variable x fest, i32 ist Datentyp (int 32 bit) kann auch verändert werden
    println!("x is: {}", x);    //mut muted die Variable x

    //String literal immutable
    let y = "hello";
    println!("{}", y);

    //float
    let z = 2.4;    
    println!("{}", z);

    //String mutable
    let s = String::from("Hello World")
    
    //Arrays
    let arr = [1, 2, 3, 4, 5];    //Index 0, 1, 2, 3, 4
    println!("{}", arr[3]);

    //Tuple
    let t: (i32, f64, f32) = (500, 2356.0, 24.3);

    //Character
    let c = 'x';
   
}

// "Hello World" = string literal
// String::from("Hello World") = String
// String ist mutable, string literal nicht