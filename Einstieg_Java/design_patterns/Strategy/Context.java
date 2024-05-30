// Context Class
public class Context {
    private Strategy strategy;

    // Konstruktor zur Einstellung der Strategie
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // Methode zur Ausführung der Strategie
    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
