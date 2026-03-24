package behavioral.chain_of_responsibility.f88;

public class ChuTich extends NV_DuyetVay{
    NV_DuyetVay capTren;

    public ChuTich(String ten, String chucVu, int hanMuc) {
        super(ten, chucVu, hanMuc);
    }

    @Override
    public NV_DuyetVay capTren(NV_DuyetVay capTren) {
        return null;
    }

    @Override
    public void duyetVay(int soTien) {
        if(soTien<=this.hanMuc){
            System.out.println(this.chucVu +" " + this.ten + " đồng ý duyệt khoản vay " + soTien);
        }
        else System.out.println("Công ty từ chối khoản vay " + soTien);
    }
}
