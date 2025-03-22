import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginS extends JFrame{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1,b2;

    LoginS(String m1){
       super(m1);
    }
    LoginS(){

    }
    void setComponent(){
        Cursor c1=new Cursor(Cursor.HAND_CURSOR);
        Font f1=new Font("Times New Roman",Font.ITALIC,30);
       /** JLabel l1=new JLabel("welcome");
        add(l1);
        setLayout(null);
        l1.setBounds(200,200,100, 40);
        JTextField t1=new JTextField();
        t1.setBounds(200, 200,100,30);
        add(t1); **/

    l1=new JLabel("WELCOME");
    l1.setForeground(Color.blue);
    l1.setFont(f1);
    l2=new JLabel("USERNAME");
    l3=new JLabel("PASSWORD");
    l4=new JLabel();
    t1=new JTextField();
    t2=new JTextField();
    b1=new JButton("LOGIN");
    b1.setCursor(c1);
    b1.setBackground(Color.green);
    b1.setForeground(Color.black);
    b2=new JButton("CLEAR");
    b2.setCursor(c1);
        b2.setBackground(Color.green);
        b2.setForeground(Color.black);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        setLayout(null);
    l1.setBounds(620,170,200,50);
    l2.setBounds(500,250,100,50);
    l3.setBounds(500,300,100,50);
    l4.setBounds(630,400,200,50);
    t1.setBounds(600,260,200,30);
    t2.setBounds(600,310,200,30);
    b1.setBounds(550,500,100,40);
    b2.setBounds(700,500,100,40);
    b1.addActionListener(new log());
    b2.addActionListener(new clearB());
    }
    public static void main(String []x){
        /**
        JFrame j1=new JFrame("welcome to facebook");
        j1.setVisible(true);
        j1.setSize(500,1100);
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         **/
    LoginS s1=new LoginS("Welcome Students");
    s1.setVisible(true);
    s1.setSize(1920,1080);
    s1.setDefaultCloseOperation(LoginS.EXIT_ON_CLOSE);
    s1.setComponent();

    }
    class log implements ActionListener{
        public void actionPerformed(ActionEvent e1) {
            String s1 = t1.getText();
            String s2 = t2.getText();
                if (s1.equals("subhadip") && s2.equals("12345")) {
                    JOptionPane.showMessageDialog(null,"Login Successful.");
                    l4.setText("Login Successful !");
                } else {
                    l4.setText("Login Unsuccessful !");
                }

        }
    }
    class clearB implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e1) {
            t1.setText(" ");
            t2.setText(" ");

        }
    }
}
