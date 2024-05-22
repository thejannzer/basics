// Comparable ist Interface aus dem JCF, das verwendet wird um Objekte zu vergleichen, 
// damit sie in einer Sammlung wie Set, Map oder Methoden wie Collections.sort oder Arrays.sort korrekt angeordnet werden können

public class Person implements Comparable<Person>{  
    //verwendet generischen Typ um Art (Person) der Objekte, die verglichen werden sollen festzulegen
    // ... compareTo Methode akzeptiert nur Person-Objekte
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //compareTo vergleich das aktuelle Objekt mit dem angegebenen Objekt (other vom Typ Person)
    //vergleicht Alter der Person mit Alter der anderen
    @Override
    public int compareTo(Person other){
        return Integer.compare(this.age, other.age);
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    //erstellt textuelle Darstellung des Objektes. Erbt von der obersten Klasse "Object"
    @Override
    public String toString(){
        return "Person{name'" + name + "', age=" + age + "}";
    }

}