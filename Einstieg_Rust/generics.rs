// Polymorphismus heißt, dass Methoden in verschiedenen Objekten unterschiedlich ausgeführt werden können (Wie SWT Java)

// Generic verwendet Typparameter um Flexibilität/Wiederverwendbarkeit des Codes zu verbessern (Wie SWT Java)
fn main() {
    #[derive(Debug)]
    struct Point<T> {
        x: T,
        y: T,
    }
    
    impl<T> Point<T> {
        fn new(x: T, y: T) -> Self {
            Self { x, y }
        }
    }
    
    let int_point = Point::new(5, 10);
    let float_point = Point::new(1.0, 4.0);

    println!("{:?}", int_point);
    println!("{:?}", float_point);
    
}
