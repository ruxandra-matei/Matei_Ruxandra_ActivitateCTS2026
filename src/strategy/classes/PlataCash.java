package strategy.classes;

public class PlataCash implements  ModPlata{
    @Override
    public void plateste(String numeClient, double suma) {
        System.out.println("Clientul "+ numeClient+" a platit cu cash suma de " + suma);
    }
}
