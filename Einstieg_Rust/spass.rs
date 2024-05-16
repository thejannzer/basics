use std::io;
fn main() {

    let mut x = String::new();
    io::stdin().read_line(&mut x).expect("Fehler!!!");

    //x in Integer umwandeln (Variable num ist x als Integer)
    let num: i32 = match x.trim().parse(){
        Ok(num) => num,
        Err(_) => {
            println!("Ungültiger input!!!");
            return;
        }
        
    };
    
    println!("Dein input ist: {num}");

    if num == 2{
        println!("2 ist eine schöne Zahl");
    }

    
}
