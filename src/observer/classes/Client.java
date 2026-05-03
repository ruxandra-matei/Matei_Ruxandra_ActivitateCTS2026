package observer.classes;

public class Client implements IClient{
    private int id;
    private String nume;

    public Client(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println(this.nume+" a primit mesajul: "+mesaj);
    }
}
