package observer.classes;

public interface IAgentie {
    void trimiteMesaj(String mesaj);
    void adaugaClient(Client client);
    void stergeClient(Client client);
}
