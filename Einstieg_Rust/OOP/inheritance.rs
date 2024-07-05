// 3.Inheritance (Trait = Interface)
// nicht klassische Vererbung wie in Java
// Rust verwendet Traits um ähnliche Funktionalitäten 
// der Vererbung zu erreichen wie in Java
trait Animal {
    fn speak(&self);
}

struct Dog;

impl Animal for Dog {
    fn speak(&self) {
        println!("Woof!");
    }
}

struct Cat;

impl Animal for Cat {
    fn speak(&self) {
        println!("Meow!");
    }
}

fn main() {
    let dog = Dog;
    let cat = Cat;
    
    dog.speak();    // Output: Woof!
    cat.speak();    // Output: Meow!
}

