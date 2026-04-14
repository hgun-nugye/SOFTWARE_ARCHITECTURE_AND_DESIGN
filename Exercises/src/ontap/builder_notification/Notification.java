package ontap.builder_notification;

public class Notification {
    String title;
    String message;
    String icon;
    String sound;
    String priority;
    String actionButton;

    public Notification() {
    }

    public Notification(String title, String message, String icon, String sound, String priority, String actionButton) {
        this.title = title;
        this.message = message;
        this.icon = icon;
        this.sound = sound;
        this.priority = priority;
        this.actionButton = actionButton;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NOTIFICATION DETAILS\n");
        sb.append("Title: ").append(title).append("\n");
        sb.append("Message: ").append(message).append("\n");
        sb.append("Icon: ").append(icon).append("\n");
        sb.append("Sound: ").append(sound).append("\n");
        sb.append("Priority: ").append(priority).append("\n");
        sb.append("Action Button: ").append(actionButton).append("\n");
        return sb.toString();
    }
}
