package designpatterns.observer.swing;
import java.awt.event.*;
/**
 *
 * @author user
 */
public class Login implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        this.checkLogin();
    }
    
    public boolean checkLogin(){
        System.out.println("Proses login...");
        return false;
    }
    
}
