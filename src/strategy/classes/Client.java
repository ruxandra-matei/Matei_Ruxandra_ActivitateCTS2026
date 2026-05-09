package strategy.classes;

public class Client {
    private String nume;
    private ModPlata modPlata;
    private int id;

    public Client(String nume, ModPlata modPlata, int id) {
        this.nume = nume;
        this.modPlata = modPlata;
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }
    public void plateste(double suma){
        modPlata.plateste(this.nume, suma);
    }
}
