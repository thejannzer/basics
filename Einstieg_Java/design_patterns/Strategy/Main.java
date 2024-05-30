//kapselt einen Algorithmus in einer Klasse... ermöglicht die Auswahl eines Algorithmus zur Laufzeit

public class Main {
    public static void main(String[] args) {
        // Verwenden der Additionsstrategie
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        // Verwenden der Subtraktionsstrategie
        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        // Verwenden der Multiplikationsstrategie
        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}

//hier können verschiedene Strategys verwendet werden um die zwei Zahlen verschieden mit einander zu verrechnen