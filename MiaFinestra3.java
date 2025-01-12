import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiaFinestra3 extends JFrame implements ActionListener,DocumentListener{
    private JTextField tf1;
    private JLabel l1;
    private JButton ins,canc;
    private JPanel p1,p2,p21;
    
    public MiaFinestra3(String titolo)
    {
        super(titolo);
        //Istanzio Oggetti grafici
        tf1 = new JTextField();
        l1 = new JLabel();
        ins = new JButton("Inserisci");
        canc = new JButton("Cancella");
        p1 = new JPanel(new GridLayout(0,1));
        p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p21 = new JPanel(new GridLayout(1,0));
        //Posizionamento
        p21.add(ins);
        p21.add(canc);
        p2.add(p21);
        p1.add(tf1);
        p1.add(l1);
        add(p2,BorderLayout.SOUTH);
        add(p1,BorderLayout.NORTH);
        //Assegna gestore eventi
        ins.addActionListener(this);
        canc.addActionListener(this);
        tf1.getDocument().addDocumentListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==ins){
            l1.setText(tf1.getText());
            tf1.setText("");
            tf1.requestFocus();
        }
        if (e.getSource()==canc){
            tf1.setText("");
            l1.setText("");
            tf1.requestFocus();
        }
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        l1.setText(tf1.getText());
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        l1.setText(tf1.getText());
    }

    @Override
    public void changedUpdate(DocumentEvent e) {}
}