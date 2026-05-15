package chainOfResponsibility2.classes;

public abstract class ANotificator {

    private ANotificator urmatorulNotificator;


    public void setUrmatorulNotificator(ANotificator urmatorulNotificator) {
        this.urmatorulNotificator = urmatorulNotificator;
    }

    public ANotificator getUrmatorulNotificator() {
        return urmatorulNotificator;
    }

    public abstract void notificaClient(Client client, String notificare);
}
