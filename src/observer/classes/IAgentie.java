package observer.classes;

public interface IAgentie {
    void notificare(IClient);
    void trimiteMesaj(String mesaj);
    void adaugaClient(Client client);
    void stergeClient(Client client);

}
