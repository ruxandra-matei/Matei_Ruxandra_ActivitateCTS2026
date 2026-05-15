package chainOfResponsibility2.classes;

public class NotificareSMS extends ANotificator {


    @Override
    public void notificaClient(Client client, String notificare) {
        if(client.getNrTel()!=null){
            System.out.println(client.getNume()+ " a fost notifivat prin SMS cu mesajul: "+notificare);
        }
        else{
            super.getUrmatorulNotificator().notificaClient(client,notificare);
        }
    }


}
