public class Main{
    public static void main(String[] args) {
       
        Vehicle vehicle = new Vehicle();   //nicht möglich weil Vehicle abstrakt
        Car car = new Car();

        car.go();
    }
}