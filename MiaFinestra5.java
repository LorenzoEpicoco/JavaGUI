//mport javax.swing.*;

import javafx.scene.layout.Border;

import java.awt.*;
import java.awt.event.*;

//public class MiaFinestra5 extends JFrame implements ActionListener{
    JPanel p1,p2,p3,p4,p5,p6;
    JTextField tf1,tf2;
    JButton b1;
    JLabel l1,l2;
    public MiaFinestra5 (String titolo){
        super(titolo);
        tf1=new JTextField();
        tf2=new JTextField();
        p1= new JPanel(new GridLayout(2,1));
        p2= new JPanel(new GridLayout(2,0));
        p3= new JPanel(new BorderLayout());
        p5 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p6= new JPanel(new FlowLayout(FlowLayout.LEFT));
        p4= new JPanel(new BorderLayout());
        b1= new JButton("Converti");
        l1= new JLabel("Lire");
        l2= new JLabel("Euro");
        
        setLayout(new BorderLayout());
        p1.add(l1);
        p1.add(l2);
        p2.add(tf1);
        p2.add(tf2);
        p3.add(p1,BorderLayout.WEST);
        p3.add(p2,BorderLayout.CENTER);
        p4.add(b1);
        add(p4,BorderLayout.SOUTH);
        add(p3,BorderLayout.NORTH);
        
        
        
        
        setSize(300,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
  //  public void actionPerformed(ActionEvent e){}
  //  }
//}