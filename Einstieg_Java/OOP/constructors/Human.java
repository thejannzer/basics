//constructors

public class Human{
    
    String name;
    int age;
    int weight;

    //constructor
    Human(String name, int age, int weight){
        this.name = name;
        this.age = age;                 //this ist Referenz auf Objekt (wie self in Python)
        this.weight = weight;
    }

    void zunehmen(){
        System.out.println("Du hast zugenommen");
    }

    void bestehen(){
        System.out.println("Du hast die Prüfung bestanden");
    }
}

