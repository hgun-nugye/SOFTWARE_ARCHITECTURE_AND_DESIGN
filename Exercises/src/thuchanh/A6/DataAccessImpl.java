package thuchanh.A6;

import java.util.ArrayList;
import java.util.List;

public class DataAccessImpl implements IDataAccess {
    private static DataAccessImpl instance;
    private List<SanPham> dsSanPham;

    private DataAccessImpl() {
        this.dsSanPham = new ArrayList<>();
    }

    public static DataAccessImpl getInstance() {
        if (instance == null) {
            instance = new DataAccessImpl();
        }
        return instance;
    }

    @Override
    public void add(SanPham sp) {
        for(int i=0; i<dsSanPham.size(); i++){
            if(dsSanPham.get(i).getMaSP().equals(sp.getMaSP())){
                System.out.println("Sản phẩm với mã " + sp.getMaSP() + " đã tồn tại. Không thể thêm.");
                return;
            }
        }
        this.dsSanPham.add(sp);
        System.out.println("Thêm sản phẩm thành công!");
    }

    @Override
    public void delete(SanPham sp) {
        boolean remove= this.dsSanPham.removeIf(maSP -> maSP.getMaSP().equals(sp.getMaSP()));
        if(remove){
            System.out.println("Xóa sản phẩm thành công!");
        }
        else{
            System.out.println("Sản phẩm với mã " + sp + " không tồn tại.");
        }
    }

    @Override
    public void update(SanPham sp) {
        for(int i=0; i<dsSanPham.size(); i++){
            if(dsSanPham.get(i).getMaSP().equals(sp.getMaSP())){
                dsSanPham.set(i, sp);
                System.out.println("Cập nhật sản phẩm thành công!");
                return;
            }
        }
    }

    @Override
    public List<SanPham> getAll() {
        return dsSanPham;
    }
}
