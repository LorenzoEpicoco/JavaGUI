import javax.swing.*;
import java.awt.*;
public class MiaFinestra2 extends JFrame {
    private JComboBox<String> cBox;
    
    public MiaFinestra2(String titolo)
    {
        this.setTitle(titolo);
        String lista[]=new String[10];
        for(int i=0;i<lista.length;i++)
            lista[i]="Elemento numero "+i;
        cBox=new JComboBox<String>(lista);
        add(cBox,BorderLayout.NORTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}