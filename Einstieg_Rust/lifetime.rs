// Lifetime gibt an wie lange eine Referenz auf ein Objekt Gültig ist
// In Scopes... bilden eigene Blöcke und außerhalb des Scopes werden Variablen aufgeräumt/ungültig

// Mit Lifetime Spezifier 'a kann man angeben wie lange eine Referenz gültig sein soll
fn main() {
    // Lifetimes mit struct
    struct Buch<'a>{                                    //Struct und title Lifetime 'a
        titel: &'a str,
    }

    impl<'a> Buch<'a>{                                  //Methoden im Block impl sind so lange gültig wie das struct
        fn title(&self) -> &'a str{                     
            self.titel
        }
    }
}

fn laengstes<'a>(x: &'a str, y: &'a str) -> &'a str{    //Referenz x und y müssen mindestens so lang leben wie 'a
    if x.len() > y.len(){                               //Rückgabewert muss ebenfalls so lang leben wie 'a
        x
    }else{
        y
    }
}

//Lifetimes sind notwendig, damit keine Referenz auf ungültige Speicherbereiche zeigt