
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class F1 extends JFrame implements ActionListener{

    private JTextField tf;
    private JTextArea ta;
    private JPanel p1,p2;
    private JButton b1,b2;

    public F1(String titolo){
        super(titolo);
        //Istanzio i widgets
        tf = new JTextField();
        ta = new JTextArea();
        p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p2 = new JPanel(new GridLayout(1,0));
        b1 = new JButton("Inserisci");
        b2 = new JButton("Ok");
        //Posizione gli elementi
        add(tf,BorderLayout.NORTH);
        add(ta,BorderLayout.CENTER);
        p1.add(b1);
        p1.add(b2);
        p2.add(p1);
        add(p1, BorderLayout.SOUTH);
        //Registrazione Listener
        b1.addActionListener(this);
        b2.addActionListener(this);
        //Operazioni finali
        setSize(300,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            ta.setText(tf.getText());
        }if(e.getSource()==b2){
            ta.append(tf.getText());
        }
    }
