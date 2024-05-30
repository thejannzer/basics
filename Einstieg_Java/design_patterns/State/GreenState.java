public class GreenState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Traffic light is Green. Go!");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Green Light";
    }
}
