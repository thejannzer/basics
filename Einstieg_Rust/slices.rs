//Ein Slice in Rust ist eine zusammenhängende Sequenz von Elementen aus einem Vector/Array oder String etc.
//Slices sind eine art Referenz auf einen Auszug eines Elementes
fn main() {
    //Slice eines Arrays
    let array = [1, 2, 3, 4, 5];
    let slice = &array[1..3];  //enthält [2, 3]
    println!("{:?}", slice);

    //Slice eines Strings
    let string = String::from("Hello World");
    let slice_str = &string[0..5];  //"Hallo"
    println!("Slice String: {:?}", slice_str);
}
