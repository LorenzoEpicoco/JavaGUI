import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiaFinestra6 extends JFrame implements ActionListener{
    private JPanel p1,p2;
    private JButton canc,inv,dup,b1,b2,b3;
    private JTextField tf;
   
    public MiaFinestra6 (String titolo){
        super(titolo);
        setLayout(new BorderLayout());
        tf=new JTextField();
        p1= new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p2= new JPanel(new GridLayout(0,3));
        b1= new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        inv=new JButton("INV");
        canc= new JButton("CANC");
        dup=new JButton("DUP");


        add(tf,BorderLayout.NORTH);
        p2.add(inv);
        p2.add(canc);
        p2.add(dup);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p1.add(p2);
        add(p1,BorderLayout.SOUTH);

        b1.addActionListener(this);
        

        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            tf.setText("1");
        }
    }
    
}