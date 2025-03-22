import javax.swing.*;
import java.awt.*;

public class LoginS extends JFrame{
    LoginS(String m1){
       super(m1);
    }
    LoginS(){

    }
    void setComponent(){
        JLabel l1=new JLabel("welcome");
        add(l1);
        setLayout(null);
        l1.setBounds(200,200,100, 40);
        JTextField t1=new JTextField();
        t1.setBounds(200, 200,100,30);
        add(t1);
    }
    public static void main(String []x){
        /**
        JFrame j1=new JFrame("welcome to facebook");
        j1.setVisible(true);
        j1.setSize(500,1100);
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         **/
    LoginS s1=new LoginS("welcome to subhadip de house");
    s1.setVisible(true);
    s1.setSize(1000,1000);
    s1.setDefaultCloseOperation(LoginS.EXIT_ON_CLOSE);
    s1.setComponent();

    }
}
