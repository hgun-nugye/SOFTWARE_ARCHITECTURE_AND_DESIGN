package thuchanh.CA1_StreamData.feat_singleton;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    // Thể hiện duy nhất
    private static DataAccess instance;

    private List<MonHoc> dsMonHoc = new ArrayList<>();
    private Stream<List<MonHoc>> stream = new Stream<>();

    // Constructor private để không cho tạo mới từ bên ngoài
    private DataAccess() {}

    // Phương thức truy cập thể hiện duy nhất
    public static DataAccess getInstance() {
        if (instance == null) {
            instance = new DataAccess();
        }
        return instance;
    }

    public Stream<List<MonHoc>> getStream() {
        return stream;
    }

    public void themMonHoc(MonHoc mh){
        dsMonHoc.add(mh);
        stream.addEvent(new ArrayList<>(dsMonHoc));
    }

    public void capNhatMonHoc(String maMon, String tenMonMoi){
        for(MonHoc mh:dsMonHoc){
            if(mh.getMaMon().equals(maMon)){
                mh.setTenMon(tenMonMoi);
                stream.addEvent(new ArrayList<>(dsMonHoc));
                break;
            }
        }
    }

    public void xoaMonHoc(String maMon){
        dsMonHoc.removeIf(mh -> mh.getMaMon().equals(maMon));
        stream.addEvent(new ArrayList<>(dsMonHoc));
    }
}
