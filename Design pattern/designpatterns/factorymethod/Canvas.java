package designpatterns.factorymethod;

public abstract class Canvas {

    public abstract Shape createShape(String shapeType);

    public Shape drawShape(String type) {
        Shape shape = createShape(type);
        shape.draw();
        return shape;
    }
}
