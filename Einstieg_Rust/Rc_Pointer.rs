// Reference Counting (Rc<T>) gehört wie auch Box zu den Smart Pointern
// ermöglicht mehreren Teilen des Programms einen Wert zu besitzen und ihn zu nutzen (mehrere Owner)
use std::rc::Rc;
fn main() {
    let a = Rc::new(5);             //Rc Pointer der auf Heap gespeichert wird
    let b = Rc::clone(&a);    //anstatt zu kopieren wird ein weiterer Rc Pointer erstellt, der auf den selben Wert wie a zeigt

    //a und b zeigen beide auf den gleichen Wert im Heap

    println!("{:p}", a);
    println!("{:p}", b);
}
