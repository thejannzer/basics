import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Peter", 25));
        people.add(new Person("Leo", 19));

        //Person Objekte werde nach dem Alter sortiert
        Collections.sort(people);

        for (Person person : people){
            System.out.println(person);
        }
    }
}
