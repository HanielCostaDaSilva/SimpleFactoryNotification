package model;

public class PushNotification implements Notification {

    @Override
    public void notifyUser(String message) {
        // TODO Auto-generated method stub
        System.out.println("Bop Bop \nPush Notification ====> " + message);
    }
    
}
