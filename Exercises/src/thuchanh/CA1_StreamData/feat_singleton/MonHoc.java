package thuchanh.CA1_StreamData.feat_singleton;

public class MonHoc {
    private String maMon;
    private String tenMon;

    public MonHoc(String maMon, String tenMon) {
        this.maMon = maMon;
        this.tenMon = tenMon;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    @Override
    public String toString() {
        return "-- [" + maMon + "] " + tenMon;
    }
}
