package model;

public class SMSNotification implements Notification {

    @Override
    public void notifyUser(String message) {
        // TODO Auto-generated method stub
        System.out.println("Trim Trim \nSMS Notification ====> " + message);
    }
    
}
