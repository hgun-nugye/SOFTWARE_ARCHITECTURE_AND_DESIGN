package thuchanh.review.observer.pratice;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienB implements IObserver {
    private String ten;

    private List<TinTuc> dsTinNhanDuoc = new ArrayList<>();

    public ThanhVienB(String ten) {
        this.ten = ten;
    }

    @Override
    public void nhanTinMoi(TinTuc tin) {
        dsTinNhanDuoc.add(tin.copy());
        System.out.println("[" + ten + "] Da nhan tin moi. Toan bo tin hien co: ");
        for (int i = 0; i < dsTinNhanDuoc.size(); i++) {
            System.out.println("----" + (i + 1) + "." + dsTinNhanDuoc.get(i).getNoiDung());
        }
    }

    @Override
    public void nhanTinCapNhat(TinTuc tin) {
        for (TinTuc tinCuaB : dsTinNhanDuoc) {
            if (tinCuaB.getId() == tin.getId()) {
                tinCuaB.setNoiDung(tin.getNoiDung());
                System.out.println("[" + ten + "] Da tu cap nhat tin trong danh sach. Noi dung moi: " + tinCuaB.getNoiDung());
                break;
            }
        }
    }
}
