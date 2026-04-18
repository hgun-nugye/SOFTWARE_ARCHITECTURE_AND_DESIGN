package thuchanh.A6;

public class UI {
    private String uiName;

    public UI(String uiName) {
        this.uiName = uiName;
    }

    public void userInputAdd(SanPham sp) {
        IDataAccess dataAccess = DataAccessImpl.getInstance();
        dataAccess.add(sp);
        System.out.println(uiName + " thêm sản phẩm: " + sp);
    }

    public void userInputDelete(SanPham sp) {
        IDataAccess dataAccess = DataAccessImpl.getInstance();
        dataAccess.delete(sp);
        System.out.println(uiName + " xóa sản phẩm: " + sp.getMaSP());
    }

    public void showAll() {
        IDataAccess dataAccess = DataAccessImpl.getInstance();
        System.out.println("Danh sách sản phẩm hiện tại:");
        for (SanPham s : dataAccess.getAll()) {
            System.out.println(s);
        }
    }
}
