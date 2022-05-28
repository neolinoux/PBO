package designpatterns.singleton.solution;

import designpatterns.singleton.problem.*;

/**
 *
 * @author user
 */
public class OrderDetailRepository {
    public void save(String orderId, String product){
        DatabaseConnection.getInstance().execute("INSERT INTO order_details....");
    }
}
