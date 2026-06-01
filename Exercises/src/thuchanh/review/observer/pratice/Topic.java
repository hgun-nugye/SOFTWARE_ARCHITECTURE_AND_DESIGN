package thuchanh.review.observer.pratice;

import java.util.ArrayList;
import java.util.List;

public class Topic implements ISubject {
    private List<IObserver> dsThanhVien = new ArrayList<>();
    private List<TinTuc> dsTin = new ArrayList<>();
    private int id = 1;


    @Override
    public void dangKy(IObserver observer) {
        dsThanhVien.add(observer);
    }

    @Override
    public void huyDangKy(IObserver observer) {
        dsThanhVien.remove(observer);
    }

    @Override
    public void thongBaoTinMoi(TinTuc tin) {
        for (IObserver tv : dsThanhVien) {
            tv.nhanTinMoi(tin);
        }
    }

    @Override
    public void thongBaoCapNhat(TinTuc tin) {
        for (IObserver tv : dsThanhVien) {
            tv.nhanTinCapNhat(tin);
        }
    }

    public void taoTinMoi(String noiDung){
        TinTuc tinMoi = new TinTuc(id++, noiDung);
        dsTin.add(tinMoi);
        System.out.println("[TOPIC] Da tao tin moi: " + noiDung);
        thongBaoTinMoi(tinMoi);
    }

    public void capNhatTin(int id, String noiDung){
        for(TinTuc tin: dsTin){
            if(tin.getId() == id){
                tin.setNoiDung(noiDung);
                System.out.println(" [TOPIC] Da cap nhat tin id " + id+ " thanh: "+ noiDung);
                thongBaoCapNhat(tin);
                return;
            }
        }
    }
}
