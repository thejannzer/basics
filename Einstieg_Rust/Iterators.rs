//Iterators sind Teil der funktionalen Programmierung in Rust
//vereinfacht looping... alternativ mit for oder while Schleifen
fn main() {
    let numbers = vec![1, 2, 3, 4, 5];

    for num in numbers.iter(){       //schneller als ohne .iter()
    println!("{}", num);
   }
    let v0 = vec![2, 4, 8, 16];
    let v = vec![1, 4, 8, 11, 15, 20];
    let v1 = vec![1, 2, 3, 4, 5];

    let v2 = v1.into_iter()                         //Iterator
                    .map(|item| item + 1)    //Closure... Map wendet Funktion auf jedes Element an
                    .collect::<Vec<_>>();                                  //Sammelt alle Elemente wieder in einem Vector

    let v3 = v.into_iter()
                    .filter(|&x| x%2 == 0)
                    .collect::<Vec<_>>();                  //filter filtert Elemente nach Bedingung

    let v4 = v0.into_iter()
                    .find(|&x| x > 7);            //find gibt das erste Element zurück, dass Bedingung erfüllt


    println!("{:?}", v2);
    println!("{:?}", v3);
    println!("{:?}", v4);

    //Iterators verhalten sich "lazy"... heißt sie müssen vom User beendet werden
    //das geschieht mit der collect() Methode
}
