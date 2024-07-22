// Mit Cell und Ref Cell kann man Daten ändern und Data Races vermeiden (Threads die auf die gleichen Daten zugreifen)
// Thread ist ein Teil eines Prozesses
use std::cell::Cell;
use std::cell::RefCell;
fn main() {
    // Cell ändert den Wert durch Kopieren und es gibt keine geteilten Referenzen wie bei Smart-Poitern (Typ muss Copy Trait implementieren)
    let my_cell = Cell::new(42);
    println!("Originaler Wert: {}", my_cell.get());

    my_cell.set(100);
    println!("Neuer Wert: {}", my_cell.get());


    
    //RefCell ändert den Wert durch Laufzeitprüfung (Typ implementiert den Copy Trait nicht (String, Vec, HashMap etc.))
    let my_refcell = RefCell::new(vec![1, 2, 3]);
    {
        let mut borrowed_vec = my_refcell.borrow_mut();
        borrowed_vec.push(4);
    }

    println!("Vector nach Änderung: {:?}", my_refcell.borrow());
}

// {:?} print im Debug Trait (bei structs, enums)
// {:p} printed Adresse 