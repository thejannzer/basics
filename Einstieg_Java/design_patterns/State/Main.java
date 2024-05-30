//State (Zustand) ermöglicht es einem Objekt sein Verhalten/Zustand zu ändern
//Ermöglicht mehr Flexibilität im Code

//..hier Beispiel der Zustände einer Ampel

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        RedState redState = new RedState();
        redState.doAction(context);
        System.out.println(context.getState().toString());

        YellowState yellowState = new YellowState();
        yellowState.doAction(context);
        System.out.println(context.getState().toString());

        GreenState greenState = new GreenState();
        greenState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
//Testen verschiedener Zustände