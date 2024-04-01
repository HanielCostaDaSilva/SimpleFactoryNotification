package model;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser(String message) {
        System.out.println("Som de email \nEmail Notification ====> " + message);
    }
    
}
