package chainOfResponsibility2.main;

import chainOfResposibility.classes.*;

public class Main {
    public static void main(String[] args) {
        ANotificator sms = new NotificareSMS();
        ANotificator mail = new NotificareMail();
        ANotificator manager = new NotifacreManager();

        sms.setUrmatorulNotificator(mail);
        mail.setUrmatorulNotificator(manager);

        Client client1 = new Client("Andrei","mail@gmail.com","078888");
        Client client2 = new Client("Ana",null,"078888");
        Client client3 = new Client("Maria","maria@gmail.com",null);
        Client client4 = new Client("Maria",null,null);

        sms.notificaClient(client1,"s-a redus pachetul turistic");
        sms.notificaClient(client2,"s-a redus pachetul turistic");
        sms.notificaClient(client3,"s-a redus pachetul turistic");
        sms.notificaClient(client4,"s-a redus pachetul turistic");

    }
}
