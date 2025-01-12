public class Application {
    public static void main(String args[])
    {
        MiaFinestra f1 = new MiaFinestra("Buona lezione",
        " alla classe 4CI", "Speriamo bene!!");
        
        f1.setLocation(500,300);
        f1.setSize(400,200);
        //nuova.setVisible(true);
        
        MiaFinestra2 f2 = new MiaFinestra2("Esempio combo box");
        f2.setSize(300,100);
        //f2.setVisible(true);

        MiaFinestra3 f3 = new MiaFinestra3("Esempio con text field");
        f3.setSize(300,100);
        f3.setLocation(500,300);
        f3.setVisible(true);
    }
}