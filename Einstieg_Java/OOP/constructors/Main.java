// main for constructor
public class Main{
    public static void main(String[]args){

        //erzeugt neues Objekt aus Klasse Human mit name human und Eigenschaften
        Human human = new Human("Marko", 34, 75);

        System.out.println();
        System.out.println(human.name+" "+human.age+" "+human.weight);

        //zusätzliche Funktionen ausführen
        human.zunehmen();
        human.bestehen();
    }
}