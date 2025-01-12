import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MiaFinestra2 extends JFrame implements ActionListener{
    private JComboBox<String> cBox;
    private JLabel l1;
    
    public MiaFinestra2(String titolo) {
        this.setTitle(titolo);
        String lista[]=new String[10];
        for(int i=0;i<lista.length;i++)
            lista[i]="Elemento numero "+i;

        l1 = new JLabel("Scelta: ");
        cBox=new JComboBox<String>(lista);

        add(cBox,BorderLayout.NORTH);
        add(l1);

        cBox.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        l1.setText(cBox.getSelectedItem().toString());
    }
}