package designpatterns.factorymethod;

/**
 *
 * @author user
 */
public class DocumentCanvas extends Canvas{

    @Override
    public Shape createShape(String type) {
        Shape shape = null;
        if(type.equalsIgnoreCase("square")){
            shape = new Square();
        }else if(type.equalsIgnoreCase("rectangle")){
            shape = new Rectangle();
        }else if(type.equalsIgnoreCase("circle")){
            shape = new Circle();
        }
        return shape;
    }
    
}
