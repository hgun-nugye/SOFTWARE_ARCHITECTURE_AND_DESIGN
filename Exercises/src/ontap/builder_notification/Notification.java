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
        if (title != null) sb.append("Title: ").append(title).append("\n");
        if (message != null) sb.append("Message: ").append(message).append("\n");
        if (icon != null) sb.append("Icon: ").append(icon).append("\n");
        if (sound != null) sb.append("Sound: ").append(sound).append("\n");
        if (priority != null) sb.append("Priority: ").append(priority).append("\n");
        if (actionButton != null) sb.append("Action Button: ").append(actionButton).append("\n");
        return sb.toString();
    }
}
