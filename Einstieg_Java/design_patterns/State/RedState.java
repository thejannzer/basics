public class RedState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Traffic light is Red. Stop!");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Red Light";
    }
}