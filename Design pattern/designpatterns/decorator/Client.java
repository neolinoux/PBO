package designpatterns.decorator;

/**
 *
 * @author user
 */
public class Client {
    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecoratorA a = new ConcreteDecoratorA(component);
        ConcreteDecoratorB b = new ConcreteDecoratorB(a);
        b.execute();
    }
}
