//Funktionen
fn main() {
    println!("Hello, world!");

    //Funktion "test" aufrufen
    test();
    add_numbers(20, 30);
    add_numbers2(20, 30);

    //Statement
    let number = {
        let x = 3;
        x+1   //kein Semikolon, weil x+1 returnt werden muss
    };
    println!("{}", number)    //kein Semikolon, weil number returnt werden soll
}

//neue Funktion "test" ... können überall im Code implementiert werden
fn test(){
    println!("Test has been called...");
}

fn add_numbers(x:i32, y:i32){
    println!("Summe ist: {}", x+y)    //kein Semikolon, weil siehe oben...
}

//alternative
fn add_numbers2(x:i32, y:i32) -> i32 {      //Returns type i32
    let result = x + y;       
    return result;                 //bei Keyword "result" ist Semikolon egal
    
}


