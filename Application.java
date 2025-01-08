public class Application {
    public static void main(String args[])
    {
        MiaFinestra nuova = new MiaFinestra("Buona lezione",
        " alla classe 4CI", "Speriamo bene!!");
        
        nuova.setLocation(500,300);
        nuova.setSize(400,200);
        nuova.setVisible(true);
    }
}