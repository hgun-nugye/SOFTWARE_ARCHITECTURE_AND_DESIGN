package behavioral.chain_of_responsibility.f88;

public class NhanVienChoVay extends NV_DuyetVay{
    NV_DuyetVay capTren;

    //đã có hàm thiết lập cấp trên, không constructor cho cấp trên của các NhanVienChoVay nữa
    public NhanVienChoVay(String ten, String chucVu, int hanMuc) {
        super(ten, chucVu, hanMuc);
    }

    @Override
    public NV_DuyetVay capTren(NV_DuyetVay capTren) {
        return this.capTren=capTren;
    }

    @Override
    public void duyetVay(int soTien) {
        if(soTien<= this.hanMuc){
            System.out.println(this.chucVu +" " + this.ten + " đồng ý duyệt khoản vay " + soTien);
        } else capTren.duyetVay(soTien);
    }
}
