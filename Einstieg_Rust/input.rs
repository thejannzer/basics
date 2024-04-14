//Input 
use std::io;   //standard libary mit input/output
fn main() {
    let mut input = String::new();   //variable "input" (String)

    io::stdin().read_line(&mut input).expect("failed to read line");   //input aus libary io, und Fehlererkennung mit "except"
    println!("{}", input);


}
