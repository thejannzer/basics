public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;     //Referenz auf ein Shape Objekt

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
