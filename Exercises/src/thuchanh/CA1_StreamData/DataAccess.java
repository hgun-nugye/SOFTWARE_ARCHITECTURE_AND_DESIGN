package thuchanh.CA1_StreamData;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private List<MonHoc> dsMonHoc = new ArrayList<>();

    private Stream<List<MonHoc>> stream = new Stream<>();

    public Stream<List<MonHoc>> getStream() {
        return stream;
    }

    public void themMonHoc(MonHoc mh){
        dsMonHoc.add(mh);
        stream.addEvent(dsMonHoc);
    }

    public void capNhatMonHoc(String maMon, String tenMonMoi){
        for(MonHoc mh:dsMonHoc){
            if(mh.getMaMon().equals(maMon)){
                mh.setTenMon(tenMonMoi);
                stream.addEvent(dsMonHoc);
                break;
            }
        }
    }

    public void xoaMonHoc(String maMon){
        dsMonHoc.removeIf(mh ->mh.getMaMon().equals(maMon));
        stream.addEvent(dsMonHoc);
    }
}
