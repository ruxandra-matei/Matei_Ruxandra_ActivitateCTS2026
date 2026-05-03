package command.classes;

public class PachetTransport implements IPachet{

    private String destinatie;
    private int pret;

    public PachetTransport(String destinatie, int pret) {
        this.destinatie = destinatie;
        this.pret = pret;
    }

    @Override
    public void rezervaPachet() {
        System.out.println("s-a rezervat pachetul cu destinatia "+this.destinatie);
    }

    @Override
    public void vindePachet() {
        System.out.println("s-a vandut pachetul cu destinatia "+this.destinatie);
    }

}
