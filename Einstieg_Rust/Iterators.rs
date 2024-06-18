//Iterators sind Teil der funktionalen Programmierung in Rust
//vereinfacht looping
fn main() {
    let numbers = vec![1, 2, 3, 4, 5];

    for num in numbers.iter(){       //schneller als ohne .iter()
    println!("{}", num);
   }

    let v1 = vec![1, 2, 3, 4, 5];
    let v2 = v1.into_iter()            //Iterator
        .map(|item| item + 1)   //Closure
        .collect::<Vec<_>>();                                 //Sammelt alle Elemente wieder in einem Vector

    println!("{:?}", v2);

    //Iterators verhalten sich "lazy"... heißt sie müssen vom User beendet werden
    //das geschieht mit der collect() Methode
}
