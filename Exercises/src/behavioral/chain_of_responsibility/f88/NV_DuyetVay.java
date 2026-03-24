package behavioral.chain_of_responsibility.f88;

public abstract class NV_DuyetVay {
    String ten, chucVu;
    int hanMuc;

    public NV_DuyetVay(String ten, String chucVu, int hanMuc) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.hanMuc = hanMuc;
    }

    public abstract NV_DuyetVay capTren(NV_DuyetVay capTren);
    public abstract void duyetVay(int soTien);
}
