package designpatterns.decorator;

/**
 *
 * @author user
 */
public class ConcreteComponent implements Component{

    @Override
    public void execute() {
        System.out.println("ConcreteComponent executed...");
    }
    
}
