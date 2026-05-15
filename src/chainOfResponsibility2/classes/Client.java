package chainOfResponsibility2.classes;

public class Client {
    private String nume;
    private String mail;
    private String nrTel;

    public Client(String nume, String mail, String nrTel) {
        this.nume = nume;
        this.mail = mail;
        this.nrTel = nrTel;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNrTel() {
        return nrTel;
    }

    public void setNrTel(String nrTel) {
        this.nrTel = nrTel;
    }
}
