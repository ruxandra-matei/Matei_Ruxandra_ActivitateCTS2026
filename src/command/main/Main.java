package command.main;

import command.classes.*;

public class Main {
    public static void main(String[] args) {
        IPachet pachet1 = new PachetTransport("Roma",300);
        IPachet pachet2 = new PachetCazare("Bali",900);

        IComanda comanda1 = new ComandaVanzare(pachet1);
        IComanda comanda2 = new ComandaRezervare(pachet1);

        IComanda comanda3 = new ComandaVanzare(pachet2);
        IComanda comanda4 = new ComandaRezervare(pachet2);

        Operator operator = new Operator();
        operator.efectueaza(comanda1);
        operator.efectueaza(comanda2);
        operator.efectueaza(comanda3);
        operator.efectueaza(comanda4);

    }
}
