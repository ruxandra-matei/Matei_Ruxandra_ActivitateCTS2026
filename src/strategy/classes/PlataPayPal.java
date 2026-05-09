package strategy.classes;

public class PlataPayPal implements ModPlata{
    @Override
    public void plateste(String numeClient, double suma) {
        System.out.println("Clientul "+ numeClient+" a platit cu PAYPAL suma de " + suma);
    }
}
