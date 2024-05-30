public class YellowState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Traffic light is Yellow. Get Ready!");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Yellow Light";
    }
}