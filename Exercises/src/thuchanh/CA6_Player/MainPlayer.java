package thuchanh.CA6_Player;

public class MainPlayer {
    public static void main(String[] args) {
       Dashboard db = new Dashboard();
       PlayerData playerData = new PlayerData();
       playerData.registerObserver(db);
        System.out.println("BẮT ĐẦU TRÒ CHƠI");
        playerData.setgameData(60, 10, 0);
        System.out.println("Nhân vật đào được vàng, điểm số tăng lên");
        playerData.setGrade(50);
        System.out.println("Nhân vật đào trúng bom, giảm thời gian");
        playerData.setgameData(30, 7, 50);
    }
}
