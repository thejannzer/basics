
static STRING_LIT: &str = "Hello World!";
static mut COUNTER: i32 = 0;
fn main() {
    //Static:
    //mit static werden globale Variablen definiert, also Varioablen die während der gesamten Laufzeit
    //des Programms existieren. Static Variablen sind normalerweise immutable und im gesamten Programm zugänglich
    println!("{}", STRING_LIT);

    //wenn man mut static braucht, muss mann einen unsafe-Block benutzen
    unsafe{
        COUNTER+=1;
        println!("Counter: {}", COUNTER);
    }


    //Const:
    //const-Variablen sind unveränderlich. Einmal festgelegt, kann ihr Wert nicht verändert werden.
    const POINTS: u32 = 10000;
    println!("Konstante: {}", POINTS);
    
}
