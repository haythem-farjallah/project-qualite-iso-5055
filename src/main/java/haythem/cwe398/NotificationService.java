package haythem.cwe398;

public class NotificationService {
    public void sendEmailNotification(String recipient, String message) {
        // Send email notification
        System.out.println("Sending Email to " + recipient + ": " + message);
        // Email sending logic...
    }

    public void sendSMSNotification(String recipient, String message) {
        // Send SMS notification
        System.out.println("Sending SMS to " + recipient + ": " + message);
        // SMS sending logic...
    }

    public void sendPushNotification(String recipient, String message) {
        // Send push notification
        System.out.println("Sending Push Notification to " + recipient + ": " + message);
        // Push notification logic...
    }
}
