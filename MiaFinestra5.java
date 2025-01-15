import javax.swing.*;
import java.awt.*;

public class MiaFinestra4 extends JFrame{
    JPanel p1,p2,p3,p4;
    JTextField tf1,tf2;
    JButton b1;
    JLabel l1,l2;
    public MiaFinestra4 (String titolo){
        super(titolo);
        tf1=new JTextField();
        tf2=new JTextField();
        p1= new JPanel(new GridLayout(2,0));
        p2= new JPanel(new GridLayout(2,0));
        p3= new JPanel(new BorderLayout());
        p3= new JPanel(new BorderLayout());
        b1= new JButton("Converti");
        l1= new JLabel("Lire");
        l2= new JLabel("Euro");
        
        
        add(p1, BorderLayout.WEST);
        
        
        
        
        setSize(300,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }