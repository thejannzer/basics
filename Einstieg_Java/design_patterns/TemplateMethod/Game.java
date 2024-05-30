public abstract class Game {
    // Template Method... legt Reihenfolge des Algorithmus fest
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }

    // Abstrakte Methoden, die von Unterklassen implementiert werden müssen
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
}
