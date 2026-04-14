package ontap.builder_notification;

public class NotificationBuilder {
    String title;
    String message;
    String icon;
    String sound;
    String priority;
    String actionButton;

    public NotificationBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public NotificationBuilder setMessage(String message) {
        this.message = message;
        return this;

    }

    public NotificationBuilder setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public NotificationBuilder setSound(String sound) {
        this.sound = sound;
        return this;
    }

    public NotificationBuilder setPriority(String priority) {
        this.priority = priority;
        return this;
    }

    public NotificationBuilder setActionButton(String actionButton) {
        this.actionButton = actionButton;
        return this;
    }

    public Notification build(){
        return new Notification(title, message, icon, sound, priority, actionButton);
    }
}
