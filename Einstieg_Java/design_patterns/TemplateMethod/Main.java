//Beim Template Method Pattern werden Teile eines Algorithmus durch ein Skelett dessen in einer abstrakten Klasse
//definiert. Dadurch wird der Algorithmus variabel gehalten

//... hier in dem Beispiel wird das Pattern verwendet um verschiedene Spiele und deren Ablauf zu definieren

public class Main {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();  

        System.out.println();

        game = new Football();
        game.play();  
    }
}
