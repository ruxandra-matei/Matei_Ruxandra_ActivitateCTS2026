package strategy.main;

import strategy.classes.Client;
import strategy.classes.PlataCard;
import strategy.classes.PlataCash;
import strategy.classes.PlataPayPal;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Andrei", 1, new PlataCash());
        client1.plateste(300);
        client1.setModPlata(new PlataCard());
        client1.plateste(500);
        client1.setModPlata(new PlataPayPal());
        client1.plateste(600);
    }
}
