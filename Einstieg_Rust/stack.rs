// Stack ist eine nützliche Datenstruktur zur Speicherverwaltung, die nach dem Last In - First Out Prinzip arbeitet (chapter 4 Rust Book)
// Speicherplatz ist begrenzt (feste Größe), was man mit Box lösen könnte, dafür ist er schneller als der Heap
// Datentypen wie Integer und Boolean werden auf dem Stack gespeichert. Strings auf dem Heap

// Heap - Speicherzuweisungen bleiben im Gegensatz zum Stack auch über den Gültigkeitsbereich hinaus gültig
fn main() {
    let mut stack: Vec<i32> = Vec::new();   //erstellt leeren Stack
    stack.push(1);                          //fügt 1 hinzu
    stack.push(2);
    stack.push(8);

    stack.pop();                            //entfernt das oberste Element (8 (LIFO))

    let top = stack.peek();                 //gibt eine Refernez auf das oberste Element zurück
                                            //wenn Stack leer ist gibt peek() None zurück
}
