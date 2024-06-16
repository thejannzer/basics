public class Cat{

    private static int catCount;
    String name;
    int age;
    int livesRemaining;

    public void meow() {
        System.out.println("Meow");
    }

    //Konstruktor
    public Cat(){
        catCount++;   //bei jedem Erstellen einer Katze wird der catCount um 1 erhöht (1)
    }

    public static int getCatCount(){
        return catCount;
    }
}