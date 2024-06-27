//Box ist Zeigerkonstrukt, mit dem Daten auf dem Heap gespeichert werden
//stellt korrekte Speicherfreigabe und belegung sicher
fn main() {
    let x = 5;                     // x wird auf dem Stack gespeichert
    let y = Box::new(x);      // x wird in eine Box (Heap) gepackt und y zugewiesen
    let z = *y;                    // Box wird dereferenziert um auf Daten zugreifen zu können und wird z zugewiesen

    println!("Stack x: {}", x == 5);   //== vergleicht und gibt true zurück 
    println!("Box (Heap) x: {}", z);
    //Box und Integer können nicht verglichen werden 
}

/*Vorteile einer Box:
    - Speichergrößenlimit des Stack umgehen
    - eindeutiger Owner
    - kontrollierte Lebensdauer
    - kann verwendet werden um Trait-Objekte zu speichern
    - ermöglicht rekursive Typen (Typen die einen Teil von sich selbst enthalten) */

// rekursive Funktion = Funktion die sich selbst aufruft