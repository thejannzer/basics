fn main() {
    //let author = (String::from("Dan Brown"), 1964);                                 //Tuple 1
    //let book = (String::from("The Da Vinci Code"), 2003, &author);                  //Tuple 2

    let author = Author::new("Dan Brown".to_string(), 1964);
    let book1 = Book::new("The Da Vinci Code".to_string(), 2003, author.clone());
    println!("{:#?}", book1);
}
#[derive(Debug, Clone)]
    struct Author{
        name: String,
        b_year: u32,
    }

    #[derive(Debug)]
    struct Book{
        title: String, 
        year: u32,
        author: Author,
    }

    impl Author{
        //Constructor new
        fn new(name: String, b_year: u32) -> Self{
            Self {name, b_year}
        }

        //setter
        fn set_name(&mut self, new_name: &str) -> &mut Self{
            self.name = new_name.to_string();
            self
        }
        fn set_b_year(&mut self, new_b_year: u32) -> &mut Self{
            self.b_year = new_b_year;
            self
        }
    }

    impl Book{
        //Constructor new
        fn new(title: String, year: u32, author: Author) -> Self{
            Self {title, year, author}
        }

        //setter
        fn set_title(&mut self, new_title: &str) -> &mut Self{
            self.title = new_title.to_string();
            self
        }
        fn set_year(&mut self, new_year: u32) -> &mut Self{
            self.year = new_year;
            self
        }
        fn set_author(&mut self, new_author: Author) -> &mut Self{
            self.author = new_author;
            self
        }
    }

//{:?} = debug format
//{:p} printed Adresse