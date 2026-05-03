package observer.main;

import observer.classes.Agentie;
import observer.classes.Client;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(1,"Client1");
        Client client2 = new Client(2,"Client2");
        Client client3 = new Client(3,"Client3");

        Agentie agentie = new Agentie("Karpaten");
        agentie.adaugaClient(client1);
        agentie.adaugaClient(client2);
        agentie.adaugaClient(client3);

        agentie.notificaDiscount();
        agentie.notificaIntroducerePachet();
    }
}