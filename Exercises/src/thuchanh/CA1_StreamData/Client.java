package thuchanh.CA1_StreamData;

import java.util.List;

public class Client implements Listener<List<MonHoc>>{

    @Override
    public void update(List<MonHoc> data) {
        System.out.println("[Client - UI Update] - Danh sách môn học: ");
        if (data.isEmpty()){
            System.out.println("Danh sách trống");
        }
        else {
            for(MonHoc mh: data){
                System.out.println(mh);
            }
        }
    }
}
