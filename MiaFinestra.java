import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;

public class MiaFinestra extends JFrame{
    
        private JLabel l1,l2,l3;
        
        public MiaFinestra(String l1, String l2, String l3){
            this.l1 = new JLabel(l1);
            this.l2 = new JLabel(l2);
            this.l3 = new JLabel(l3);
            setTitle("Mia Finestra");
            setLayout(new GridLayout(1,0));
            add(this.l1);
            add(this.l2);
            add(this.l3);
            
            //pack();
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(false);
        }
}