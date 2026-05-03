package observer.classes;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements IAgentie {

    private String nume;
    private List<Client> listaClienti = new ArrayList<>();

    public Agentie(String nume) {
        this.nume = nume;
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(Client client : listaClienti){
            client.receptioneazaMesaj(mesaj);
        }

    }

    @Override
    public void adaugaClient(Client client) {
        listaClienti.add(client);
    }

    @Override
    public void stergeClient(Client client) {
        listaClienti.remove(client);
    }


    public void notificaDiscount(){
        this.trimiteMesaj("A aparut un discount de pret! Intra sa verifici ofert");
    }

    public void notificaIntroducerePachet(){
        this.trimiteMesaj("S-a introdus un pachet pentru Thailanda");
    }


}
