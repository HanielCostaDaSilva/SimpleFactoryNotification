package model;

public class NullNotification implements Notification{

    @Override
    public void notifyUser(String message) {
        System.out.println("_____\n Null Notification Type, sorry but no message to you!'");
    }
    
}
