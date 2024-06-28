// map ist in Rust bei Iterators verfügbar
// map wendet eine Closure (anonyme Funktion) auf jedes Element eines Iterators an und gibt einen neuen Iterator 
// mit den Ergebnissen der Closure zurück
fn main() {
    
    let zahlen = vec![1, 2, 3, 4, 5];
    let verdoppelte_zahlen: Vec<i32> = zahlen.iter().map(|&x| x * 2).collect();
    // map wendet die Closure auf jedes Element des Iterator an  (verdoppelt jedes Element)
    println!("{:?}", verdoppelte_zahlen);
}
