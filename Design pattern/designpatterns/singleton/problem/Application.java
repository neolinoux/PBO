package designpatterns.singleton.problem;

/**
 *
 * @author user
 */
public class Application {
    public static void main(String[] args) {
        OrderRepository orderRepository = new OrderRepository();
        orderRepository.save("0001");
        
        OrderDetailRepository orderDetailRepository = new OrderDetailRepository();
        orderDetailRepository.save("0001", "Makanan");
        orderDetailRepository.save("0001", "Minuman");
        orderDetailRepository.save("0001", "Pakaian");
    }
}
