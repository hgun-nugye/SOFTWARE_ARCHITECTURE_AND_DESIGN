package thuchanh.CA1_StreamData.feat_singleton;

import java.util.List;

public class Client implements Listener<List<MonHoc>> {
    private String name; // tên để phân biệt client

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(List<MonHoc> data) {
        System.out.println("[" + name + " - UI Update] - Danh sách môn học:");

        if (data == null || data.isEmpty()) {
            System.out.println("Danh sách trống");
        } else {
            for (MonHoc mh : data) {
                System.out.println(mh);
            }
        }
        System.out.println("---------------------------");
    }
}
