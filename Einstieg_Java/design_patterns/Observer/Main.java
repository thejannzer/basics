//Dient zur Weitergabe von Änderungen an Objekte um Flexibilität und Wiederverwendbarkeit des Codes zu fördern
public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");
        Observer observer3 = new ConcreteObserver("Observer 3");

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.registerObserver(observer3);

        subject.setMessage("Hello Observers!");

        subject.removeObserver(observer2);

        subject.setMessage("Another message!");
    }
}
//Ein Subject und mehrere Observer werden erstellt. Registrieren der Observer und ändern des Zustandes des Subjects
