//Struct kombiniert mit Enum und Auswertung mit match
fn main() {
    let circle = Shape::Circle(2.5);
    let rectangle = Shape::Rectangle(Rectangle{width: 3.0, height: 4.0});
    let point = Shape::Point(Point{x: 1.0, y:2.0});

    print_shape(&circle);
    print_shape(&rectangle);
    print_shape(&point);
}

struct Point{
    x: f32,
    y: f32,
}

struct Rectangle{
    width: f32,
    height: f32,
}

enum Shape{
    Circle(f32),    //Radius
    Rectangle(Rectangle),
    Point(Point),
}

fn print_shape(shape: &Shape){
    match shape{
        Shape::Circle(radius) => println!("Kreis mit Radius: {}", radius),
        Shape::Rectangle(rect) => println!("Rechteck mit Breite {} und Höhe {}", rect.width, rect.height),
        Shape::Point(point) => println!("Punkt bei ({}, {})", point.x, point.y),
    }
}
