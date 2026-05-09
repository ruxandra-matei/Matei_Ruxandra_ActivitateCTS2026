package strategy.classes;

public class PlataCard implements ModPlata{

    @Override
    public void plateste(String numeClient, double suma) {
        System.out.println("Clientul "+ numeClient+" a platit cu Card suma de " + suma) ;
    }
}
