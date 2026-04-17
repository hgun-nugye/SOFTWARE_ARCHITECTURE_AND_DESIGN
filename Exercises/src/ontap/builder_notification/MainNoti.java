package ontap.builder_notification;

public class MainNoti {
    public static void main(String[] args) {
        Notification noti = new NotificationBuilder()
                .setTitle("New Message")
                .setMessage("You have a new message!")
                .setIcon("message_icon.png")
                .setSound("notification_sound.mp3")
                .setPriority("High")
                .setActionButton("Reply")
                .build();
        System.out.println(noti);

        Notification n1 = new NotificationBuilder()
                .setTitle("Thông báo")
                .setMessage("Bạn có tin nhắn mới")
                .build();
        System.out.println(n1);
    }
}
