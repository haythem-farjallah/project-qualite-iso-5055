package haythem.cwe398;

public class EmailNotifier implements Notifier{
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("Sending Email to " + recipient + ": " + message);
    }
}
