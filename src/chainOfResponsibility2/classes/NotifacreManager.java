package chainOfResponsibility2.classes;

public class NotifacreManager extends ANotificator {


    @Override
    public void notificaClient(Client client, String notificare) {
        System.out.println("Mnaagaer - clientul "+client.getNume()+" nu are detalii ");
    }
}
