package chainOfResponsibility2.classes;

public class NotificareMail extends ANotificator {

    @Override
    public void notificaClient(Client client, String notificare) {
        if(client.getMail()!=null){
            System.out.println(client.getNume()+ " a fost notifivat prin MAIL cu mesajul: "+notificare);
        }else{
            super.getUrmatorulNotificator().notificaClient(client,notificare);
        }
    }
}
