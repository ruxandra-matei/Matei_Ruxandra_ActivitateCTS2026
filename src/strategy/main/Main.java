package strategy.main;

import strategy.classes.PlataPayPal;

public class Main {
    public static void maine(String[] args){
        Client client1 = new CLient(nume "Andrei", id: 1, new PlataCash());
        client1.plateste(suma 300);
        client1.setModPlata(new PlataCard());
        client1.plateste(suma 500);
        client1.setModPlata(new PlataPayPal());

    }
}
