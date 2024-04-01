import model.Notification;
import service.NotificationFactory;

public final class NotificationService{
    public static void main(String[] args) {
        NotificationFactory nf = new NotificationFactory();

        Notification n1 = nf.createNotification("Email");
        n1.notifyUser("Nem as luzes das cidades,");
        Notification n2 = nf.createNotification("Push");
        n2.notifyUser("Nem o brilho das estrelas,");
        Notification n3 = nf.createNotification("SMS");
        n3.notifyUser("Conseguem se comparar ao ");
        Notification n4 = nf.createNotification(null);
        n4.notifyUser("Brilho dos teus olhos. ");
    }
}